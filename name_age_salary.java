package assignment;
import java.util.Scanner;
public class name_age_salary {

	public static void main(String[] args) {
		
		Scanner u_input = new Scanner(System.in);
		System.out.println("Enter your Name Please......");
		String Name = u_input.nextLine();
		System.out.println("Enter your Age Please......");
		int Age = u_input.nextInt();
		System.out.println("Enter your Salary Please......");
		int Salary = u_input.nextInt();
		
		System.out.println("Here are your Details.....");
		System.out.println("Your Name :" + " " + Name );
		System.out.println("Your Age :" + " " + Age );
		System.out.println("Your Salary :" + " " + Salary );
		}

}
