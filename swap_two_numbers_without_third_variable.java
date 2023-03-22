package assignment;
import java.util.Scanner;
public class swap_two_numbers_without_third_variable {
	public static void main(String args[]){
		Scanner u_input = new Scanner(System.in);
		
		System.out.println("Enter your first number....");
		int num1 = u_input.nextInt();
		System.out.println("Enter your Second number....");
		int num2 = u_input.nextInt();
		
		System.out.println("Your first number is " + num1);
		System.out.println("Your second number is " + num2);
		
		//performing action for swapping numbers without using third variable
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("-------------------------------------------------");
		System.out.println("Your Swapped first number is " + num1);
		System.out.println("Your Swapped second number is " + num2);
		
	}
	
}
