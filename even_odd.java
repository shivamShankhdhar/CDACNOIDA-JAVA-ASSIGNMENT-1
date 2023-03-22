package assignment;
import java.util.Scanner;
public class even_odd {

	public static void main(String[] args) {
		
		Scanner u_input = new Scanner(System.in);
		System.out.println("Enter a number.......");
		int num = u_input.nextInt();
		String result ;
		result = num % 2 == 0 ? "even" : "odd";
		System.out.println("your entered number is " + result);	

	}

}
