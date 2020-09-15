
package lk.ijse.bus_seat_reservation.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.bus_seat_reservation.db.DBConnection;

public class LogInController {

   

    public boolean getUserNamePassword(String userNameUI, String userPasswordUI) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=connection.prepareStatement("SELECT * FROM Officer WHERE officer_name='"+userNameUI+"' AND password='"+userPasswordUI+"' ").executeQuery();
             if(set.next()){
            return true;
            
        }
        return false;
    }
    
}
