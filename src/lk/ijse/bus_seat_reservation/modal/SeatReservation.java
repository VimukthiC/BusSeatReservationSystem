
package lk.ijse.bus_seat_reservation.modal;

public class SeatReservation {
    private String reservation_id;
    private String seat_id;
    private String booking_date;
    private String status;
    private String number_of_reseved_seat;
    private String price;

    public SeatReservation() {
    }

    public SeatReservation(String reservation_id, String seat_id, String booking_date, String status, String number_of_reseved_seat, String price) {
        this.reservation_id = reservation_id;
        this.seat_id = seat_id;
        this.booking_date = booking_date;
        this.status = status;
        this.number_of_reseved_seat = number_of_reseved_seat;
        this.price = price;
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
     * @return the booking_date
     */
    public String getBooking_date() {
        return booking_date;
    }

    /**
     * @param booking_date the booking_date to set
     */
    public void setBooking_date(String booking_date) {
        this.booking_date = booking_date;
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
     * @return the number_of_reseved_seat
     */
    public String getNumber_of_reseved_seat() {
        return number_of_reseved_seat;
    }

    /**
     * @param number_of_reseved_seat the number_of_reseved_seat to set
     */
    public void setNumber_of_reseved_seat(String number_of_reseved_seat) {
        this.number_of_reseved_seat = number_of_reseved_seat;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SeatReservation{" + "reservation_id=" + reservation_id + ", seat_id=" + seat_id + ", booking_date=" + booking_date + ", status=" + status + ", number_of_reseved_seat=" + number_of_reseved_seat + ", price=" + price + '}';
    }

    
    
}