package flowcontroldemo;
import java.util.Scanner;
/**
 * 
 * @author sv22044
 *PrimeNumberStaticMethod
 *
 *
 */
public class PrimeNumberStaticMethod {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number?");
	int num = sc.nextInt();
	//int num=Integer.parseInt(args[0]);
	prime(num);
	sc.close();
	}
    static void prime(int number) {
	int count = 0;
	for (int i = 1; i <= number; i++) {
	if (number % i == 0) {
	count++;
	}
	}
	if (count == 2) {
	System.out.println(number + " is prime number");
	} else {
	System.out.println(number + " is not prime number");
	}
	}
	}
