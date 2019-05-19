import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Collections;

public class CompareUsingComparator {
	public static void main(String[] args) {
		List<Dog> dogs= new ArrayList<>();
		
	dogs.add(new Dog("fildo"));
	dogs.add(new Dog("snoopy"));
	dogs.add(new Dog("alphone"));
	dogs.add(new Dog("cerberus"));
	
	Collections.sort(dogs, new CompareDogs());
	for (Dog d:dogs) {
		System.out.println(d);
	}
	}
}

	final class CompareDogs implements Comparator<Dog>{
		@Override
		public int compare(Dog dog1, Dog dog2) {
			return dog1.getName().compareTo(dog2.getName());
		}
		
	}
	
	
	
