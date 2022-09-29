import java.util.Scanner;

public class loanSpecialist {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the amount of loan is needed?");
		
		double loanAmount = scan.nextDouble();
		if(loanAmount<=200000) {
			System.out.println("Congratulations, I can lend you money");
		}else {
			System.out.println("Sorry, I cannot lend you money");
		}

	}

}
