import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you have a credit card? (Please answer Y or N)");
		
		char haveCreditCard=scan.next().charAt(0);
		
		if(haveCreditCard=='Y') {
			System.out.println("What is the balance on the card?");
			
			double balance=scan.nextDouble();
			if(balance>1000) {
				System.out.println("Please pay off immediately");
				
			}else {
				System.out.println("You can spend more");
			}
		}else {
			System.out.println("May I offer you to apply for a credit card of our bank?");
			
			
			}
		}

	}


