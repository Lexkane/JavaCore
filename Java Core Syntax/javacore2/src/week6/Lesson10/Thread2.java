package week6.Lesson10;

public class Thread2 implements Runnable{

	Thread t;
	
	public Thread2() {
		t = new Thread(this, "Thread two");
	}

	@Override
	public void run() {

		for (int i = 0; i < 3; i++) {
			System.out.println("Thread number two");
		}
		
		Thread thread3 = new Thread("Thread three") {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread number three");
				}
			}
		};
		thread3.start();
		
	}
}
