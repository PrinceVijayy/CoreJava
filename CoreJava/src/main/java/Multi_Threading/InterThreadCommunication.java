package multiThreading;

/**
 * 
 *Shared Bank Account using Synchronization and object locks and wait and
notify methods.
 * 
 */

import java.util.Scanner;

class BankAccount {
	double balance = 20000;

	public synchronized void withdraw(double wamount) {
		if (balance >= wamount) {
			balance -= wamount;
			System.out.println("successfully withdraw completed.updated " + balance);
		} else {
			System.out.println("please wait balance not enough.Please deposit and continue");
		}
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		if(balance<=wamount){
			System.out.println("Limit exceded");
		}else{
			balance -= wamount;
		}
		
		System.out.println("Successfully withdraw completed.Updated Balance = " + balance);
	}

	public synchronized void deposite(double damount) {
		System.out.println("current balnce" + balance);
		balance += damount;
		System.out.println("Updated balance" + balance);
		notify();
	}

}

public class InterThreadCommunication {

	public static void main(String[] args) {
		final BankAccount b = new BankAccount();
		Thread t = new Thread() {
			public void run() {
				System.out.println("Enter the amount for withdraw");
				Scanner sc=new Scanner(System.in);
				int number=sc.nextInt();
				b.withdraw(number);
				sc.close();
			}
		};
		
		t.start();
		
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Enter the amount for update");
				Scanner sc=new Scanner(System.in);
				int number1=sc.nextInt();
				b.deposite(number1);
				sc.close();
			}
		};
		t1.start();

	}

}
