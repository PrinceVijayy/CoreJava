package flowcontroldemo;

import java.util.Scanner;

public class NcrAndNpr {

	double fact(double n) {
		int i = 1;
		double fact = 1;
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		return fact;
	}

	double ncr(int n, int r) {
		double p = fact(n) / fact(n - r);
		return p;
	}

	double npr(int n, int r) {
		double c = fact(n) / (fact(n - r) * fact(r));
		return c;
	}

	public static void main(String arg[]) {
		NcrAndNpr p = new NcrAndNpr();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = sc.nextInt();
		System.out.println("Enter value of r");
		int r = sc.nextInt();
		if (n >= r) {
			System.out.println(n + "p" + r + "= " + p.npr(n, r));
			System.out.println(n + "c" + r + "= " + p.ncr(n, r));
		} else
			System.out.println("n value should be greater than or equal to r value");
		sc.close();
	}
	
}
