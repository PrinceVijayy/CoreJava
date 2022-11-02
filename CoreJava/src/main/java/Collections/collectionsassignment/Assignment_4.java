package collectionsassignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Assignment_4 {
	public String name;
	public int rollNumber;
	public String course;
		public Assignment_4(String name, int rollNumber, String course) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.course = course;
		
	}
		@Override
		public String toString() {
			return "Student [name=" + name + ", rollNumber=" + rollNumber + ", course=" + course + "]";
		}
	public static void main(String[] args) {
		Assignment_4 obj1=new Assignment_4("sravani",483,"ece");
		Assignment_4 obj2=new Assignment_4("bhavya",482,"ece");
		Assignment_4 obj3=new Assignment_4("sindhu",281,"cse");
        ArrayList al=new ArrayList();
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        Scanner s=new Scanner(System.in);
        System.out.println("enter index value");
        int index;
		try {
			index = s.nextInt();
			 System.out.println("student details:"+al.get(index));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("enter valid index number");
		}
       

	}

}
