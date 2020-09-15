
package lk.ijse.bus_seat_reservation.modal;

public class Bus {
    
    private String  bus_id ;
    private String bus_name ;
    private String bus_category ;
    private int quantity_of_seat ;

    public Bus() {
    }

    public Bus(String bus_id, String bus_name, String bus_category, int quantity_of_seat) {
        this.bus_id = bus_id;
        this.bus_name = bus_name;
        this.bus_category = bus_category;
        this.quantity_of_seat = quantity_of_seat;
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
     * @return the bus_name
     */
    public String getBus_name() {
        return bus_name;
    }

    /**
     * @param bus_name the bus_name to set
     */
    public void setBus_name(String bus_name) {
        this.bus_name = bus_name;
    }

    /**
     * @return the bus_category
     */
    public String getBus_category() {
        return bus_category;
    }

    /**
     * @param bus_category the bus_category to set
     */
    public void setBus_category(String bus_category) {
        this.bus_category = bus_category;
    }

    /**
     * @return the quantity_of_seat
     */
    public int getQuantity_of_seat() {
        return quantity_of_seat;
    }

    /**
     * @param quantity_of_seat the quantity_of_seat to set
     */
    public void setQuantity_of_seat(int quantity_of_seat) {
        this.quantity_of_seat = quantity_of_seat;
    }

   
}
