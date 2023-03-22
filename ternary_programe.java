package assignment;

import java.util.Scanner;

	public class ternary_programe {
		public static void main(String[] args) {
			String result;
			//message to enter the number
			System.out.println("Enter your marks");
			Scanner m = new Scanner(System.in);
			int marks = m.nextInt();
			result = marks > 40 ? "Pass" : "Fail";
			System.out.println(result);
			
	}
}
