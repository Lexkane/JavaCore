
public class Dog {

	private String name;

	public String getName() {
		return name;
	}
	
	public Dog(String name) {
		this.name=name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
