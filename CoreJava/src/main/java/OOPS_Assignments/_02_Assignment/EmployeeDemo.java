package employee;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.println("|       Employee Details       |");
		System.out.println("--------------------------------");
		System.out.println("| 1.Enter Employee Id        : |");
		int empId=sc.nextInt();
		System.out.println("| 2.Enter Employee First Name: |");
		String firstName=sc.next();
		System.out.println("| 3.Enter Employee Last Name : |");
		String lastName=sc.next();
		System.out.println("| 4.Enter Employee Address   : |");
		String address=sc.next();
		System.out.println("| 5.Enter Employee Pincode   : |");
		String pincode=sc.next();
		System.out.println("| 6.Enter Employee Basic     : |");
		double basic=sc.nextDouble();
		System.out.println("| 7.Enter Employee Allowance : |");	
		double allowance=sc.nextDouble();
		System.out.println("| 8.Enter Employee Deductions: |");
		double deductions=sc.nextDouble();
		System.out.println("--------------------------------");
		//object declaration
		FullTimeEmployee fte=new FullTimeEmployee(empId,basic,allowance,deductions,firstName,lastName,address,pincode);
		PartTimeEmployee pte=new PartTimeEmployee(empId,basic,allowance,deductions,firstName,lastName,address,pincode);
		//PTE FTE
		System.out.println("--------------------------------");
		System.out.println("|      Enter your Choice        ");
		System.out.println("--------------------------------");
		System.out.println("| 1.Full Time Employee         |");
		System.out.println("| 2.Part Time Employee         |");
		System.out.println("--------------------------------");
		int choice=sc.nextInt();
		switch (choice){
			 case 1:System.out.println("-------------------------------------------------------------------------------------");
					System.out.println("|       Full Employee Details  |");
					System.out.println("-------------------------------------------------------------------------------------");
					System.out.println("| 1.Enter Employee Id        : |"+fte.empId+"|");
					System.out.println("| 2.Enter Employee First Name: |"+fte.firstName+"|");
					System.out.println("| 3.Enter Employee Last Name : |"+fte.lastName+"|");
					System.out.println("| 4.Enter Employee Real Name : |"+fte.getRealName()+"|");
					System.out.println("| 5.Enter Employee Address   : |"+fte.address+"|");
					System.out.println("| 6.Enter Employee Pincode   : |"+fte.pincode+"|");
					System.out.println("| 7.Enter Employee Basic     : |"+fte.basic+"|");
					System.out.println("| 8.Enter Employee Allowance : |"+fte.allowance+"|");	
					System.out.println("| 9.Enter Employee Deductions: |"+fte.deductions+"|");
					System.out.println("| 10.Enter Employee Salary   : |"+fte.calcSalary()+"|");
					System.out.println("---------------------------------------------------------------------------------------");
					break;
			 case 2:System.out.println("---------------------------------------------------------------------------------------");
					System.out.println("|       Employee Details       |");
					System.out.println("---------------------------------------------------------------------------------------");
					System.out.println("| 1.Enter Employee Id        : "+pte.empId+"|");
					System.out.println("| 2.Enter Employee First Name: "+pte.firstName+"|");
					System.out.println("| 3.Enter Employee Last Name : "+pte.lastName+"|");
					System.out.println("| 4.Enter Employee Real Name : "+pte.getRealName()+"|");
					System.out.println("| 5.Enter Employee Address   : "+pte.address+"|");
					System.out.println("| 6.Enter Employee Pincode   : "+pte.pincode+"|");
					System.out.println("| 7.Enter Employee Basic     : "+pte.basic+"|");
					System.out.println("| 8.Enter Employee Allowance : "+pte.allowance+"|");	
					System.out.println("| 9.Enter Employee Deductions: "+pte.deductions+"|");
					System.out.println("| 10.Enter Employee Salary   : "+pte.calcSalary()+"|");
					System.out.println("---------------------------------------------------------------------------------------");
					break;
		}
		
		
		
		sc.close();
	}

}
