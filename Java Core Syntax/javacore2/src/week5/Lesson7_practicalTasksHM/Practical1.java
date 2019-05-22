package week5.Lesson7_practicalTasksHM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Practical1 {

	public static void main(String[] args) {
		
		List <Integer> myCollection = new ArrayList<>();
		
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			myCollection.add(random.nextInt(41));
		}
		System.out.println("My Collection consist numbers: " + myCollection);
		
		List <Integer> newCollection = new ArrayList<>();
		
		// task A) Find and save in list newCollection all positions of element more than 5 in the collection
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 5) {
				newCollection.add(i);
			}
		}
		
		System.out.println("Positions of all elements of MyCollection, which are more than 5 are: " + newCollection);
		System.out.println();
		//task B) Remove from collection myCollection elements, which are greater then 20 and less then 10
		
//		Iterator <Integer> iterator = myCollection.iterator();
//		Integer toDelete = null;
//		while (iterator.hasNext()){
//			toDelete = iterator.next();
//			if (toDelete > 20 || toDelete < 10){
//				iterator.remove();
//			}
//		}
		
//		System.out.println("My collection without elements, which are greater than 20 and less than 10: " + myCollection);
		
		//task C) Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
		System.out.println();
		myCollection.add(2, 1);
		myCollection.add(8, -3);
		myCollection.add(5, -4);
		System.out.println("My collection after inserting lements 1, -3, -4 in positions 2, 8, 5.");
		int i = 0;
		for (Integer integer : myCollection) {
			System.out.println("position - " + i++ + ", value of element - " + integer);
		}
		System.out.println();
		//Task D) sorting array using toArray
		
		Integer [] integers = new Integer [myCollection.size()];
		
		integers = myCollection.toArray(integers);
		
		Arrays.sort(integers);
		System.out.print("My collection converted to array and sorted: ");
		for (int j = 0; j < integers.length; j++) {
			System.out.print(integers[j] + " ");
		}
		
		// Task D) Sorting collection using comparator
		System.out.println();
		myCollection.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				return arg0 - arg1;
			}
		});
		System.out.println("My collection sorted using Anonymous class Comparator " + myCollection);
		
		
	}
	
}
