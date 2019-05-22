package week3.Lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticalTasks {

	public static void main(String[] args) {
		
		// task1
		Scanner sc = new Scanner(System.in);
		System.out.println("write down 3 numbers 3 times, one by one");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int result = 0;
		int count =0;
		int count1 = 0;
		
		result = num1%2 != 0? count++ : count;
		result = num2%2 != 0? count++ : count;
		result = num3%2 != 0? count++ : count;
		
		//неефективно
		if (num1%2 != 0){
			count1++;
		} 
		if (num2%2 != 0){
			count1++;
		}
		if (num3%2 != 0){
			count1++;
		}
		
		System.out.println("The number of odd numbers is " + count + ". Перевірка ще одним if conditions: " + count1 + ".");
		
		
		// task2
		System.out.println("write down the number of the week");
		
		int dayNumber = sc.nextInt();
		
		switch (dayNumber) {
		case 1:
			System.out.println("Monday" + "\n" + "Понеділок" + "\n" + "Понедельник");
			break;
		case 2:
			System.out.println("Tuesday" + "\n" + "Вівторок" + "\n" + "Вторник");
			break;
		case 3:
			System.out.println("Wednesday" + "\n" + "Середа" + "\n" + "Среда");
			break;
		case 4:
			System.out.println("Thursday" + "\n" + "Четвер" + "\n" + "Четверг");
			break;
		case 5:
			System.out.println("Friday" + "\n" + "П'ятниця" + "\n" + "Пятница");
			break;
		case 6:
			System.out.println("Saturday" + "\n" + "Субота" + "\n" + "Субота");
			break;
		case 7:
			System.out.println("Sunday" + "\n" + "Неділя" + "\n" + "Воскресенье");
			break;
	
		default: System.out.println("You wrote a wrong number");
			break;
		}
		
		
		//task 3
		System.out.println("write down the name of the country");
		
		String countryName = sc.next();
	
		switch (countryName) {
		case "Ukraine": case "France":
			System.out.println(Continents.EUROPE);
			break;
		case "Brasil":
		case "Argentina":
			System.out.println(Continents.SOUTH_AMERICA);
			break;
		case "USA":
		case "Canada":
			System.out.println(Continents.NORTH_AMERICA);
			break;
		case "Egypt":
		case "Tunis":
			System.out.println(Continents.AFRICA);
			break;
		case "China":
		case "India":
			System.out.println(Continents.ASIA);
			break;
		
		default: System.out.println("You wrote wrong name of Country");
			break;
		}
		
		
		//task 4 using If-else if - else;
		
		Product product1 = new Product("Banana", 35, 3);
		Product product2 = new Product("Orange", 14, 6);
		Product product3 = new Product("Apple", 25, 4);
		Product product4 = new Product("Beetroot", 12, 2);
		
		// displaying name and quantity of the most expensive item
		if (product1.getPrice()*product1.getQuantity() > product2.getPrice()*product2.getQuantity()) {
			if (product1.getPrice()*product1.getQuantity() > product3.getPrice()*product3.getQuantity()){
				if(product1.getPrice()*product1.getQuantity() > product4.getPrice()*product4.getQuantity()) {
					System.out.println("The most expensive item is: " + product1.toStringNameAndQuantity());
				} else if (product1.getPrice()*product1.getQuantity() < product4.getPrice()*product4.getQuantity()) {
					System.out.println("The most expensive item is: " + product4.toStringNameAndQuantity());
				} else {
					System.out.println("The most expensive item are: " + product4.toStringNameAndQuantity() + "\n" + product1.toStringNameAndQuantity());
				}
				
			} else if (product1.getPrice()*product1.getQuantity() < product3.getPrice()*product3.getQuantity()) {
				if (product3.getPrice()*product3.getQuantity() > product4.getPrice()*product4.getQuantity()){
					System.out.println("The most expensive item is: " + product3.toStringNameAndQuantity());
				} else if (product4.getPrice()*product4.getQuantity() > product3.getPrice()*product3.getQuantity()){
					System.out.println("The most expensive item is: " + product4.toStringNameAndQuantity());
				} else {
					System.out.println("The most expensive item are: " + product4.toStringNameAndQuantity() + "\n" + product3.toStringNameAndQuantity());
				}
			} else {
				if (product3.getPrice()*product3.getQuantity() > product4.getPrice()*product4.getQuantity()){
					System.out.println("The most expensive item are: " + product3.toStringNameAndQuantity() + "\n" + product1.toStringNameAndQuantity());
				} else if (product4.getPrice()*product4.getQuantity() > product3.getPrice()*product3.getQuantity()){
					System.out.println("The most expensive item is: " + product4.toStringNameAndQuantity());
				} else {
					System.out.println("The most expensive item are: " + product4.toStringNameAndQuantity() + 
							"\n" + product3.toStringNameAndQuantity() + "\n" + product1.toStringNameAndQuantity());
				}
			}
		} else if (product1.getPrice()*product1.getQuantity() < product2.getPrice()*product2.getQuantity()) {
			if (product2.getPrice()*product2.getQuantity() > product3.getPrice()*product3.getQuantity()) {
				if (product2.getPrice()*product2.getQuantity() > product4.getPrice()*product4.getQuantity()){
					System.out.println("The most expensive item is: " + product2.toStringNameAndQuantity());
				} else if (product2.getPrice()*product2.getQuantity() < product4.getPrice()*product4.getQuantity()) {
					System.out.println("The most expensive item is: " + product4.toStringNameAndQuantity());
				} else {
					System.out.println("The most expensive item are: " + product4.toStringNameAndQuantity() + "\n" + product2.toStringNameAndQuantity());
				}
			} else if (product2.getPrice()*product2.getQuantity() < product3.getPrice()*product3.getQuantity()) {
				if (product3.getPrice()*product3.getQuantity() > product4.getPrice()*product4.getQuantity()){
					System.out.println("The most expensive item is: " + product3.toStringNameAndQuantity());
				} else if (product4.getPrice()*product4.getQuantity() > product3.getPrice()*product3.getQuantity()){
					System.out.println("The most expensive item is: " + product4.toStringNameAndQuantity());
				} else {
					System.out.println("The most expensive item are: " + product4.toStringNameAndQuantity() + "\n" + product3.toStringNameAndQuantity());
				}
			} else {
				if (product3.getPrice()*product3.getQuantity() > product4.getPrice()*product4.getQuantity()){
					System.out.println("The most expensive item are: " + product3.toStringNameAndQuantity() + "\n" + product2.toStringNameAndQuantity());
				} else if (product4.getPrice()*product4.getQuantity() > product3.getPrice()*product3.getQuantity()){
					System.out.println("The most expensive item is: " + product4.toStringNameAndQuantity());
				} else {
					System.out.println("The most expensive item are: " + product4.toStringNameAndQuantity() + 
							"\n" + product3.toStringNameAndQuantity() + "\n" + product2.toStringNameAndQuantity());
				}
			}
		} else {
			if (product1.getPrice()*product1.getQuantity() > product3.getPrice()*product3.getQuantity()){
				if(product1.getPrice()*product1.getQuantity() > product4.getPrice()*product4.getQuantity()) {
					System.out.println("The most expensive item are: " + product1.toStringNameAndQuantity()
					 + "\n" + product2.toStringNameAndQuantity());
				} else if (product1.getPrice()*product1.getQuantity() < product4.getPrice()*product4.getQuantity()) {
					System.out.println("The most expensive item is: " + product4.toStringNameAndQuantity());
				} else {
					System.out.println("The most expensive item are: " + product4.toStringNameAndQuantity() + "\n" + product2.toStringNameAndQuantity()
					+ "\n" + product1.toStringNameAndQuantity());
				}
			} else if (product1.getPrice()*product1.getQuantity() < product3.getPrice()*product3.getQuantity()) {
				if (product3.getPrice()*product3.getQuantity() > product4.getPrice()*product4.getQuantity()){
					System.out.println("The most expensive item is: " + product3.toStringNameAndQuantity());
				} else if (product4.getPrice()*product4.getQuantity() > product3.getPrice()*product3.getQuantity()){
					System.out.println("The most expensive item is: " + product4.toStringNameAndQuantity());
				} else {
					System.out.println("The most expensive item are: " + product4.toStringNameAndQuantity() + "\n" + product3.toStringNameAndQuantity());
				}
			} else {
				if (product3.getPrice()*product3.getQuantity() > product4.getPrice()*product4.getQuantity()){
					System.out.println("The most expensive item are: " + product3.toStringNameAndQuantity() + "\n" + product2.toStringNameAndQuantity()
					+ "\n" + product1.toStringNameAndQuantity() );
				} else if (product4.getPrice()*product4.getQuantity() > product3.getPrice()*product3.getQuantity()){
					System.out.println("The most expensive item is: " + product4.toStringNameAndQuantity());
				} else {
					System.out.println("The most expensive item are: " + product4.toStringNameAndQuantity() + 
							"\n" + product3.toStringNameAndQuantity() + "\n" + product2.toStringNameAndQuantity() + "\n" + product1.toStringNameAndQuantity());
				}
				
			}
		}
		
		// displaying name of the items which has the biggest quantity
		if (product1.getQuantity() > product2.getQuantity()) {
			if (product1.getQuantity() > product3.getQuantity()){
				if(product1.getQuantity() > product4.getQuantity()) {
					System.out.println("The biggest quantity has item : " + product1.toStringName());
				} else if (product1.getQuantity() < product4.getQuantity()) {
					System.out.println("The biggest quantity has item : " + product4.toStringName());
				} else {
					System.out.println("The biggest quantity have items : " + product4.toStringName() + "\n" + product1.toStringName());
				}
				
			} else if (product1.getQuantity() < product3.getQuantity()) {
				if (product3.getQuantity() > product4.getQuantity()){
					System.out.println("The biggest quantity has item : " + product3.toStringName());
				} else if (product4.getQuantity() > product3.getQuantity()){
					System.out.println("The biggest quantity has item : " + product4.toStringName());
				} else {
					System.out.println("The biggest quantity have items : " + product4.toStringName() + "\n" + product3.toStringName());
				}
			} else {
				if (product3.getQuantity() > product4.getQuantity()){
					System.out.println("The biggest quantity have items : " + product3.toStringName() + "\n" + product1.toStringName());
				} else if (product4.getQuantity() > product3.getQuantity()){
					System.out.println("The biggest quantity has item : " + product4.toStringName());
				} else {
					System.out.println("The biggest quantity have items : " + product4.toStringName() + 
							"\n" + product3.toStringName() + "\n" + product1.toStringName());
				}
			}
		} else if (product1.getQuantity() < product2.getQuantity()) {
			if (product2.getQuantity() > product3.getQuantity()) {
				if (product2.getQuantity() > product4.getQuantity()){
					System.out.println("The biggest quantity has item : " + product2.toStringName());
				} else if (product2.getQuantity() < product4.getQuantity()) {
					System.out.println("The biggest quantity has item : " + product4.toStringName());
				} else {
					System.out.println("The biggest quantity have items : " + product4.toStringName() + "\n" + product2.toStringName());
				}
			} else if (product2.getQuantity() < product3.getQuantity()) {
				if (product3.getQuantity() > product4.getQuantity()){
					System.out.println("The biggest quantity has item : " + product3.toStringName());
				} else if (product4.getQuantity() > product3.getQuantity()){
					System.out.println("The biggest quantity has item : " + product4.toStringName());
				} else {
					System.out.println("The biggest quantity have items : " + product4.toStringName() + "\n" + product3.toStringName());
				}
			} else {
				if (product3.getQuantity() > product4.getQuantity()){
					System.out.println("The biggest quantity have items : " + product3.toStringName() + "\n" + product2.toStringName());
				} else if (product4.getQuantity() > product3.getQuantity()){
					System.out.println("The biggest quantity has item : " + product4.toStringName());
				} else {
					System.out.println("The biggest quantity have items : " + product4.toStringName() + 
							"\n" + product3.toStringName() + "\n" + product2.toStringName());
				}
			}
		} else {
			if (product1.getQuantity() > product3.getQuantity()){
				if(product1.getQuantity() > product4.getQuantity()) {
					System.out.println("The biggest quantity have items : " + product1.toStringName()
					 + "\n" + product2.toStringName());
				} else if (product1.getQuantity() < product4.getQuantity()) {
					System.out.println("The biggest quantity has item : " + product4.toStringName());
				} else {
					System.out.println("The biggest quantity have items : " + product4.toStringName() + "\n" + product2.toStringName()
					+ "\n" + product1.toStringName());
				}
			} else if (product1.getQuantity() < product3.getQuantity()) {
				if (product3.getQuantity() > product4.getQuantity()){
					System.out.println("The biggest quantity has item : " + product3.toStringName());
				} else if (product4.getQuantity() > product3.getQuantity()){
					System.out.println("The biggest quantity has item : " + product4.toStringName());
				} else {
					System.out.println("The biggest quantity have items : " + product4.toStringName() + "\n" + product3.toStringName());
				}
			} else {
				if (product3.getQuantity() > product4.getQuantity()){
					System.out.println("The biggest quantity have items : " + product3.toStringName() + "\n" + product2.toStringName()
					+ "\n" + product1.toStringNameAndQuantity() );
				} else if (product4.getQuantity() > product3.getQuantity()){
					System.out.println("The biggest quantity has item : " + product4.toStringName());
				} else {
					System.out.println("The biggest quantity have items : " + product4.toStringName() + 
							"\n" + product3.toStringName() + "\n" + product2.toStringName() + "\n" + product1.toStringName());
				}
				
			}
		}
		
		// task 4 with using list (faster, much faster)
		List <Product> productList = new ArrayList();
		
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);
		
		
		//finding the most expensive
		double maxPrice = 0;
		Product productWithMaxPrice = null;
		for (Product product : productList) {
			if (product.getPrice() > maxPrice){
				maxPrice = product.getPrice();
				productWithMaxPrice = product;
			}
		}
		System.out.println(productWithMaxPrice.toStringNameAndQuantity());
		
		// finding the biggest quantity
		int maxQuantity = 0;
		Product productWithMaxQuantity = null;
		for (Product product : productList) {
			if (product.getQuantity() > maxQuantity) {
				maxQuantity = product.getQuantity();
				productWithMaxQuantity = product;
			}
		}
		System.out.println(productWithMaxQuantity.toStringName());
		
	}
}
