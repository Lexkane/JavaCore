package week4.Lesson6;

public class Cleaner extends Staff{

	public static final String TYPE_PERSON = "CLEANER";
	
	public Cleaner() {
		System.out.println("Type of this person is " + TYPE_PERSON);
	}
	
	@Override
	void salary() {
		System.out.println("Salary of " + TYPE_PERSON + " is 5000");
		
	}

	@Override
	void print() {
		System.out.println("I`m a " + TYPE_PERSON);
		
	}

}
