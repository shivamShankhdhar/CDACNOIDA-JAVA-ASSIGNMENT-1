package assignment;
import java.util.Scanner;
public class product_details {
	public static void main(String args[]) {
		Scanner u_input = new Scanner(System.in);
		//product name input from user
		System.out.println("Enter product Name......");
		String product_name = u_input.nextLine();
		// product price input from user
		System.out.println("Enter price of product......");
		float product_price = u_input.nextFloat();
		/* if price > 2000 then discount is 10 percent of price 
		else 
			discount is 7 % of price */
		float discount;
		if ( product_price > 2000 ) {
			discount = product_price * 10 / 100;
		}
		else {
			discount = product_price * 7 / 100;
		}
		System.out.println("Your discount on " + product_name + "=" + discount);
	}
}
