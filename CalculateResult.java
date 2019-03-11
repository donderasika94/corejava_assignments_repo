package basic_assignments;

import java.util.Scanner;

public class CalculateResult {
	public static void main(String[] args) {
		int subject1, subject2, subject3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks of Three Subject");

		System.out.println("Enter marks of Subject1:");
		subject1 = scanner.nextInt();

		System.out.println("Enter marks of Subject2:");
		subject2 = scanner.nextInt();

		System.out.println("Enter marks of Subject3:");
		subject3 = scanner.nextInt();

		if (subject1 > 60 && subject2 > 60 && subject3 > 60) {

			System.out.println("CONGRATULATIONS!!! YOU HAVE PASSED THE EXAM.....");

		} else if (subject1 > 60 && subject2 > 60 || subject2 > 60 && subject3 > 60 || subject1 > 60 && subject3 > 60) {
			System.out.println("YOU HAVE PROMOTED");
		} else if (subject1 > 60 || subject2 > 60 || subject3 > 60) {
			System.out.println("FAILED");
		} else {
			System.out.println("Put valid input");
		}

		scanner.close();
	}

}
