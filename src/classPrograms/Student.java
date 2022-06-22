package classPrograms;

public class Student {

	String studentName;
	int[] marks = new int[5];
	int sum = 0;

	double percentage() {
		for (int i = 0; i < marks.length; i++) {

			sum += marks[i];

		}
		return sum / 5;
	}
}
