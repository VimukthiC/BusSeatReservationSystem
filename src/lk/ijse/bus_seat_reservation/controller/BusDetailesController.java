
package lk.ijse.bus_seat_reservation.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.bus_seat_reservation.db.DBConnection;
import lk.ijse.bus_seat_reservation.modal.Bus;

/**
 *
 * @author vimukthi
 */
public class BusDetailesController {

    public List<Bus> getAllBus() throws ClassNotFoundException, SQLException {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM bus").executeQuery();
        
        List<Bus> temp=new ArrayList();
        
        while(set.next()){
            temp.add(new Bus(
                set.getString(1),
                set.getString(2),
                set.getString(3),
                set.getInt(4)
                ));
        }
        return temp;
        
    }
    
}
