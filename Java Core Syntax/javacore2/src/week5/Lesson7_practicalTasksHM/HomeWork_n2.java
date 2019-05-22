package week5.Lesson7_practicalTasksHM;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HomeWork_n2 {
	
	
	public static void main(String[] args) {
		//task A)
		Map <String, String> personMap = new TreeMap<>();
		personMap.put("Stadnyk", "Yura");
		personMap.put("Kos", "Vova");
		personMap.put("Kyrsta", "Taras");
		personMap.put("Galchuk", "Roman");
		personMap.put("Cvok", "Danulo");
		personMap.put("Korn", "Tarik");
		personMap.put("Shol", "Roman");
		personMap.put("Gog", "Orest");
		personMap.put("Shog", "Vitalik");
		personMap.put("Prush", "Vyacheslav");
		
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
				System.out.println( entry.getKey()+ " " + entry.getValue());
		}
		System.out.println();
		// Task B)
		List <String> list = new LinkedList<>(personMap.values());
		boolean existSameFN;
		for (int i = 0; i < list.size(); i++) {
			existSameFN = false;
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))){
					System.out.println("Yes, there are at least two persons with the same firstname among these people");
					existSameFN = true;
					break;
				}
			}
			if (existSameFN){
				break;
			} else if (!existSameFN && i+1==list.size()){
				System.out.println("There are not same first names among these peoples");
			}
		}
		System.out.println();
		//task C) Remove from the map person whose firstName is ”Orest”
		String nameToDelete = "Orest";
		if (personMap.containsValue(nameToDelete)){
			Set<Map.Entry<String, String>> entriesSet = personMap.entrySet();
			Iterator<Entry<String, String>> iter = entriesSet.iterator();
			while(iter.hasNext()){
				if(iter.next().getValue().equalsIgnoreCase(nameToDelete)){
					iter.remove();
				}
		
			}
		} else {
			System.out.println("can't find this firstname");
		}
		
		Set<Map.Entry<String, String>> entriesSet = personMap.entrySet();
		for (Entry<String, String> entry : entriesSet) {
		// OR for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println( entry.getKey()+ " " + entry.getValue());
		}
		

		
		
	}

}
