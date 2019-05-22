package week4.hm6_2;

import java.util.Collection;
import java.util.Collections;

public class MainEmploy {

	public static void main(String[] args) {

		Employee[] employees = new Employee[4];

		employees[0] = new SalariedEmployee("Yura", 12, 8 * 20, "123");
		employees[1] = new SalariedEmployee("Vova", 10, 8 * 20, "321");
		employees[2] = new ContractEmployee("Taras", 4000, 25);
		employees[3] = new ContractEmployee("Sasha", 5000, 3);

		for (int i = employees.length; i >= 0; i--) {
			boolean sorted = true;
			for (int j = 0; j < i - 1; j++) {
				if (employees[j].calculatePay() < employees[j + 1].calculatePay()) {
					Employee tempEmployee = employees[j];
					employees[j] = employees[j + 1];
					employees[j + 1] = tempEmployee;
					sorted = false;
				}

			}
			if (sorted) {
				break;
			}
		}

		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}

}
