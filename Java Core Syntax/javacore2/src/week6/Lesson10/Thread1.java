package week6.Lesson10;

public class Thread1 implements Runnable{

	Thread t;
	
	public Thread1(Thread2 thread2) {
		
		t=new Thread(this, "Thread One");
		t.start();
		System.out.println(this.t.getName() + " started");
		thread2.t.start();
		
	}
	
	@Override
	public void run() {
		
		
	}

}
