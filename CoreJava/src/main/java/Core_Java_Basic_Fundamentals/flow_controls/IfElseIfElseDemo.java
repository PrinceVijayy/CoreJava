package flowcontrols;

import java.util.Scanner;
/**
 * 
 * @author vk22051
 *To find the Largest number in three numbers
 */

public class IfElseIfElseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number?");
		int firstnumber = sc.nextInt();
		System.out.println("Enter Second number?");
		int secondnumber = sc.nextInt();
		System.out.println("Enter Third number?");
		int thirdnumber = sc.nextInt();
		if(firstnumber>secondnumber && firstnumber>thirdnumber) {
			System.out.println("First number is the Largest number");
		}
		if(secondnumber>firstnumber && secondnumber>thirdnumber) {
			System.out.println("Second number is the Largest number");
		}
		if(thirdnumber>firstnumber && thirdnumber>secondnumber) {
			System.out.println("Third number is the Largest number");
		}
		else
			System.out.println("Two or moe numbers are equal");

		sc.close();
	}

}
