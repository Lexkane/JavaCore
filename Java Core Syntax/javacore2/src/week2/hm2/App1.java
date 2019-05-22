package edu.hm2;

public class App1 {

	public static void main(String[] args) {
		
		Employee empl1 = new Employee("Yura", 20, 8);
		Employee empl2 = new Employee("Taras", 15);
		empl2.setHours(5);
		Employee empl3 = new Employee();
		empl3.setName("Vova");
		empl3.setRate(13);
		empl3.setHours(7);
		
		System.out.println(empl1);
		System.out.println(empl2);
		System.out.println(empl3);
		
		System.out.println(empl1.getSalary());
		System.out.println(empl1.bonuses());
		
		System.out.println(Employee.totalSum);
		System.out.println(Employee.totalHours);
		
	}
	
	
}
