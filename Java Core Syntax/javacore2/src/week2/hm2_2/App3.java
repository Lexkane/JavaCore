package week2.hm2_2;

import java.util.Scanner;

public class App3 {

	
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Vova", 1990);
		Person p3 = new Person("Orest", 1984);
		Person p4 = new Person("Taras", 1989);
		Person p5 = new Person();
		
		Scanner sc = new Scanner(System.in);

		p1.input(sc);
		p5.input(sc);
		System.out.println(p1.outPut());
		System.out.println(p5.outPut());
		System.out.println("Age of " + p2.getName() + " is " + p2.age());
		p3.changeName(sc);
		System.out.println(p3.outPut());
		System.out.println(p2.outPut());
		System.out.println(p4.outPut());
	}
}
