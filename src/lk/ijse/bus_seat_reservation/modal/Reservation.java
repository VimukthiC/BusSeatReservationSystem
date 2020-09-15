
package lk.ijse.bus_seat_reservation.modal;

import java.util.ArrayList;

public class Reservation {
        private String reservation_id;
        private String officer_id;
	private String passenger_id;
	private String reservation_date;
	private String shedule_id;
        private ArrayList<SeatReservation> list;

    public Reservation() {
    }

    public Reservation(String reservation_id, String officer_id, String passenger_id, String reservation_date, String shedule_id, ArrayList<SeatReservation> list) {
        this.reservation_id = reservation_id;
        this.officer_id = officer_id;
        this.passenger_id = passenger_id;
        this.reservation_date = reservation_date;
        this.shedule_id = shedule_id;
        this.list = list;
    }

    public Reservation(String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the reservation_id
     */
    public String getReservation_id() {
        return reservation_id;
    }

    /**
     * @param reservation_id the reservation_id to set
     */
    public void setReservation_id(String reservation_id) {
        this.reservation_id = reservation_id;
    }

    /**
     * @return the officer_id
     */
    public String getOfficer_id() {
        return officer_id;
    }

    /**
     * @param officer_id the officer_id to set
     */
    public void setOfficer_id(String officer_id) {
        this.officer_id = officer_id;
    }

    /**
     * @return the passenger_id
     */
    public String getPassenger_id() {
        return passenger_id;
    }

    /**
     * @param passenger_id the passenger_id to set
     */
    public void setPassenger_id(String passenger_id) {
        this.passenger_id = passenger_id;
    }

    /**
     * @return the reservation_date
     */
    public String getReservation_date() {
        return reservation_date;
    }

    /**
     * @param reservation_date the reservation_date to set
     */
    public void setReservation_date(String reservation_date) {
        this.reservation_date = reservation_date;
    }

    /**
     * @return the shedule_id
     */
    public String getShedule_id() {
        return shedule_id;
    }

    /**
     * @param shedule_id the shedule_id to set
     */
    public void setShedule_id(String shedule_id) {
        this.shedule_id = shedule_id;
    }

    /**
     * @return the list
     */
    public ArrayList<SeatReservation> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<SeatReservation> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Reservation{" + "reservation_id=" + reservation_id + ", officer_id=" + officer_id + ", passenger_id=" + passenger_id + ", reservation_date=" + reservation_date + ", shedule_id=" + shedule_id + ", list=" + list + '}';
    }
    
    
    
        
        
}
