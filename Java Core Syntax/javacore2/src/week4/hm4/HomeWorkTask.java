package week4.hm4;

import java.util.Scanner;

public class HomeWorkTask {

	public static void main(String[] args) {

		// TASK 1
		System.out.println(
				"Pls enter a number of month to look what is the amount of day in this month (write number from 1 to 12)");

		Scanner sc = new Scanner(System.in);

		if (sc.hasNextInt()) {
			int numberOfMonth = sc.nextInt();
			Month[] monthes = new Month[Month.values().length];
			monthes = Month.values();

			if (numberOfMonth > 0 && numberOfMonth < 13) {
				for (Month month : monthes) {
					if (month.ordinal() == numberOfMonth - 1) {
						System.out.println("The amount of days in " + month + " are " + month.getDaysOfMonth());
					}
				}
			} else {
				System.out.println("There is no such number, pls enter numbers from 1 to 12");
			}
		} else {
			System.out.println("you wrote not a number");
		}
		System.out.println();
		// TASK 2
		int array[] = { 10, 12, 4, 2, 1, -1, -7, 5, -3, 9 };

		int sum = 0;
		int product = 1;
		int countForSum = 0;

		while (array[countForSum] >= 0 && countForSum <= 4) {
			countForSum++;
		}
		if (countForSum == 5) {
			for (int j = 0; j < countForSum; j++) {
				sum += array[j];
			}
			System.out.println("The Sum of the array is " + sum);
			// break;
		} else {
			for (int j = array.length - 1; j >= array.length - 5; j--) {
				product *= array[j];
			}
			System.out.println("The product of the array is " + product);
			// break;
		}
		System.out.println();
		// TASK 3
		// finding position of second positive number
		int array2[] = { -4, -1, 12, -2, 11, -5 };

		int secondPosition = 2;
		int countForPositives = 0;
		int position = 0;

		while (position < array.length) {
			if (array2[position] > 0) {
				countForPositives++;
				if (countForPositives == secondPosition) {
					System.out.println("Position of second positive number is: " + position);
					countForPositives = 0;
					break;
				}
			}
			position++;
		}

		// same TASK3 with FOR
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] > 0) {
				countForPositives++;
				if (countForPositives == secondPosition) {
					System.out.println("Position of second positive number is: " + i);
					break;
				}
			}
		}
		System.out.println();
		// finding minimum and its position in the array
		int min = 0;
		int posit = 0;
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] < min) {
				min = array2[i];
				posit = i;
			}
		}
		System.out.println("Minimum value of the array2 is " + min);
		System.out.println("The Position of the minimum value is " + posit);
		System.out.println();

		// TASK4
		int enterNumber;
		int productNumbers=1;
		System.out.println("Write down the integer number. It will be last until you enter negative number.");
		do {
			enterNumber = sc.nextInt();
			productNumbers *= enterNumber;
			System.out.println("The product of all entered numbers is: " + productNumbers);
		} while (enterNumber > 0);
		System.out.println("You entered negative number. Program stoped");
		
		
	}

}
