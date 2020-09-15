
package lk.ijse.bus_seat_reservation.modal;

public class BusSchedule {
    
        private String shedule_id;
	private String bus_id;
	private String depature_place;
	private String arrival_place;
	private String depature_time;
	private String arrival_time;
	private double fare;

    public BusSchedule() {
    }

    public BusSchedule(String shedule_id, String bus_id, String depature_place, String arrival_place, String depature_time, String arrival_time, double fare) {
        this.shedule_id = shedule_id;
        this.bus_id = bus_id;
        this.depature_place = depature_place;
        this.arrival_place = arrival_place;
        this.depature_time = depature_time;
        this.arrival_time = arrival_time;
        this.fare = fare;
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
     * @return the depature_place
     */
    public String getDepature_place() {
        return depature_place;
    }

    /**
     * @param depature_place the depature_place to set
     */
    public void setDepature_place(String depature_place) {
        this.depature_place = depature_place;
    }

    /**
     * @return the arrival_place
     */
    public String getArrival_place() {
        return arrival_place;
    }

    /**
     * @param arrival_place the arrival_place to set
     */
    public void setArrival_place(String arrival_place) {
        this.arrival_place = arrival_place;
    }

    /**
     * @return the depature_time
     */
    public String getDepature_time() {
        return depature_time;
    }

    /**
     * @param depature_time the depature_time to set
     */
    public void setDepature_time(String depature_time) {
        this.depature_time = depature_time;
    }

    /**
     * @return the arrival_time
     */
    public String getArrival_time() {
        return arrival_time;
    }

    /**
     * @param arrival_time the arrival_time to set
     */
    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    /**
     * @return the fare
     */
    public double getFare() {
        return fare;
    }

    /**
     * @param fare the fare to set
     */
    public void setFare(double fare) {
        this.fare = fare;
    }
        
        
    
}
