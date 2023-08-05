
import java.util.Scanner;
import java.util.Iterator;
import java.util.Random;
public class Hotel {

	/*
	 * Major parts of the Hotel Class 
	 * - Name of all hotels
	 * - Rooms in each hotel
	 * - Booking the rooms in a Hotel
	 * - Canceling the booking of the room
	 * - Checking for pre-booked rooms
	 * - Showing all hotels in the Area
	 */
	Scanner in = new Scanner(System.in);
	private String hotelName;
	private int numRooms;
	private int bookedRooms;
	private MyArrayList<Integer> bookingNumber = new MyArrayList<Integer>();;
	Random random = new Random();
	private int randomNumber;
			
						
	public Hotel(String hotelName,  int nRooms) {
		setHotelName(hotelName);
		this.numRooms = nRooms;
		bookedRooms = 0;
	
	}// end of our Constructor-initializing our rooms with 4 for each hotel having 4 rooms

								//Setters and Getters
	public String getHotelName() {
		return hotelName;
	}// getter

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}// setter
	
				//Booking a room in the hotel
	public void addBooking(int nights) {
		while(nights < 1 || nights > 15) {
			System.out.println("Your Room Can't Be Booked For This Number Of Nights, Kindly"
					+ " Enter Again!!!");
			nights = in.nextInt();
			in.nextLine();
		}
		if(bookedRooms < this.numRooms) {
			randomNumber = random.nextInt(11111, 99999);
		
			while(bookingNumber.contains(randomNumber)) {
				randomNumber = random.nextInt(11111, 99999);
			}// while-loop checking for duplicate random numbers
			bookingNumber.add(randomNumber);
			
			System.out.println("Your Room Has Been Booked For "+nights+"  Nights, "
					+ "Your Booking Number"
					+ "Is "+randomNumber+" Please Keep This Number With You As It Will Be"
							+ " Used For Checking In into Your Hotel And Also For Cancelling"
							+ " The Booking, Thank You!!!");
			
			bookedRooms++;
		}// if rooms are available
		else {
			System.out.println("Sorry For The Inconveneince But This Hotel Is Completely Booked "
					+ "For The Night");
		}// if rooms are not available
	}// end of booking-Method
	
	public  void cancelBooking(int bookingNum) {
		if(bookedRooms > 0) {
			if(bookingNumber.contains(bookingNum)) {
				System.out.println("We Are Sad To See You Cancel Your Booking, Hopefully"
						+ "You'll Be Styaing With Us In The Near Future, Thank You!!!");
				bookedRooms--;
			}// checking if the number exsists in our ArrayList
			else {
				System.out.println("No Such Booking Exsists With This Number");
			}// if the booking number does'nt exsist
		}// checking to see if any rooms were booked in the first place
		else {
			System.out.println("Sorry, To Inform You But There Are No Bookings To Cancel,"
					+ "As No Bookings Have Been Made Soo Far");
		}// if there were no bookings ever made
	}// end of cancelBooking
	
	
	
	
}// end of class
