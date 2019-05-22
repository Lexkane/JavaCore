package week3.hm3;

public class Dog {

	private String name;
	private int age;
	private Breed breed;

	public Dog(String name, int age, Breed breed) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}

	public String toStringNameAndBreed() {
		return "Dog [name=" + name + ", breed=" + breed + "]";
	}

	public boolean checkIfTheNameEquals(Dog dog) {

		if (this.getName().equalsIgnoreCase(dog.getName())) {
			return true;
		} else {
			return false;
		}

	}

	public int checkTheOldestDog(Dog dog) {

		if (this.getAge() > dog.getAge()) {
			return 1;
		} else if (this.getAge() < dog.getAge()) {
			return -1;
		} else {
			return 0;
		}

	}

}
