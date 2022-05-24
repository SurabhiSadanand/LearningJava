package assignment2_Java;

public class LicenseProgram {

	public static void main(String[] args) {
		int age = 23;
		String licenseIssued;
		String currentLevel = "G1";

		// Print the input for age and current license level
		System.out.println("\n Age of the person applying for license: " + age);
		System.out.println("\n Current level of license of the person: " + currentLevel);

		// to check if age>18 and no license yet
		if (age >= 18 && currentLevel.equals("")) {
			licenseIssued = "G1";
			System.out.println("\n License that can be issued: " + licenseIssued);
		}
		// to check if age>18 && G1 license holder
		else if (age >= 18 && (currentLevel.equals("G1") || currentLevel.equals("g1"))) {
			licenseIssued = "G2";
			System.out.println("\n License that can be issued: " + licenseIssued);
		}
		// to check if age>18 && G2 license holder
		else if (age >= 18 && (currentLevel.equals("G2") || currentLevel.equals("g2"))) {
			licenseIssued = "G";
			System.out.println("\n License that can be issued: " + licenseIssued);
		}
		// to check if age>18 && G license holder
		else if (age >= 18 && (currentLevel.equals("G") || currentLevel.equals("g"))) {
			System.out.println("\n Already a G license holder");
		}
		// to check if age<18
		else if (age < 18) {
			System.out.println("\n License cannot be issued for this age group");
		}
		// to check if invalid character is provided as input for license level
		else {
			System.out.println("\n Enter a valid input for License Level or age ");
		}

	}

}
