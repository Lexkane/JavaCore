package week4.Lesson6;

public class TestAandB {

	public static void main(String[] args) {
		A a = new A();
		
		B b = new B();
		
		a.field = 0;
		b.field2 =1;
//		System.out.println(((B) a).field2); /*throws ClassCastExceptio, need a=b n*/
		
//		a = b;		
//		System.out.println(a.field2);  /*cant get the field2, compilier error*/
//		System.out.println(((B) a).field2);
	
//		b = (B)a;
		

//		System.out.println(b.field);
		
	}
	
	
}
