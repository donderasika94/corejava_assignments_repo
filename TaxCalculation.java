package basic_assignments;

import java.util.Scanner;

public class TaxCalculation {
	public static void main(String[] args) {
		int salary;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your salary:");
		salary = scanner.nextInt();
		float taxAmount = 0;

		if (salary >= 0 && salary <= 180000) {
			taxAmount = salary * 0;
			System.out.println("You dont have to pay tax");
		} else if (salary >= 180001 && salary <= 300000) {
			taxAmount = salary * 0.1f;
			System.out.println("you have to pay 10% tax on you salary:" + taxAmount);
		} else if (salary >= 300001 && salary <= 500000) {
			taxAmount = salary * 0.2f;
			System.out.println("you have to pay 20% tax on you salary:" + taxAmount);
		} else if (salary >= 500001 && salary <= 1000000) {
			taxAmount = salary * 0.3f;
			System.out.println("you have to pay 30% tax on you salary:" + taxAmount);
		} 
		scanner.close();

	}

}
