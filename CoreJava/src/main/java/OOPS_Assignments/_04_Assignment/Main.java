package _04Assignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Account ac = new Account("123456789", "eshwar", "8019845075", 5000.0);
	        CurrentAccount ca = new CurrentAccount();
	        SavingsAccount sa = new SavingsAccount();

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter pin:");
	        String pin = sc.next();
	        while (true) {
	            int count = 1;
	            if (ac.AccNo.equalsIgnoreCase(pin)) {
//	                System.out.println("**********************************");
//	                System.out.println("Account Name is:" + ac.Name);
//	                System.out.println("Account Number is:" + ac.AccNo);
//	                System.out.println("Account Mobile is:" + ac.MobileNumber);
//	                System.out.println("Availble Bal is:" + ac.amont);
//	                System.out.println("***********************************");

	                System.out.println("----------------------------------------");
	                System.out.println("Choose Options");
	                System.out.println("Press 1 for Deposite");
	                System.out.println("Press 2 for Withdraw");
	                System.out.println("Press 3 for Bal Enquirey");
	                System.out.println("Press 4 for Current account Interst Rate");
	                System.out.println("Press 5 for Savings account Interst Rate");
	                System.out.println("Press 6 for Exit");
	                System.out.println("-----------------------------------------");

	                String dept = sc.next();
	                if (dept.equals("1")) {
	                    ac.Deposite();
	                } else if (dept.equals("2")) {
	                    ac.Withdraw();
	                    count++;
	                } else if (dept.equals("3")) {
	                    ac.getBalence();
	                } else if (dept.equals("4")) {
	                    ca.AddInterst();
	                } else if (dept.equals("5")) {
	                    // sa.InterstRate();
	                    sa.AddInterst();
	                } else if (dept.equals("6")) {
	                    System.out.println("Thank you for Visiting;");
	                    break;
	                } else {
	                    System.out.println("Invalid Option Pls Try again..");
	                }
	                //System.out.println("is:" + count);

	            } else {
	                System.out.println("Your entered wrong pin:");
	            }
	        }
		
		
	}

}
