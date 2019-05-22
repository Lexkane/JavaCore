package week5.Lesson7_practicalTasksHM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practical2 {
	
	public static void main(String[] args) {
		//Task A) using Map.Entry
		Map <Integer, String> employeeMap = new HashMap<>();
		
		employeeMap.put(1, "Yura");
		employeeMap.put(2, "Vova");
		employeeMap.put(3, "Taras");
		employeeMap.put(4, "Orest");
		employeeMap.put(5, "Orest");
		employeeMap.put(6, "Sofia");
		employeeMap.put(7, "Roksolana");
		
		
		//Task B) using Map.Entry
		System.out.println(employeeMap);
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleas, enter ID of the employee to know about a name of this person");
		int idNumber = sc.nextInt();
		boolean existId = false;
		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			if (entry.getKey().equals(idNumber)){
				existId = true;
				System.out.println("Using Map.Entry: " + entry.getValue());
				break;
			}
		}
		if (!existId){
			System.out.println("Using Map.Entry: can't find this ID ");
		}
			
		
		//Task B) using containsKey
		if (employeeMap.containsKey(idNumber)){
			System.out.println("Using contains key: " + employeeMap.get(idNumber));
		} else {
			System.out.println("Using contains key: can't find this ID ");
		}
		
		System.out.println();
		//Task C)
		System.out.println("Pleas, enter name of the employee to know about an ID of this person");
		String name = sc.next();
		boolean existName = false;
		Set<Map.Entry<Integer, String>> entriesSet = employeeMap.entrySet();
		for (Map.Entry<Integer, String> entry: entriesSet) {
			if (entry.getValue().equalsIgnoreCase(name)){
				existName = true;
				System.out.println("Using Map.Entry: " + entry.getKey());
				
			}
		}
		if (!existName){
			System.out.println("Using Map.Entry: can't find this name ");
		}
			
		
		//Task C) using containsValue TODO/ASK
		if (employeeMap.containsValue(name)){
			for (Map.Entry<Integer, String> entry : entriesSet) {
				if (entry.getValue().equalsIgnoreCase(name)){
					System.out.println("Using contains value ID is: " + entry.getKey());
				}
			}
		} else {
			System.out.println("Using contains value : can't find this name ");
		}
		
		System.out.println();
		
		
		
	}

}
