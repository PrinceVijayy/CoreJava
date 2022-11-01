package operators;

public class IncremenAndDecrementOperators {

	public static void main(String[] args) {
		// Pre Increment
		int a=10;
		int b=++a;
		System.out.println("B= "+b);
		System.out.println("A= "+a);
		// Post Increment
		int x=20;
		int y=x++;
		System.out.println("Y= "+y);
		System.out.println("X= "+x);
		// Pre Decrement
		int p=30;
		int q=--p;
		System.out.println("Q= "+q);
		System.out.println("P= "+p);
		// Post Decrement
		int i=40;
		int j=i--;
		System.out.println("J= "+j);
		System.out.println("I= "+i);
	}

}
