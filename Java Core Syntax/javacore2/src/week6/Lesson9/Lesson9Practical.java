package week6.Lesson9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson9Practical {

	public static int squareRecktangle(int a, int b) {
		
		if (a <= 0 || b <= 0) {
			throw new ArithmeticException();
		}
		return a*b;
		
	}
	
	
	public static void main(String[] args) {
		
		//task 1
		Scanner scanner = new Scanner(System.in);
		
		try {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(squareRecktangle(a, b));
		} catch (InputMismatchException IME) {
			System.out.println("You entered not a number");
			IME.printStackTrace();
		} catch (ArithmeticException AE) {
			System.out.println("You entered number 0 or less then 0");
			AE.printStackTrace();
		} catch (Exception e) {
			System.out.println("other exception");
			e.printStackTrace();
		}
		
		System.out.println("Finished");
	
		
		//task2
		try {
			Plant plant = new Plant(2, "BLUE", "long");
			System.out.println(plant);
		} catch (ColorException | TypeException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
