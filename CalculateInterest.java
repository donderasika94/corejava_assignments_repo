package basic_assignments;

import java.util.Scanner;

public class CalculateInterest {
	public static void main(String[] args) {
		double simple_interest, compound_interest, principal;
		int interest, years;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Amount:");
		principal = scanner.nextDouble();

		System.out.println("Enter rate of interest:");
		interest = scanner.nextInt();

		System.out.println("Enter Number of years");
		years = scanner.nextInt();

		simple_interest = principal * interest * years / 100;
		compound_interest = principal * (Math.pow((1 + interest / 100), years));

		System.out.println("Simple interest:" + simple_interest);
		System.out.println("Compund interest:" + compound_interest);

		scanner.close();
	}

}