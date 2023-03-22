package assignment;
import java.util.Scanner;
public class print_greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int greater;
		Scanner u_input = new Scanner(System.in);
		System.out.println("Enter two numbers.......");
		
		int num1 = u_input.nextInt(); 
		int num2 = u_input.nextInt(); 
		
		greater = num1 > num2 ? num1 : num2;
		System.out.println("The grater number is " + greater);
		
	}

}
