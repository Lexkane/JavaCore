package week4.hm4;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car("Chevy", 1978, 5);
		Car car2 = new Car("Shelby", 1964, 6);
		Car car3 = new Car("Dodge", 1987, 4);
		Car car4 = new Car("Ford", 1992, 3);
		
		Car [] cars = new Car [4];
		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;
		cars[3] = car4;
		
		System.out.println("Enter the certain model year of the car, to look at");

		Scanner sc = new Scanner(System.in);
		
		int certainYear = sc.nextInt();
		
		for (Car car : cars) {
			if (car.getYearOfProduction() == certainYear){
				System.out.println(car);
			}
		}
		System.out.println();
		// orderring by the field year
		System.out.println("Now, lets order cars by the field year in ASC order");
		
		for (int i = cars.length; i >=2 ; i--) {
			boolean sorted = true;
			for (int j = 0; j < i-1; j++) {
				if (cars[j].getYearOfProduction() > cars[j+1].getYearOfProduction()){
					Car smallerYearCar = cars[j+1];
					cars[j+1] = cars[j];
					cars[j] = smallerYearCar;
					sorted = false;
				}
			}
			if (sorted){
				break;
			}
		}
		for (Car car : cars) {
			System.out.println(car);
		}
		
		
	}
	
	
	
	
}
