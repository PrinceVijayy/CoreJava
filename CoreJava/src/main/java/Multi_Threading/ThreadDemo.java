package multiThreading;

public class ThreadDemo  extends Thread{
	public void run(){
		for (int i=3;i<=5;i++){
			System.out.println("Inside run method "+i+" "+Thread.currentThread().getName());
			try{
				Thread.sleep(200);
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	public void start(){
		super.start();
		System.out.println("----start method----");
	}

	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getName());
		//Thread.currentThread().setName("Avinash");
		//System.out.println(Thread.currentThread().getName());
            ThreadDemo t= new ThreadDemo();
            t.setName("avi");
            t.start();
            try{
            	t.join();
            	}
            catch (InterruptedException e){
            	e.printStackTrace();
            }
            for (int i=1;i<=6;++i){
            	System.out.println("Inside main thread "+i+" "+Thread.currentThread().getName());
            	
            }
	}

}
