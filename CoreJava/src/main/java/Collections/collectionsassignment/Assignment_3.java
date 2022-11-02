package collectionsassignment;

import java.util.LinkedList;

public class Employee {
public String employeeName;
public int employeeId;
public long salary;
	public Employee(String employeeName, int employeeId, long salary) {
	this.employeeName = employeeName;
	this.employeeId = employeeId;
	this.salary = salary;
}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		Employee emp1=new Employee("sravani",400,40000);
		Employee emp2=new Employee("siri",500,30000);
		Employee emp3=new Employee("bhagya",700,20000);
		LinkedList ll=new LinkedList();
		ll.add(emp1);
		ll.add(emp2);
		ll.add(emp3);
		for(Object e:ll){
			System.out.println(e);
			
		}

	}
	

}
