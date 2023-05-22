/*Write a simple main class in Java that contains an experiment that uses the generic Box<T>
class to build boxes with different types and that verifies that this class works as advertised.
Your experiment should include the following:
 Create a boxed String object and two variables that refer to that box. Change the contents
of one and determine the effect on the other.
 Create a boxed Integer object and two variables that refer to that box. Change the
contents of one and determine the effect on the other.
 Create a boxed Object object and two variables that refer to that box. Determine what
happens if you put a string in the box. Determine what happens if you put an integer in
the box.*/
class Box<T>{
	public T t;
	public Box(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
public class A3Q6 {
	public static void main(String[] args) {
	Box<String>	s1 = new Box<>("It is the object of Box String");
	Box<String> s2 = s1;
	System.out.println("String variable_1 contains : " + s1.get());
	System.out.println("String variable_2 contains : " + s2.get());
    s1.set("Changed");
    System.out.println("String variable_1 contains : " + s1.get());
    System.out.println("String variable_2 contains : " + s1.get());
    Box<Integer> ione = new Box<>(9588);
    Box<Integer> itwo = ione;
    System.out.println("Integer variable_1 contains : " + ione.get());
    System.out.println("Integer variable_2 contains : " + itwo.get());
    ione.set(20);
    System.out.println("Integer variable_1 contains : " + ione.get());
    System.out.println("Integer variable_2 contains : " + itwo.get());
    Box<Object> obj1 = new Box<>(new Object());
    Box<Object> obj2 = obj1;
    System.out.println("Object Variable_1 contains : " + obj1.get());
    System.out.println("Object Variable_2 contains : " + obj2.get());
    obj1.set(" String putted in the box ");
    System.out.println("Object Variable_1 contains : " + obj1.get());
    System.out.println("Object Variable_2 contains : " + obj2.get());
    obj1.set(10);
    System.out.println("Object Variable_1 contains : " + obj1.get());
    System.out.println("Object Variable_2 contains : " + obj2.get());
	}

}
