package strings;

import java.util.Scanner;

public class StringSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an String array:");
		size = s.nextInt();
		System.out.println("Enter the data : ");
		String a[] = new String[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.next();
		}
		String temp;
		for (int j = 0; j < a.length; j++) {
			for (int k = 0; k < a.length - 1; k++) {
				if (a[k].charAt(k) > a[k + 1].charAt(k+1)) {
					temp = a[k];
					a[k] = a[k + 1];
					a[k + 1] = temp;
				}
			}
		}
		for (String m:a) {
			System.out.println(m);
		}
}
}
