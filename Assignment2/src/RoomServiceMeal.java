/*Create an interface RestaurantMeal that holds the name and price of a food item served by a 
restaurant. The name is initialized as steak dinner and price is initialized as 600. Create an 
interface HotelService that holds the name of the service, the service fee, and the room number 
to which the service was supplied. Initialize the service as room service, service fee as Rs 24, 
and room number as 1202. Create a RoomServiceMeal class that inherits from both 
RestaurantMeal and HotelService. The RoomServiceMeal class consists of display method
() to display the value of members of interface. Additionally, the display function should 
display the total of the meals plus the room service fee. In a main () function, instantiate a 
RoomServiceMeal object.*/

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
