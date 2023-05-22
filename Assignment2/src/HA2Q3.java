/*Write a Java code that would represent Distance object (meters, centimetres) using classes. The class 
definition include a parameterized constructor, display ( ) to display the instance variables, sum 
(Distance, Distance) to add two distances. Now write a main function that creates a couple of Distance 
objects and demonstrates the addition of two distances.*/
class Distance{
	int m;
	int cm;
	Distance(int m, int cm){
		if(cm >= 100) {
			m += cm/100;
			cm = cm % 100;
		}
		this.m = m;
		this.cm = cm;
	}
	public void display() {
		System.out.println(m + " m " + cm + " cm ");
	}
	Distance sum(Distance d1, Distance d2) {
		int me = d1.m + d2.m;
		int cme = d1.cm + d2.cm;
		return new Distance(me, cme);
	}
}
public class HA2Q3 {
	public static void main(String[] args) {
		Distance d1 = new Distance(5, 70);
		Distance d2 = new Distance(3, 30);
        System.out.println("Two distance are : ");
        Distance d3 = d1.sum(d1, d2);
        d1.display();
        d2.display();
        System.out.println("Ther sum is : ");
        d3.display();
	}

}
