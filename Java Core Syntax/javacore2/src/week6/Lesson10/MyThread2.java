package week6.Lesson10;

public class MyThread2 extends Thread{

	public void run(){
		for (int i = 0; i < 5; i++) {
			
			try {
				Thread.sleep(3000);
				System.out.println("«Peace in the peace»");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
