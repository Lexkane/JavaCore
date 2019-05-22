package week4.Lesson6;

public class Dog implements Animal{

	private String name;
	
	
	
	
	public Dog(String name) {
		super();
		this.name = name;
	}

	@Override
	public void voice() {
		System.out.println("WOOOF " + this.name);
		
	}

	@Override
	public void feed() {

		System.out.println("Feeding a Dog " + this.name);
	
	}

	
	
}
