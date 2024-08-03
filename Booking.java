import java.util.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking {
String passengerName;
int busNo;
Date date;
Booking(Scanner scanner){
	System.out.println("Enter name of passenger: ");
    passengerName=scanner.nextLine();	
	//bus no validation 
    while(true) {
    	System.out.println("Enter the bus no:");
    	if(scanner.hasNextInt()) {
    		busNo=scanner.nextInt();
    		scanner.nextLine();
    	    break; 
    	}
    	else {
    		System.out.println("Invalid input.Please enter a valid bus number");
    		scanner.nextLine();
    	}
    	
    }
    System.out.println("Enter the date dd-mm-yyyy");
    String dateInput=scanner.nextLine();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
  try {
	  date = dateFormat.parse(dateInput);
  }
  catch(ParseException e) {
	  e.printStackTrace();
  }
}//booking constructor ends...
public boolean isAvailable() throws SQLException {
	BusDAO busdao=new BusDAO();
	BookingDAO bookingdao=new BookingDAO();
	int capacity=busdao.getCapacity(busNo);
	int booked=bookingdao.getBookedCount(busNo,date);
	return booked<capacity;
   }
}
