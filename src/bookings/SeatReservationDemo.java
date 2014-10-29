package bookings;

public class SeatReservationDemo {

    public static void main(String[] args) throws ReservationException {

        SeatReservationManager manager = new SeatReservationManager()
        for (int i = 0; i < 5; ++i){
            Customer c = new Customer();
            manager.reserveNextFree(c);
        }
        
    }
    
}
