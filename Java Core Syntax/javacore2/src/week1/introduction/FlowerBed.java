package week1.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FlowerBed {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// task 1)
		System.out.println("Flower bed is shaped like a circle." + "\n" + "Calculate the perimeter and area by entering the radius.");
		System.out.println("Pls, enter the radius of flower bed:");
		
		double radius = Double.parseDouble(br.readLine());
		double perimeterResult = 2*Math.PI*radius;
		double areaResult = Math.PI*radius*radius;
		
		System.out.println("Perimeter of flower bed is: " + perimeterResult);
		System.out.println("Area of flower bed is: " + areaResult);
		// TODO: як вивести лише 2 знаки п≥сл€ коми?
		
		//task 2)
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("What is your name:");
		String name = sc.nextLine();
		System.out.println("Where do you live, " + name + "?");
		String address = sc.nextLine();
		System.out.println("You live in "+ address + " and how old are you?");
		age = sc.nextInt();
		System.out.println("I'm " + age + " years old.");
		
		//task 3)
		System.out.println("Write the price for phone call from France: ");
		double c1 = Double.parseDouble(br.readLine());
		System.out.println("Write the price for phone call from Germany: ");
		double c2 = Double.parseDouble(br.readLine());
		System.out.println("Write the price for phone call from Netherlands: ");
		double c3 = Double.parseDouble(br.readLine());
//		System.out.println("Phone call from France costs: " + c1 + " standard units");
//		System.out.println("Phone call from Germany costs: " + c2 + " standard units");
//		System.out.println("Phone call from Netherlands costs: " + c3 + " standard units");
		
		System.out.println("How many minutes phone call from France continued?");
		double t1 = Double.parseDouble(br.readLine());
		System.out.println("How many minutes phone call from Germany continued?");
		double t2 = Double.parseDouble(br.readLine());
		System.out.println("How many minutes phone call from Netherlands continued?");
		double t3 = Double.parseDouble(br.readLine());
//		System.out.println("Phone call from France continued: " + t1 + " minutes");
//		System.out.println("Phone call from Germany continued: " + t2 + " minutes");
//		System.out.println("Phone call from Netherlands continued: " + t3 + " minutes");
		
		System.out.println("Phone call from France cost " + c1*t1 + " standard units");
		System.out.println("Phone call from Germany cost " + c2*t2 + " standard units");
		System.out.println("Phone call from Netherlands cost " + c3*t3 + " standard units");
	}
	
}
