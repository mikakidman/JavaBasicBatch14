package Class12;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		String userName;
		String password;
		String confirmPassword;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the userName");
		userName=scan.next();
		System.out.println("Please enter the password");
		password=scan.next();
		System.out.println("Please enter the password again");
		confirmPassword=scan.next();
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty" );
		}else if(password.length()<8) {
			System.out.println("Password is too short");
		}else if(password.contains(userName)) {
			System.out.println("Password cannot contain username");
		}else if(!password.equals(confirmPassword)) {
			System.out.println("Password do not match");
		}else {
			System.out.println("Your username and password has been created");
		}

	}

}
