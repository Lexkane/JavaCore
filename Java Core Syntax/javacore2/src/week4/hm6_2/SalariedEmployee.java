package week4.hm6_2;

public class SalariedEmployee extends Employee implements CalculatingSalary {

	private String name;
	private double hourlyWage;
	private double numberOfHoursWorkedPerMonth;
	private String socialSecurityNumber;

	public SalariedEmployee(String name, double hourlyWage, double numberOfHoursWorked, String socialSecurityNumber) {
		super();
		this.name = name;
		this.hourlyWage = hourlyWage;
		this.numberOfHoursWorkedPerMonth = numberOfHoursWorked;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public double calculatePay() {
		return this.hourlyWage * this.numberOfHoursWorkedPerMonth;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public double getNumberOfHoursWorkedPerMonth() {
		return numberOfHoursWorkedPerMonth;
	}

	public void setNumberOfHoursWorkedPerMonth(double numberOfHoursWorked) {
		this.numberOfHoursWorkedPerMonth = numberOfHoursWorked;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [id=" + super.getEmployeeId() + ", name=" + name + ", AvarageSalary=" + this.calculatePay() + "]";
	}

	
	
	
}
