package assignment;
import java.util.Scanner;
public class grading_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			 a. Below 25 - F
			 b. 25 to 45 - E
			 c. 45 to 50 - D
			 d. 50 to 60 - C
			 e. 60 to 80 - B
			 f. Above 80 - A

		 */
		Scanner u_input = new Scanner(System.in);
		System.out.println("Enter your percentage....");
		int per = u_input.nextInt();
//		building logic for grading system
		if (per <= 100 ) {
			if (per < 25) {
				System.out.println("Your grade is F ");
			}
			else if (per >=25 && per < 45) {
				System.out.println("Your grade is E ");
			}
			else if (per >= 45 && per < 50){
				System.out.println("Your grade is D ");
			}
			else if(per >= 50 && per < 60) {
				System.out.println("Your grade is C ");
			}
			else if(per >= 60 && per < 80) {
				System.out.println("Your grade is B ");
			}
			else if(per >= 80) {
				System.out.println("Your grade is A ");
			}
		}
		else {
			System.out.println("Wrong Input ");
		}
	}

}
