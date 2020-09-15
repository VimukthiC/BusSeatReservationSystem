
package lk.ijse.bus_seat_reservation.modal;

public class Officer {
        private String   officer_id ;
	private String officer_name ;
	private String officer_nic ;
	private String password ;
	private String phone_number ;
	private String email ;

    public Officer() {
    }

    public Officer(String officer_id, String officer_name, String officer_nic, String password, String phone_number, String email) {
        this.officer_id = officer_id;
        this.officer_name = officer_name;
        this.officer_nic = officer_nic;
        this.password = password;
        this.phone_number = phone_number;
        this.email = email;
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
     * @return the officer_name
     */
    public String getOfficer_name() {
        return officer_name;
    }

    /**
     * @param officer_name the officer_name to set
     */
    public void setOfficer_name(String officer_name) {
        this.officer_name = officer_name;
    }

    /**
     * @return the officer_nic
     */
    public String getOfficer_nic() {
        return officer_nic;
    }

    /**
     * @param officer_nic the officer_nic to set
     */
    public void setOfficer_nic(String officer_nic) {
        this.officer_nic = officer_nic;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Officer{" + "officer_id=" + officer_id + ", officer_name=" + officer_name + ", officer_nic=" + officer_nic + ", password=" + password + ", phone_number=" + phone_number + ", email=" + email + '}';
    }
        
        
}
