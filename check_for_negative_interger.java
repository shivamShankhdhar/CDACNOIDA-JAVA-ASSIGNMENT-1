package assignment;
import java.util.Scanner;
public class check_for_negative_interger {
	public static void main(String args[]) {
		Scanner u_input = new Scanner(System.in);
		System.out.println("Enter a number......");
		int num = u_input.nextInt();
		String result;
		result = num > 0 ? "Number is positive" : "Number is negative";
		System.out.println(result);
		
	}
}
