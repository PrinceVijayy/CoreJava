package collectionsassignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
public String name;
public int rollNumber;
public String course;
	public Student(String name, int rollNumber, String course) {
	this.name = name;
	this.rollNumber = rollNumber;
	this.course = course;
	
}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", course=" + course + "]";
	}
	public static void main(String[] args) {
		Student obj1=new Student("sravani",483,"ece");
		Student obj2=new Student("bhavya",482,"ece");
		Student obj3=new Student("sindhu",281,"cse");
        ArrayList al=new ArrayList();
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        Iterator it=al.iterator();
        while(it.hasNext()){
        	 System.out.println("the student list is:"+it.next());
        }
       
	}

}
