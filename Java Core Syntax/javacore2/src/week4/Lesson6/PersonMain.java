package week4.Lesson6;

public class PersonMain {

	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		Cleaner cleaner = new Cleaner();
		Student student = new Student();
		
		
		Person [] persons = new Person [3];
		persons[0] = teacher;
		persons[1] = cleaner;
		persons[2] = student;
		System.out.println();
		for (Person person : persons) {
			person.print();
			if (person instanceof Staff ){
				((Staff) person).salary();
			}
		}
		


		
		
		
		
	}
	
}
