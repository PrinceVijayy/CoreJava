package employee;

public class FullTimeEmployee extends Employee {


	

	public FullTimeEmployee(int empId, double basic, double allowance, double deductions, String firstName,
			String lastName, String address, String pincode) {
		super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);
	}

	public double calcSalary(){
		sal= (basic*2) + allowance-deductions;
		return sal;
	}

}
