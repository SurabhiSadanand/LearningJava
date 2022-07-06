package encapsulationInheritanceEmployee;

public class ContractEmployee extends Employee {

	int noOfHours;
	int ratePerHour;
	double weeklySalary;

	ContractEmployee(String fname, String lname, long sin, double wage, int hours, int hourlyrate) {
		super(fname, lname, sin, wage);
		noOfHours = hours;
		ratePerHour = hourlyrate;
	}

	@Override
	public double CalculatePay() {
		weeklySalary = noOfHours * ratePerHour;
		// assuming overtime when extra hours > 40
		if (noOfHours > 40) {
			weeklySalary += noOfHours * (1.5 * ratePerHour);
			return weeklySalary * 4;
		}
		return weeklySalary * 4;
	}
}
