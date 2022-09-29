import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter numbers of your worked years");
		int workedYears=scan.nextInt();
		
		if(workedYears>=5) {
			System.out.println("Please enter amount of your annual salary");
			 double annualSalary=scan.nextDouble();
			 if(annualSalary>50000) {
				 System.out.println("Your bonus is 5000");
			 }else {
				 System.out.println("Your bonus is 3000");
			 }
		}else {
			System.out.println("You are not eligible for the bonus");
			
			 }
		}

	}


