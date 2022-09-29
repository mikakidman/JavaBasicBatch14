package GroupProject;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the length of array?");
		
		int length = scan.nextInt(); 
		int[] input = new int[length];
		int sum=0;
		
		System.out.println("Please enter elements of array");
		for (int i = 0; i < length; i++) {

			input[i] = scan.nextInt();
			sum= sum+ input[i];
		}
		
		System.out.println("Sum of all elements of array is " + sum);
	}
}


