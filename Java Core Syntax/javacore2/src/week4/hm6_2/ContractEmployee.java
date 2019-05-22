package week4.hm6_2;

public class ContractEmployee extends Employee {

	private String name;
	private double fixedPaymentPerMonth;
	private int federalTaxIdmember;

	public ContractEmployee(String name, double fixedPaymentPerMonth, int federalTaxIdmember) {
		super();
		this.name = name;
		this.fixedPaymentPerMonth = fixedPaymentPerMonth;
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public double calculatePay() {
		return fixedPaymentPerMonth;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFixedPaymentPerMonth() {
		return fixedPaymentPerMonth;
	}

	public void setFixedPaymentPerMonth(double fixedPaymentPerMonth) {
		this.fixedPaymentPerMonth = fixedPaymentPerMonth;
	}

	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public String toString() {
		return "ContractEmployee [id=" + super.getEmployeeId() + ", name=" + name + ", fixedPaymentPerMonth="
				+ fixedPaymentPerMonth + "]";
	}

}
