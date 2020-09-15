
package lk.ijse.bus_seat_reservation.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.bus_seat_reservation.db.DBConnection;


public class DashBoardController {

    public int passengerCount() throws ClassNotFoundException, SQLException {
        
        Connection conn = DBConnection.getInstance().getConnection();
        ResultSet rst = conn.prepareStatement("SELECT COUNT(*) FROM passenger").executeQuery();
        if(rst.next()){
        return rst.getInt(1);
        }
        return 0; 
    }

    public int getbusCount() throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        ResultSet rst = conn.prepareStatement("SELECT COUNT(*) FROM bus").executeQuery();
        
        if(rst.next()){
            return rst.getInt(1);
        }
        return 0;   
    }

    public double getEarning() throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        ResultSet rst = conn.prepareStatement("SELECT SUM(price) FROM seat_reservation").executeQuery();
        
        if(rst.next()){
            return rst.getDouble(1);
        }
        return 0;   
    }
    
    
}
