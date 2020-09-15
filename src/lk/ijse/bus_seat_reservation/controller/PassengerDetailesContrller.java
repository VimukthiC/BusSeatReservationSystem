
package lk.ijse.bus_seat_reservation.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.bus_seat_reservation.db.DBConnection;
import lk.ijse.bus_seat_reservation.modal.PassengerInformation;

/**
 *
 * @author vimukthi
 */
public class PassengerDetailesContrller {

    public List<PassengerInformation> getAllPassenger() throws ClassNotFoundException, SQLException {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM passenger").executeQuery();
        
        List<PassengerInformation> temp=new ArrayList();
        
        while(set.next()){
            temp.add(new PassengerInformation(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4)
            ));
        }
        return temp;
    }
    
}
