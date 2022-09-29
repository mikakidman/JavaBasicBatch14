package Homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// Scanner
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the first number");
		int n1=input.nextInt();
		System.out.println("Please enter the second number");
		int n2=input.nextInt();
		System.out.println("Please enter an operator");
		char operation=input.next().charAt(0);
		
		if(operation=='+') {
			System.out.println(n1+n2);
		}else if (operation=='-') {
			System.out.println(n1-n2);
		}else if (operation=='*') {
			System.out.println(n1*n2);
		}else if (operation=='/') {
			System.out.println(n1/n2);
		}else {
			System.out.println("Wrong operation");
		}
	}

}
