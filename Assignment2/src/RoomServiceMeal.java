

public class RoomServiceMeal implements RestaurnatMeal, HotelService{
	void display() {
	    
		double total = price + serviceFee;
		System.out.println("Name: " + name);
	     System.out.println("Price: Rs " + price);
	     
		System.out.println("Service Name: " + serviceName);
	     System.out.println("Service Fee: Rs " + serviceFee);
	    
		System.out.println("Room Number: " + roomNumber);
	     System.out.println("Total Cost: Rs " + total);
	 }
}
