package multiThreading;

/**
 * 
 * 
 * . Display name and priority of current thread. Change name of Thread to
MyThread and set priority to 2 and display it on screen.......?
 * @author jp22088
 *
 */

public class PriorityCheck extends Thread {
	public void run(){
		System.out.println(Thread.currentThread().getName()+"\t"+Thread.currentThread().getPriority());
	}
		public static void main(String[] args) {
			PriorityCheck t1=new PriorityCheck();
			PriorityCheck t2=new PriorityCheck();
			PriorityCheck t3=new PriorityCheck();
			
			t1.start();
			t1.setName("first");
			t1.setPriority(2);
			
			t2.start();
			t2.setName("second");
			t2.setPriority(5);
			
			t3.start();
			t3.setName("third");
			t3.setPriority(8);

		}

	}