package week4.hm6_2;

public abstract class Employee implements CalculatingSalary {

	static int idAll = 0;
	private String employeeId;
	
	public Employee() {
		
		this.employeeId = Integer.toString(++idAll);
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	
	
}
