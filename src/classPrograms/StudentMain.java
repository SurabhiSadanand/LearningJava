package classPrograms;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Student surabhi = new Student();
		System.out.println("Enter Student Name: ");
		Scanner sc = new Scanner(System.in);
		surabhi.studentName = sc.next();
		System.out.println("Enter marks in 5 subjects: ");
		for (int i = 0; i < 5; i++) {
			surabhi.marks[i] = sc.nextInt();
		}

		double percentage = surabhi.percentage();
		System.out.println("The percentage of marks calculated: " + percentage);
		sc.close();
	}

}
