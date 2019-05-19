
public class Cat implements Comparable<Cat> {
	private String name;
	
	public Cat(String name) {
		this.name=name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Cat otherCat){
		return this.getName().compareTo(otherCat.getName());
	}

}
