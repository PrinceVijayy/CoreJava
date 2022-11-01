package multiThreading;

public class RunnableDemo implements Runnable {
	public void run() {
        System.out.println(" " + Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) {
            Thread.yield();
            System.out.println("child thread");
        }
    }

    public static void main(String[] args) {

        RunnableDemo rd = new RunnableDemo();
        Thread td1 = new Thread(rd);
        RunnableDemo rd1 = new RunnableDemo();
        Thread td2 = new Thread(rd1);
        td1.start();
        // td1.setPriority(5);
        for (int i = 0; i <= 5; i++) {
            System.out.println("main thread");
        }

    }
}
