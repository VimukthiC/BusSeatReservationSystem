
package lk.ijse.bus_seat_reservation.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.bus_seat_reservation.db.DBConnection;
import lk.ijse.bus_seat_reservation.modal.SeatReservation;




public class SeatBookingController {

    public boolean saveSeatReservation(ArrayList<SeatReservation> list) throws ClassNotFoundException, SQLException {
        for (SeatReservation temp : list) {
            PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO seat_reservation VALUES(?,?,?,?,?,?)");

            stm.setObject(1, temp.getReservation_id());
            stm.setObject(2, temp.getSeat_id());
            stm.setObject(3, temp.getBooking_date());
            stm.setObject(4, temp.getStatus());
            stm.setObject(5, temp.getNumber_of_reseved_seat());
            stm.setObject(6, temp.getPrice());

            boolean issaved = stm.executeUpdate() > 0;
            if (!issaved) {
                return false;
            }
        }
        return true;
    }

    

//    public List<BusSeat> getBusSeat(String busid,String date) throws ClassNotFoundException, SQLException {
//        Connection connection = DBConnection.getInstance().getConnection();
//        ResultSet set = connection.prepareStatement("SELECT * FROM seat WHERE bus_id='"+busid+"' AND date='"+date+"'").executeQuery();
//        List<BusSeat> tempList = new ArrayList();
//        while (set.next()) {
//            tempList.add(new BusSeat(
//                    set.getString(1),
//                    set.getString(2),
//                    set.getString(3),
//                    set.getString(4)
//            ));
//        }
//        return tempList;
//    }

//    public boolean saveSeatReservation(SeatReservation r1) throws ClassNotFoundException, SQLException {
//        Connection con=DBConnection.getInstance().getConnection();
//        PreparedStatement stm = con.prepareStatement("INSERT INTO seat_reservation VALUES(?,?,?,?,?,?)");
//        stm.setString(1, r1. getReservation_id());
//        stm.setString(2, r1.getSeat_id());
//        stm.setString(3, r1.getBooking_date());
//        stm.setString(4, r1.getStatus());
//        stm.setString(5, r1.getNumber_of_reseved_seat());
//        stm.setString(6, r1.getPrice());
//       
//        return stm.executeUpdate()>0;
//    }

   

//    public boolean setstatus(String seatId,String date) throws ClassNotFoundException, SQLException {
//       Connection con=DBConnection.getInstance().getConnection();
//        PreparedStatement set = con.prepareStatement("UPDATE seat SET status=? WHERE seat_id ='"+seatId+"' AND date='"+date+"'"); 
//        set.setString(1, "Booked");
//        
//        return set.executeUpdate()>0;
//    }
    
}
    

