package Class12;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		/*
		 *  Write a program that reads two people's first names and if they expecting boy or girl?
		 *  Based on the input suggests a name for a baby.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter mother's name");
		String mother=scan.nextLine().toUpperCase();
		
		System.out.println("Please enter father's name");
		String father=scan.nextLine().toUpperCase();
		System.out.println("Are you expecting boy or girl?");
		String gender=scan.nextLine();
		
		if(gender.equals("boy")) {
			System.out.println("Suggested name: " + father.substring(0,3)+ mother.substring(mother.length()-3, mother.length()));
			
		}else {
			System.out.println("Suggested name: " +mother.substring(0,2) +father.substring(father.length()-3, father.length()));
		}
	}

}
