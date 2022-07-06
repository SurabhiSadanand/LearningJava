package encapsulationInheritanceEmployee;

public class CommissionEmployee extends Employee {

	// assuming base salary as monthly salary
	int sales;
	double commissionAmount;

	CommissionEmployee(String fname, String lname, long sin, double salary, int salesAmount, double commissionRate) {
		super(fname, lname, sin, salary);
		sales = salesAmount;
		commissionAmount = commissionRate;
	}

	@Override
	public double CalculatePay() {
		if (sales > 0) {
			monthlySalary += (sales * commissionAmount);
			return monthlySalary;
		}
		return monthlySalary;
	}
}
