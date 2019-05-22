package week6.Lesson10HMTask2DeadLock;

public class B {

	private String name;

	public void call(A a) {

		System.out.println(a.getName());

	}

	public B(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
