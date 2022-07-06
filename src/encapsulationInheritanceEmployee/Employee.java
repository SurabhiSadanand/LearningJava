package encapsulationInheritanceEmployee;

public class Employee {

	// Employee class variables
	String firstName;
	String lastName;
	private long sinNumber;
	protected double monthlySalary;

	// Parameterized constructor
	Employee(String fname, String lname, long sin, double wage) {

		firstName = fname;
		lastName = lname;
		sinNumber = sin;
		monthlySalary = wage;
	}

	// Getter and setter for instance variables-implementing encapsulation
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getSinNumber() {
		return sinNumber;
	}

	public double getSalary() {
		return monthlySalary;
	}

	public void setSalary(double salary) {
		if (salary == 0) {
			System.out.println("Error- Salary cannot be set to zero!!");
		} else {
			this.monthlySalary = salary;
		}
	}

	public double CalculatePay() {
		return monthlySalary;
	}
}
