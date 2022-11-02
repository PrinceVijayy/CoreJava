package flowcontroldemo;
import java.util.Scanner;
/**
 * 
 * @author sv22044
 *PalindromeOrNot
 *
 *
 */
public class PalindromeOrNot {
	public static void main(String[] args) {
	int sum, temp, rem, num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number");
	num = sc.nextInt();
	temp = num;
	for (sum = 0; num > 0; num /= 10) 
		{
			rem = num % 10;
			sum = (sum * 10) + rem;
		}
	if (temp == sum)
	System.out.println(temp + " is palindrome number");
	 else 
	System.out.println(temp + " is not palindrome number");
	sc.close();
	
}
}
