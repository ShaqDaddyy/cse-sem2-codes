import java.util.Scanner;
interface AnimalEat{
	void eat();
}
interface AnimalTravel{
	void travel();
}
class ABC implements AnimalEat,AnimalTravel{
	public void eat() {
		System.out.println("Animal is eating");
	}
	public void travel() {
		System.out.println("Animal is travelling");
	}
}
public class multipleinheritance {

	public static void main(String[] args) {
		ABC obj = new ABC();
		obj.eat();
		obj.travel();

	}

}
