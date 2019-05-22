package week6.Lesson10;

public class Lesson10HMTask3 {

	public static void main(String[] args) {
		
		Thread2 t2 = new Thread2();
		Thread1 t1 = new Thread1(t2);
		
		try {
			t1.t.join();
			t2.t.join();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
 	}
	
	
}
