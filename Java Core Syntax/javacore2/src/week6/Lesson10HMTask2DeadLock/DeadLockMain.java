package week6.Lesson10HMTask2DeadLock;

public class DeadLockMain {
	public static void main(String[] args) {
		
		A a = new A("Class A");
		B b = new B("Class B");
		
		Thread curT = Thread.currentThread();
		
		NewThread1 nThread1 = new NewThread1(a, b, "Thread number 1");
		NewThread2 nThread2 = new NewThread2(a, b, "Thread number 2");
		
//		try {
//			nThread1.t.join();
//			nThread1.t.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		// TODO: Organize the expectations of ending a thread in main(), and make the end of the method main() in this thread.
		// ASK Viktoria
		
		System.out.println("The end");
		
	}
}
