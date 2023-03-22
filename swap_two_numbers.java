package assignment;
import java.util.Scanner;
public class swap_two_numbers {
	public static void main(String args[]) {
		Scanner u_input = new Scanner(System.in);
		System.out.println("Enter your first number....");
		int num1 = u_input.nextInt();
		System.out.println("Enter your Second number....");
		int num2 = u_input.nextInt();
		System.out.println("Your Entered first numbers = " + num1);
		System.out.println("Your Entered second numbers = " + num2);
		
		int num3 ;
		num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println("===========================================");
		System.out.println("Your Swapped First number = " + num1);
		System.out.println("Your Swapped Second number = " + num2);
		
		
	}
}
