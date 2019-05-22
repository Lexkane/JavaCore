package week5.Lesson7_practicalTasksHM;

import java.util.Set;
import java.util.TreeSet;

public class HomeWork_n1 {

	static Set union(Set set1, Set set2){
	
		set1.addAll(set2);
		return set1;
	}
	
	static Set intersect(Set set1, Set set2){
		set1.retainAll(set2);
		return set1;
	}
	
	public static void main(String[] args) {
		
		Set <Integer> set1 = new TreeSet<>();
		set1.add(0);
		set1.add(2);
		set1.add(4);
		set1.add(6);
		set1.add(8);
		System.out.println("set1 contains values: " + set1);
		Set <Integer> set2 = new TreeSet<>();
		set2.add(0);
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(5);
		set2.add(7);
		set2.add(9);
		System.out.println("set2 contains values: " + set2);
		System.out.println();
		
		// union operation of two sets by default method
//		set1.addAll(set2);
//		System.out.println(set1);
		
		// union operation of two sets by own static method
		System.out.println("Union means - Adding all of the elements in the\n" 
				+ "specified collection(set2) to this set(set1) if they're not already present:\n"
				+ "Set1 now contains values: " +  union(set1, set2));
		
		//intersection operation of two sets by default method
//		set1.retainAll(set2);
//		System.out.println(set2);
		System.out.println();
		
		// intersection operation of two sets by own static method
		System.out.println("Intersection means - removes from this set(set1) all of its elements\n"
				+ "that are not contained in the specified collection\n"
				+ "Set1 now contains values: " + intersect(set1, set2));
		System.out.println(set1);
		System.out.println(set2);
		System.out.println("All changes done to set1 in own parameterized methods also change values in set1 in main method");
	}
	
	
}
