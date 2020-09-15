
package lk.ijse.bus_seat_reservation.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.bus_seat_reservation.db.DBConnection;
import lk.ijse.bus_seat_reservation.modal.BusSchedule;
import lk.ijse.bus_seat_reservation.modal.BusSeat;
import lk.ijse.bus_seat_reservation.modal.Reservation;
import lk.ijse.bus_seat_reservation.modal.SeatReservation;

public class TicketBookingController {
     
    public String getBookingId() throws ClassNotFoundException, SQLException {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT reservation_id FROM reservation ORDER BY reservation_id DESC LIMIT 1").executeQuery();

        if (set.next()) {
            String tempId = set.getString(1);
            String[] arr = tempId.split("R");
            int reservation_id = Integer.parseInt(arr[1]);
            reservation_id += 1;
            if (reservation_id < 10) {
                return "R00" + reservation_id;
            } else if (reservation_id < 100) {
                return "R0" + reservation_id;
            } else {
                return "R" + reservation_id;
            }
        } else {
            return "R001";
        }
    }

  

    public List<BusSchedule> getAllBusSchedule() throws ClassNotFoundException, SQLException {
      
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet set = connection.prepareStatement("SELECT * FROM bus_shedule").executeQuery();
        List<BusSchedule> tempList = new ArrayList();
        while (set.next()) {
            tempList.add(new BusSchedule(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5),
                    set.getString(6),
                    set.getDouble(7)
                   
            ));
        }
        return tempList;
    }

    public boolean saveReservation(Reservation r2) throws ClassNotFoundException, SQLException {
        Connection c = DBConnection.getInstance().getConnection();
        
        try {
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("INSERT INTO reservation VALUES(?,?,?,?,?)");
        
        c.setAutoCommit(false);
        
        
        stm.setString(1, r2. getReservation_id());
        stm.setString(2, r2.getOfficer_id());
        stm.setString(3, r2.getPassenger_id());
        stm.setString(4, r2.getReservation_date());
        stm.setString(5, r2.getShedule_id());
       
        if(stm.executeUpdate()>0){
           boolean saveDetails= new SeatBookingController().saveSeatReservation(r2.getList());
            
           if(saveDetails){
                c.commit();
                return true;
           }else{
                c.rollback();
           }
        }
         } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicketBookingController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TicketBookingController.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            c.setAutoCommit(true);
        }
        return false;
    }

    
    public List<BusSchedule> getAllSelectedBusSchedule(String from, String to) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet set = connection.prepareStatement("SELECT * FROM bus_shedule WHERE depature_place='"+from+"' AND arrival_place='"+to+"'").executeQuery();
        List<BusSchedule> tempList = new ArrayList();
        while (set.next()) {
            tempList.add(new BusSchedule(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5),
                    set.getString(6),
                    set.getDouble(7)
                   
            ));
        }
        return tempList;
    }

    public boolean loadSeat(String busid, String date) throws ClassNotFoundException, SQLException {
      
        for (int i = 1; i <=20; i++) {
            
            String status="Unbooked";
           
            Connection con=DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("INSERT INTO seat(bus_id,status,date) VALUES(?,?,?)");
            stm.setString(1,busid);
            stm.setString(2,status);
            stm.setString(3,date);
            
            return stm.executeUpdate()>0;
        }
        return false;
        
    }

     public List<BusSeat> getBusSeat(String busid,String date) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet set = connection.prepareStatement("SELECT * FROM seat WHERE bus_id='"+busid+"' AND date='"+date+"'").executeQuery();
        List<BusSeat> tempList = new ArrayList();
        while (set.next()) {
            tempList.add(new BusSeat(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4)
            ));
        }
        return tempList;
    }
     
     
    public boolean setstatus(String seatId,String date) throws ClassNotFoundException, SQLException {
       Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement set = con.prepareStatement("UPDATE seat SET status=? WHERE seat_id ='"+seatId+"' AND date='"+date+"'"); 
        set.setString(1, "Booked");
        
        return set.executeUpdate()>0;
    } 
    
     public boolean saveSeatReservation(SeatReservation r1) throws ClassNotFoundException, SQLException {
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("INSERT INTO seat_reservation VALUES(?,?,?,?,?,?)");
        stm.setString(1, r1. getReservation_id());
        stm.setString(2, r1.getSeat_id());
        stm.setString(3, r1.getBooking_date());
        stm.setString(4, r1.getStatus());
        stm.setString(5, r1.getNumber_of_reseved_seat());
        stm.setString(6, r1.getPrice());
       
        return stm.executeUpdate()>0;
    }
   

   
}
