package week4.Lesson6;

public class MainAnimal {

	public static void main(String[] args) {
		
		
		//task1
		Animal [] animals = new Animal [4];
		animals[0] = new Cat("Susy");
		animals[1] = new Cat("Nika");
		animals[2] = new Dog("Jack");
		animals[3] = new Dog("Bob");
		
		
		for (Animal animal : animals) {
			animal.voice();
			animal.feed();
		}
		
		
		
		
		
	}
	
	
}
