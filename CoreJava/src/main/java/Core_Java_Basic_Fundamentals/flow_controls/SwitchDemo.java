package flowcontrols;

import java.util.Scanner;
/**
 * 
 * @author vk22051
 *Calculation Application
 */
public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number?");
		System.out.println("--------------------");
		System.out.println("|Switch Application|");
		System.out.println("|1. Addition       |");
		System.out.println("|2.Subtraction     |");
		System.out.println("|3.Multiplication  |");
		System.out.println("|4.Division          |");
		System.out.println("--------------------");
		System.out.println("Enter your choice number");
		int choice = sc.nextInt();
		System.out.println("Enter number A?");
		int a = sc.nextInt();
		System.out.println("Enter number B?");
		int b = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Result= "+(a+b));
			break;
		case 2:
			System.out.println("Result= "+(a-b));
			break;
		case 3:
			System.out.println("Result= "+(a*b));
			break;
		case 4:
			System.out.println("Result= "+(a/b));
			break;
		default:
				System.out.println("Enter Choice in the given range 1-4");
		}
		sc.close();
	}

}
