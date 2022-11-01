package _04Assignment;

import java.util.Scanner;

public class Account {
	
	 String AccNo;
	    String Name;
	    String MobileNumber;
	    Double amont;

	
	    public Account(String accNo, String name, String mobileNumber,Double amont) {
	        super();
	        AccNo = accNo;
	        Name = name;
	        MobileNumber = mobileNumber;
	        this.amont = amont;

	    }

	    public void Deposite(){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Welcome to Deposite Section ? ");

	        System.out.println("Enter the how much amont do you want to Deposite");
	        double Depositemoney = sc.nextDouble();
	        amont += Depositemoney;
	        System.out.println("Amont Deposited Succesfully:");
	        System.out.println("Current Balence is:"+amont);
	    }

	    public  void Withdraw(){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Welcome to Withdraw Section ?");
	        System.out.println("Enter amont:");
	        double money = sc.nextDouble();
	        amont -= money;
	        System.out.println("Amont Withdrawn Succesfully:");
	        System.out.println("Current Bal is:"+amont);
	        CheckingAccount ca = new CheckingAccount();
	    }
	
	
		
	
	    public void getBalence(){
	        System.out.println("Welcome To Balence Section");
	        System.out.println("Balence is:"+amont);
	    }
}
