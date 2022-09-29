import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Do you have a diploma?");
		boolean diploma=scan.nextBoolean();
		
		if(diploma=true);
		{
			System.out.println("Congratulations!");
			System.out.println("What is your GPA?");
			
			double GPA= scan.nextDouble();
			
			if(GPA>=3.5) {
				System.out.println("You are eligible for scholarship");		
			
			}else {	
			System.out.println("You should have studied harder");
			}
		
			
		}
	}
		}




