package Homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// switch case

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the first number");
		int n1=input.nextInt();
		System.out.println("Please enter the second number");
		int n2=input.nextInt();
		System.out.println("Please enter an operator");
		char operator=input.next().charAt(0);
		
		int result=0;
		switch(operator) {
		case '+':
			result=(n1+n2);
			break;
		case '-':
			result=(n1-n2);
			break;
		case '*':
			result=(n1*n2);
			break;
		case '/':
			result=(n1/n2);
			break;
			default:
				result=0;
		}
		System.out.println(result);
		}
	}


