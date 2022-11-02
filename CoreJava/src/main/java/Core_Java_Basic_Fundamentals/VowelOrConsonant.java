package flowcontroldemo;

import java.util.Scanner;

/**
 * 
 * @author sv22044 VowelOrConsonant
 *
 *
 */

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any Character: ");
		char ch = sc.next().charAt(0);
		// char ch=sc.nextChar();
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("Entered character " + ch + " is vowel");
		} else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println("Entered character " + ch + " is consonant");
		} else {
			System.out.println("Not an alphbet");
		}
		sc.close();
	}
}
