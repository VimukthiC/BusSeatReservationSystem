
package lk.ijse.bus_seat_reservation.modal;

public class PassengerInformation {
        private String passenger_id;
	private String name;
	private String nic;
	private String phone_number;

    public PassengerInformation() {
    }

    public PassengerInformation(String passenger_id, String name, String nic, String phone_number) {
        this.passenger_id = passenger_id;
        this.name = name;
        this.nic = nic;
        this.phone_number = phone_number;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the phone_number
     */
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * @param phone_number the phone_number to set
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
        
    
        
}
