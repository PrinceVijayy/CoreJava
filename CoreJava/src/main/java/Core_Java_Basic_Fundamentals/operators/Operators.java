package operators;

public class Operators {
	public static void main(String[] args) {
// Arithmetic Operators
		System.out.println(125 + 24);
		System.out.println(125 - 24);
		System.out.println(125 * 24);
		System.out.println(125 / 24);
		System.out.println(125 % 24);
// Relational Operators
		int a = 5, b = 3;
		System.out.println((a > b) ? "true" : "false");
		System.out.println((a >= b) ? "true" : "false");
		System.out.println((a < b) ? "true" : "false");
		System.out.println((a <= b) ? "true" : "false");
		System.out.println((a == b) ? "true" : "false");
		System.out.println((a != b) ? "true" : "false");
//Logical Operators
		System.out.println((a > b) && (b != a) ? "true" : "false");
		System.out.println((a > b) || (b == a) ? "true" : "false");
		System.out.println(!(a > b) && (b != a) ? "true" : "false");
		System.out.println((a++) + (++a) + (--a) + (a--));
//Assignment Operators
		System.out.println(a += b);
		System.out.println(a -= b);
		System.out.println(a *= b);
		System.out.println(a /= b);
	}
}
