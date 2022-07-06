package encapsulationInheritanceEmployee;

public class PermanentEmployee extends Employee {

	PermanentEmployee(String fname, String lname, long sin, double wage) {
		super(fname, lname, sin, wage);

	}

	@Override
	public double CalculatePay() {
		// biweekly salary is given to permanent employees
		return monthlySalary;
	}
}
