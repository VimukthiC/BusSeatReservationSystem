
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
}
    

