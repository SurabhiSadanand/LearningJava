package classPrograms;

public class CompoundInterest {

	double calculateInterest(int principal, double rate, int time) {
		return principal * Math.pow(1 + (rate / 12), 12 * time);

	}
}
