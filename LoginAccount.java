package basic_assignments;

import java.util.Scanner;

public class LoginAccount {
	public static void main(String[] args) {
		String username;
		String password;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Username:");
		username=scanner.next();
		System.out.println("Enter Password");
		password=scanner.next();
		
		if(username.equals(username) && password.equals(password)) {
			System.out.println("WELCOME " +username);
		}
	}

}
