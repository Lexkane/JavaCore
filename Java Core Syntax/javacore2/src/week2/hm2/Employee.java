package edu.hm2;

public class Employee {

	private String name;
	private double rate;
	private double hours;
	
	static double totalSum;
	static double totalHours;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, double rate, double hours) {
		
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum += salary();
		totalHours += hours;
	}

	public Employee(String name, double rate) {
		
		this.name = name;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		totalSum -= this.salary(); 
		this.rate = rate;
		totalSum += salary();
	}

	public double getHours() {
		
		return hours;
		
	}

	public void setHours(double hours) {
		totalSum -= this.salary(); 
		totalHours -= this.hours;
		this.hours = hours;
		totalSum += salary();
		totalHours += hours;
	}

	public static double getTotalSum() {
		return totalSum;
	}
	
	private double salary() {
		return this.rate*this.hours;
	}

	public double getSalary(){
		return salary();
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	public double bonuses(){
		return salary()*0.1;
	}
	
	
}
