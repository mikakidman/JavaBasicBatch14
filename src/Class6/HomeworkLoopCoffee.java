package Class6;

import java.util.Scanner;

public class HomeworkLoopCoffee {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double priceCoffee;
		
		do {
			System.out.println("Please pay for your coffee");
			priceCoffee=scan.nextDouble();
			
			if(priceCoffee>5) {
				System.out.println("Your coffee is 5$. Please pay less");
			}
			else if(priceCoffee<5) {
				System.out.println("Your coffee is 5$. Please pay more");
			}
		}
		while(priceCoffee!=5);
		System.out.println("Enjpy your coffee");
		
		
			
		}
	


	}



