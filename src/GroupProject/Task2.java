package GroupProject;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner search=new Scanner(System.in);
		String[] counts=new String[5];
		String[][] countries= {
				{"Kazakhstan", "USA", "England", "Ukraine", "Canada"},
				{"Astana", "Washington", "London", "Kiev", "Ottawa"}};
		
		System.out.println("Please enter your country");
		for(int i=0; i<counts.length; i++) {
			counts[i]=search.next();
			
			for(String[] country:countries) {
				for(String c:country) {
					if(c.equals(counts[i]) && c.equals(countries[0][0])) {
						System.out.println("The capital of " + countries[0][0]+ " is " + countries[1][0]);
					}
					else if(c.equals(counts[i]) && c.equals(countries[0][1])) {
						System.out.println("The capital of " + countries[0][1]+ " is " + countries[1][1]);
					}
					else if(c.equals(counts[i]) && c.equals(countries[0][2])) {
						System.out.println("The capital of " + countries[0][2]+ " is " + countries[1][2]);
					}
					else if(c.equals(counts[i]) && c.equals(countries[0][3])) {
						System.out.println("The capital of " + countries[0][3]+ " is " + countries[1][3]);
					}
					else if(c.equals(counts[i]) && c.equals(countries[0][4])) {
						System.out.println("The capital of " + countries[0][4]+ " is " + countries[1][4]);
					}
				}
			}
		}

	}

}
