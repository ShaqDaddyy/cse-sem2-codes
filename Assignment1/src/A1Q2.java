import java.util.Scanner;
public class A1Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the weight of the person");
		double weigth = sc.nextDouble();
        System.out.print("Enter the heigth of the person");
        double height = sc.nextDouble();
        double BMI = weigth / (height * height);
        if(BMI < 18.5) {
        	System.out.println(" Underweight ");
        }
        else if(BMI > 18.5 && BMI < 24.9) {
        	System.out.println(" normal ");
        }
        else if(BMI > 24.9 && BMI < 29.9) {
        	System.out.println(" Over weight ");
        }
        else
        	System.out.println(" obese");
	}

}
