package ArithmeticOperators;

public class SalaryCalculator {

	public static void main(String[] args) {

		double weeklySalary, tax, finalSalary = 0;
		weeklySalary = 14 * 8 * 5;
		tax = 0.10 * weeklySalary;
		finalSalary = weeklySalary - tax;
		System.out.println("Weekly salary: " + weeklySalary);
		System.out.println("\nTax deduction: " + tax);
		System.out.println("\nTake home salary (Weekly Salary-Tax deductions): " + finalSalary);

	}

}
