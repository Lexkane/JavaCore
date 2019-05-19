import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class CompareUsingComparable {
	
	public static void main(String[] args) {
		List<Cat> cats= new ArrayList<>();
		
		cats.add(new Cat("garfield"));
		cats.add(new Cat("Loki"));
		cats.add(new Cat("art"));
		cats.add(new Cat("enki"));
		cats.add(new Cat("Bony"));
		Collections.sort(cats);
		
		for (Cat cat:cats) {
			System.out.println(cat);
		}
		
		
	}

}
