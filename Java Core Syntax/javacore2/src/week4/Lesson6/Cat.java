package week4.Lesson6;

public class Cat implements Animal{

	private String name;
	
	
	
	public Cat(String name) {

		this.name = name;
	}

	@Override
	public void voice() {
		System.out.println("MEOW from " + this.name);
		
	}

	@Override
	public void feed() {
		System.out.println("Feeding a cat " + this.name);
		
	}

	
	
}
