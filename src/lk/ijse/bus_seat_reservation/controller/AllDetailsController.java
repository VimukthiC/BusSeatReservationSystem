
package lk.ijse.bus_seat_reservation.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.bus_seat_reservation.db.DBConnection;
import lk.ijse.bus_seat_reservation.modal.PassengerInformation;
import lk.ijse.bus_seat_reservation.modal.Reservation;

public class AllDetailsController {

    public List<PassengerInformation> getAllPassenger() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet set = connection.prepareStatement("SELECT * FROM passenger").executeQuery();
        List<PassengerInformation> tempList = new ArrayList();
        while (set.next()) {
            tempList.add(new PassengerInformation(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4)
            ));
        }
return tempList;
    }

    public List<Reservation> getAllReservation() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        ResultSet set = connection.prepareStatement("SELECT * FROM reservation").executeQuery();
        List<Reservation> tempList = new ArrayList();
        while (set.next()) {
            tempList.add(new Reservation(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5)
                   
            ));
        }
return tempList;
    }
    
}
