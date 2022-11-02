package assignments;

/**
 * Program to find age by using birthMonth and birthYear
 */
import java.util.Scanner;

public class CalculateAge {

	static int birthMonth, birthYear;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Find your Age");
		System.out.println("Enter your Birth Month in Number Format");
		birthMonth = scan.nextInt();
		System.out.println("Enter your Birth Year in Number Format");
		birthYear = scan.nextInt();
		if (birthMonth < 1 || birthYear < 1)
			System.out.println("-1.0 ");
		else if (birthMonth > 12 || birthYear > 2022||calculateAge(birthMonth, birthYear)<1)
			System.out.println("-2.0");

		else
			System.out.println("Your age is=" + calculateAge(birthMonth, birthYear));
		scan.close();
	}

	public static double calculateAge(int birthMonth, int birthYear) {
		double x=birthMonth, y=birthYear;
		double a, b, c,currentYear=2022,noOfMonths=12,currentMonth=6;
		a = x / noOfMonths;
		b = currentYear+(currentMonth/noOfMonths) - y;
		c = b - a;
		return c;
	}

}
