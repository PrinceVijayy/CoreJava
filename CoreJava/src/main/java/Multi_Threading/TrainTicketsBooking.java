package multiThreading;

/**
 * 
 * For Reservation of trains.....?
 */

import java.util.Scanner;

public class TrainTicketsBooking {
	Scanner sc=new Scanner(System.in);
	int total = sc.nextInt();

	public synchronized void bookTickets(int ticket) {
		if (total >= ticket) {
			total -= ticket;
			System.out.println("tickets booked successfully");
			System.out.println("total tickets remaining:" + total);
		} else {
			System.out.println("wait until someone cancels the ticket");
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			bookTickets(20);
		}
	}

	public synchronized void cancel(int cancelTicket) {
		total += cancelTicket;
		System.out.println("cancelled successfully");
		System.out.println("total tickets available:" + total);

		notify();

	}

	public static void main(String[] args) {
		System.out.println("enter the no. of tickets you want to book");
		final TrainTicketsBooking ttb = new TrainTicketsBooking();
		Thread t1 = new Thread() {
			public void run() {
				Scanner sc = new Scanner(System.in);
				 int ticket1=sc.nextInt();
				ttb.bookTickets(ticket1);
				
			}
		};
		t1.start();

		Thread t2 = new Thread() {
			public void run() {
				Scanner sc = new Scanner(System.in);
				 int ticket2=sc.nextInt();
				ttb.cancel(ticket2);
			}
		};
		t2.start();

	}

}