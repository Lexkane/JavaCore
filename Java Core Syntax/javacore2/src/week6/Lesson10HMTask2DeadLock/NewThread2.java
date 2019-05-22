package week6.Lesson10HMTask2DeadLock;

public class NewThread2 implements Runnable{

	private A a;
	Thread t;
	private B b;
	
	public NewThread2(A a, B b, String threadName) {
		this.a = a;
		this.b = b;
		t = new Thread(this, threadName);
		t.start();
		
		
		
		System.out.println(threadName + " Почав роботу");
		
	}

	@Override
	public void run() {
		synchronized (b) {
			b.call(a);
			synchronized (a) {
				a.call(b);	
			}
		}
		
		
	}
	
}
