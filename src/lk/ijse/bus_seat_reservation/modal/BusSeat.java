
package lk.ijse.bus_seat_reservation.modal;


public class BusSeat {
        private String seat_id;
        private String bus_id;
        private String status;
        private String date;

    public BusSeat() {
    }

    public BusSeat(String seat_id, String bus_id, String status, String date) {
        this.seat_id = seat_id;
        this.bus_id = bus_id;
        this.status = status;
        this.date = date;
    }

    /**
     * @return the seat_id
     */
    public String getSeat_id() {
        return seat_id;
    }

    /**
     * @param seat_id the seat_id to set
     */
    public void setSeat_id(String seat_id) {
        this.seat_id = seat_id;
    }

    /**
     * @return the bus_id
     */
    public String getBus_id() {
        return bus_id;
    }

    /**
     * @param bus_id the bus_id to set
     */
    public void setBus_id(String bus_id) {
        this.bus_id = bus_id;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "BusSeat{" + "seat_id=" + seat_id + ", bus_id=" + bus_id + ", status=" + status + ", date=" + date + '}';
    }
        
        

}