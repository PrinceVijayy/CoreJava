package flowcontrols;

import java.util.Scanner;

/**
 * 
 * @author vk22051 
 * To find the given number is even or odd
 */
public class IfElseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number?");
		int number = sc.nextInt();
		if (number % 2 == 0)
			System.out.println("Given number is even");
		else
			System.out.println("Given number is odd");
		sc.close();
	}

}
