import java.util.Scanner;

public class mortgage {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter mortgage rate");
		
		double mortgageRate = scan.nextDouble();
		
		if (mortgageRate<4.5) {
			Scanner Price= new Scanner(System.in);
			
			System.out.println("Please enter mortgage price");
			double mortgagePrice=scan.nextDouble();
			if(mortgagePrice>200000) {
				System.out.println("You should take a loan");
				
			}else {
				System.out.println("You should pay cash");
			}
		}else {
			System.out.println("You can not buy a house");
			}
		}
	}


