package bookings;
import java.lang.*;
import java.*;
public class SeatReservationDemo {

    public static void main(String[] args) throws ReservationException {
		//System.out.println(args[0]);
        SeatReservationManager manager = new SeatReservationManager();
       	for (int i = 0; i < 5; ++i){
       		for(int j =1;j<20;++j){
       			
       			Seat s1 = new Seat(((char)('A'+i*3/2)),(1+j));
        
				Customer c = new Customer();
				manager.reserve(s1,c);
				manager.reserveNextFree(c);
				manager.unreserve(s1);
        }
       	}
    }
    
}
