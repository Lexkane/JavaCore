package week4.Lesson5;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Yura", 2, 4000.00);
		Employee employee2 = new Employee("Taras", 3, 3000.00);
		Employee employee3 = new Employee("Vova", 1, 5000.00);
		Employee employee4 = new Employee("Andrew", 2, 2000.00);
		Employee employee5 = new Employee("Oleg", 4, 6000.00);
		
		
		Employee employees [] = new Employee [5];
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		employees[3] = employee4;
		employees[4] = employee5;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Pls, enter department number from 1-4, to know about the employees that work in this department");
		
		int departmentNumber = sc.nextInt(); 
		for (Employee employee : employees) {
			if (departmentNumber == employee.getDepartment_number()){
				System.out.println(employee);
			}
		}
		System.out.println("TASK FOR ARRANGING BY DESCENDING");
		// sortind by descending 
		for (int i = employees.length; i >= 2  ; i--) {
			boolean sorted = true;
			
			for (int j = 0; j < i-1; j++) {
				if (employees[j].getSalary() < employees[j+1].getSalary()){
					Employee empTemp = employees[j+1];
					employees[j+1] = employees[j];
					employees[j] = empTemp;
					sorted = false;
				}
			}
			if (sorted){
				break;
			}
		}
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
	}
	
	
	
	
}
