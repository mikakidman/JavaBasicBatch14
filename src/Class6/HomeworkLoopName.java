package Class6;

import java.util.Scanner;

public class HomeworkLoopName {

	public static void main(String[] args) {
		// Prompt the user to ask the name 3 times and print "Good afternoon + name..."
		
		Scanner scan=new Scanner(System.in);
		String name;
		for(int a=1; a<=3; a++) {
			System.out.println("What is your name?");
			name=scan.nextLine();
			System.out.println("Good afternoon " + name + ".");
			
		}

	}

}
