
package lk.ijse.bus_seat_reservation.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.bus_seat_reservation.db.DBConnection;
import lk.ijse.bus_seat_reservation.modal.PassengerInformation;


public class PassengerInformationController {
    public String getPassengerId() throws ClassNotFoundException, SQLException {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT passenger_id FROM passenger ORDER BY passenger_id DESC LIMIT 1").executeQuery();

        if (set.next()) {
            String tempId = set.getString(1);
            String[] arr = tempId.split("P");
            int passenger_id = Integer.parseInt(arr[1]);
            passenger_id += 1;
            if (passenger_id < 10) {
                return "P00" + passenger_id;
            } else if (passenger_id < 100) {
                return "P0" + passenger_id;
            } else {
                return "P" + passenger_id;
            }
        } else {
            return "P001";
        } 
    }

    public boolean savePassengerInformation(PassengerInformation p1) throws ClassNotFoundException, SQLException {
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("INSERT INTO passenger VALUES(?,?,?,?)");
        stm.setString(1, p1.getPassenger_id());
        stm.setString(2, p1.getName());
        stm.setString(3, p1.getNic());
        stm.setString(4, p1.getPhone_number());
       
        return stm.executeUpdate()>0;
    }
}
