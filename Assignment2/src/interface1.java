
public interface interface1 {
   int a = 7;
   void display();
}
class A implements interface1{
	public void display() {
		System.out.println("Learning interface");
		System.out.println("a = "  + a);
	}


	public  static void main(String [] args) {
		A obj = new A();
		obj.display();
	}
}