package employee;

public class Employee {
	protected int empId;
	protected double sal = 0;
	protected double basic;
	protected double allowance;
	protected double deductions;
	public String firstName;
	public String lastName;
	protected String address;
	protected String pincode;
	public String realName;

	// Salary Read only
	public double getsal() {
		return sal;
	}


	public String getRealName() {
		return  this.firstName +" "+ this.lastName;
	}


	public void setRealName(String realName) {
		this.realName = realName;
	}


	// method
	public double calcSalary() {
		sal = basic + allowance - deductions;
		return sal;
	}

	// Parameterized Constructor
	public Employee(int empId, double basic, double allowance, double deductions, String firstName, String lastName,
			String address, String pincode) {
		super();
		this.empId = empId;
		this.basic = basic;
		this.allowance = allowance;
		this.deductions = deductions;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.pincode = pincode;

	}

}
