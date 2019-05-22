package week4.Lesson6;

public class Student extends Person{

	final String TYPE_PERSON = "Student";

	public Student() {
		System.out.println("Type of person is " + TYPE_PERSON);
	}
	
	@Override
	void print() {
		System.out.println("I`m a " + TYPE_PERSON);
		
	}
	
	
}
