package week6.Lesson10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Lesson10Practic {

	public static void main(String[] args) throws InterruptedException {
		
		
		//task 1)
//		for (int i = 0; i < 10; i++) {
//			System.out.println("I study Java");
//			Thread.sleep(1000);
//		}
		
		
		//task 2)
//		Thread t1 = new MyThread1();
//		Thread t2 = new MyThread2();
//		
//		t1.start();
//		t2.start();
//		t1.join();
//		t2.join();
//		
//		System.out.println("«My name is Yura»");
//		
		
		//task 3)
		//
		String [] arrayString = new String [10];
		String fileName = "mytext.txt";
		String s = null;
		int num = 0;
		int countOfSymbols = 0;
		int shortestLineQ = 0;
		int shortestLineNum = 0;
		int longestLineQ = 0;
		int longestLineNum = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
		{
			br.mark(1);
			shortestLineQ = br.readLine().length();
			br.reset();
			while ((s = br.readLine()) != null){
				
				arrayString[num] = s;
				countOfSymbols = arrayString[num].length();
//				if (arrayString[num].contains("var")){
					System.out.println("Row number " + (num+1) + ": '"+ arrayString[num] + "'. Numbers of symbols of this line is " + countOfSymbols + ".");
//				}
				
				
				if (longestLineQ < countOfSymbols ) {
					longestLineQ = countOfSymbols;
					longestLineNum = num;
				}
				
				if (shortestLineQ > countOfSymbols ) {
					shortestLineQ = countOfSymbols;
					shortestLineNum = num;
				}
									
				num++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Shortest line is " + shortestLineNum + ". Numbers of symbols of shortest line is "+ shortestLineQ);
		System.out.println("Longest line is " + longestLineNum + ". Numbers of symbols of longest line is "+ longestLineQ);
		

//		int [] arrayInt = {1, 6, 2, 2, 3, 3, 9, 5};
//		int [] newArray = new int [arrayInt.length];
//		for (int i = arrayInt.length-1, k=0; i >= 0 && k < newArray.length; i--, k++) {
//			newArray[k] = arrayInt[i];
//			System.out.println(newArray[k]);
//		}
//		System.out.println();
//		int temp = 0;
//		for (int i = 0; i < arrayInt.length/2; i++) {
//			temp = arrayInt[i];
//			arrayInt[i] = arrayInt[arrayInt.length-i-1];
//			arrayInt[arrayInt.length-i-1] = temp;
//		}
//		for (int i = 0; i < arrayInt.length; i++) {
//			System.out.println(arrayInt[i]);
//		}
//		
//		Set <Integer> set1 = new HashSet<>();
//		for (int i = 0; i < arrayInt.length; i++) {
//			set1.add(arrayInt[i]);
//		}
//		
//		System.out.println();
//		for (Integer integer : set1) {
//			System.out.print(integer);
//		}
	}
	
}
