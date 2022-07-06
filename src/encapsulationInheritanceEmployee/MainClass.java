package encapsulationInheritanceEmployee;

public class MainClass {

	public static void main(String[] args) {
		// array of objects of Employee type
		Employee[] emp = new Employee[10];
		double highestSalary = 0;
		double lowestSalary = 0;
		// Populating array with information of employees
		// Permanent Employees
		emp[0] = new PermanentEmployee("Surabhi", "Sadanand", 1234, 6000);
		emp[1] = new PermanentEmployee("Neetu", "Jayapalan", 1244, 8000);
		emp[2] = new PermanentEmployee("Shijo", "Joseph", 5634, 5000);
		// Contract Employees
		emp[1] = new ContractEmployee("Jerin", "Biju", 8834, 4800, 40, 30);
		emp[4] = new ContractEmployee("Jithin", "Jose", 9994, 4040, 47, 20);
		emp[5] = new ContractEmployee("Laxmi", "Mariyappan", 5534, 5600, 40, 35);
		// Commission Employees
		emp[2] = new CommissionEmployee("Gurmeen", "Kaur", 8984, 4200, 200, 0.15);
		emp[7] = new CommissionEmployee("Mary", "Mol", 9984, 3500, 350, 0.20);
		emp[8] = new CommissionEmployee("Athira", "S", 4534, 4000, 300, 0.35);
		emp[9] = new CommissionEmployee("Albin", "A", 8934, 6700, 150, 0.40);
		// Printing monthly salary of each employee
		for (int i = 0; i < emp.length; i++) {
			System.out.println("Monthly salary of employee" + (i + 1) + ": " + emp[i].CalculatePay());
		}

		highestSalary = emp[0].CalculatePay();
		lowestSalary = emp[0].CalculatePay();
		// Calculating highest Salary
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].CalculatePay() > highestSalary) {

				highestSalary = emp[i].CalculatePay();
			}
		}
		System.out.println("Highest Salary: " + highestSalary);
		// Calculating lowest Salary
		for (int j = 0; j < emp.length; j++) {
			if (lowestSalary > emp[j].CalculatePay()) {

				lowestSalary = emp[j].CalculatePay();
			}
		}
		System.out.println("Lowest Salary: " + lowestSalary);
	}

}
