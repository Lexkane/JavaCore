package week6.Lesson10;

public class MyThread1 extends Thread{

	public void run(){
		for (int i = 0; i < 5; i++) {
			
			try {
				Thread.sleep(2000);
				System.out.println("«Hello, world»");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}
