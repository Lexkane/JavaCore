package week3.hm3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// task1
		//A
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write down three float numbers");

		float f1 = Float.parseFloat(bf.readLine());
		float f2 = Float.parseFloat(bf.readLine());
		float f3 = Float.parseFloat(bf.readLine());

		if ((f1 <= 5 && f1 >= -5) && (f2 <= 5 && f2 >= -5) && (f3 <= 5 && f3 >= -5)) {
			System.out.println("All 3 float numbers belong to range [-5, 5]");
		} else {
			System.out.println("All These numbers are not belong to range [-5, 5]");
		}

		// task 1 B)

		System.out.println("Write down 3 integers");
		int i1 = Integer.parseInt(bf.readLine());
		int i2 = Integer.parseInt(bf.readLine());
		int i3 = Integer.parseInt(bf.readLine());

		if (i1 > i2) {
			if (i1 > i3) {
				System.out.println("Max value of integers is: " + i1);
			} else if (i1 < i3) {
				System.out.println("Max value of integers is: " + i3);
			} else {
				System.out.println("Max value of integers are: " + i1 + " and " + i3);
			}
		} else if (i1 < i2) {
			if (i2 > i3) {
				System.out.println("Max value of integers is: " + i2);
			} else if (i2 < i3) {
				System.out.println("Max value of integers is: " + i3);
			} else {
				System.out.println("Max value of integers are: " + i2 + " and " + i3);
			}
		} else {
			if (i1 > i3) {
				System.out.println("Max value of integers are: " + i1 + " and " + i2);
			} else if (i1 < i3) {
				System.out.println("Max value of integers is: " + i3);
			} else {
				System.out.println("All integers are equals: " + i1 + " and " + i2 + ", " + i3);
			}
		}
		
		// task 1 C)
		System.out.println("Write number of HTTPEror from 400 to 403 to look for message");

		int httpErrorNumber = Integer.parseInt(bf.readLine());

		switch (httpErrorNumber) {
		case 400:
			System.out.println(HTTPError.BAD_REQUEST);
			break;
		case 401:
			System.out.println(HTTPError.UNATHORIZED);
			break;
		case 402:
			System.out.println(HTTPError.PAYMENT_REQUIRED);
			break;
		case 403:
			System.out.println(HTTPError.FORBIDDEN);
			break;
		default: System.out.println("You wrote wrong number");
			break;
		}
		
		
		
		
		// task 2
		//b)
		Dog dog1 = new Dog("Jack", 6, Breed.MALAMUTE);
		Dog dog2 = new Dog("Rex", 4, Breed.PIT_BULL);		
		Dog dog3 = new Dog("Duke", 6, Breed.SPANIEL);
		
		
		
		//c) Check if there is no two dogs with the same name. 
		if (dog1.checkIfTheNameEquals(dog2)){
			System.out.println("Yeah, the names of comparing dogs are the same");
		} else if (dog1.checkIfTheNameEquals(dog3)){
			System.out.println("Yeah, the names of comparing dogs are the same");
		} else if (dog2.checkIfTheNameEquals(dog3)){
			System.out.println("Yeah, the names of comparing dogs are the same");
		} else {
			System.out.println("The names of these dogs are not the same");
		}
		
		
		//d) Display the name and the kind of the oldest dog.
		if (dog1.checkTheOldestDog(dog2) > 0) {
			if (dog1.checkTheOldestDog(dog3) > 0){
				System.out.println(dog1.toStringNameAndBreed());
			} else if (dog1.checkTheOldestDog(dog3) < 0){
				System.out.println(dog3.toStringNameAndBreed());
			} else {
				System.out.println(dog1.toStringNameAndBreed() + "\n" + dog3.toStringNameAndBreed());
			}
		} else if (dog1.checkTheOldestDog(dog2) < 0) {
			if (dog2.checkTheOldestDog(dog3) > 0) {
				System.out.println(dog2.toStringNameAndBreed());
			} else if (dog2.checkTheOldestDog(dog3) < 0){
				System.out.println(dog3.toStringNameAndBreed());
			} else {
				System.out.println(dog2.toStringNameAndBreed() + "\n" + dog3.toStringNameAndBreed());
			}
		} else {
			if (dog1.checkTheOldestDog(dog3) > 0){
				System.out.println(dog1.toStringNameAndBreed() + "\n" + dog2.toStringNameAndBreed());
			} else if (dog1.checkTheOldestDog(dog3) < 0){
				System.out.println(dog3.toStringNameAndBreed());
			} else {
				System.out.println(dog1.toStringNameAndBreed() + "\n"+ dog2.toStringNameAndBreed() + "\n" + dog3.toStringNameAndBreed());
			}
		}
		
		
		

	}
}
