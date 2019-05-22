package week6.Lesson10;

public class MyThread3 extends Thread {

	
	
	public MyThread3(Thread t1, Thread t2) throws InterruptedException {
		t1.join();
		t2.join();
		
	}
	
	public void run() {
		
		for (int i = 0; i < 5; i++) {

			System.out.println("Third Thread");

		}
	}

}
