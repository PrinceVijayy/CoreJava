package flowcontroldemo;

import java.util.Scanner;

/**
 * 
 * @author sv22044 SumOfDigitsUsingForLoop
 *
 *
 */
public class SumOfDigitsUsingForLoop {
	public static void main(String[] args) {
		long n, sum;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		n = scan.nextLong();
		for (sum = 0; n != 0; n /= 10) {
			sum += n % 10;
		}
		System.out.println("Sum of digits of a number is " + sum);
		scan.close();
	}
}