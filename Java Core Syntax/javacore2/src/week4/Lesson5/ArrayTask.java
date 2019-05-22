package week4.Lesson5;

import java.util.Random;

public class ArrayTask {

	public static void main(String[] args) {

		int [] array = new int [10];
		
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(11);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// task1 A)
		int maxValue = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxValue){
				maxValue = array[i];
			}
		}
		System.out.println("Maximum value or Array is: " + maxValue);
		
		//task1  B)
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0){
				sum += array[i];
			}
		}
		System.out.println("Sum of the positive numbers in the array = " + sum);
		
		//task 1 C)
		int array2 [] = {-5, 2, 2, 4, 3, 8, -1, -7, 9, 10};
		int amountNegative = 0;
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] < 0){
				amountNegative++;
			}
		}
		System.out.println("the amount of negative numbers in the array = " + amountNegative);
		if (array2.length - amountNegative > amountNegative){
			System.out.println("There are more positive numbers then negative.");
		} else if (array2.length - amountNegative < amountNegative){
			System.out.println("There are more negative numbers then positive.");			
		} else {
			System.out.println("Equals amount of negative and positive numbers");
		}
		
		
		
		
	}

}
