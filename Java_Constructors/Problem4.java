package Java_Constructors;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
}

public class Problem4 {
	public static void main(String[] args) {
		HotelBooking booking1 = new HotelBooking();
	    booking1.display();

	    // Using parameterized constructor
	    HotelBooking booking2 = new HotelBooking("Yanshi", "Deluxe", 3);
	    booking2.display();

	    // Using copy constructor
	    HotelBooking booking3 = new HotelBooking(booking2);
	    booking3.display();
	}

}
