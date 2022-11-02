package collectionsassignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(5);
		Scanner s=new Scanner(System.in);
		System.out.println("enter user input");
		int input=s.nextInt();
		if(al.contains(input)){
               System.out.println("number is available in the list");
		}
		else
			System.out.println("enter valid number");
	}

}
