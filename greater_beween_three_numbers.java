package assignment;
import java.util.Scanner;
public class greater_beween_three_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner u_input = new Scanner(System.in);
		
		System.out.println("Enter your first number......");
		int num1 = u_input.nextInt();
		
		System.out.println("Enter your Second number......");
		int num2 = u_input.nextInt();
		
		System.out.println("Enter your third number......");
		int num3 = u_input.nextInt();
		
		System.out.println("Your numbers are " + num1 + "," + num2 + "," + num3);
		System.out.println("--------------------------------------------");
//		building logic for greater number between three numbers
		
		if (num1 > num2) {
			if(num1 > num3) {
				System.out.println("Greater number is " + num1);
			}
			
		}
		else {
			if(num2 > num3) {
				System.out.println("Greater number is " + num2);
				
			}
			else {
				System.out.println("Greater number is " + num3);	
			}
		}
		
		

	}

}
