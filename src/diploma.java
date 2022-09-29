import java.util.Scanner;

public class diploma {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you have a diploma? (Please enter True or False)");
		
		boolean hasDiploma=scan.nextBoolean();
		
		if(hasDiploma) {
			System.out.println("Congratulations!");
			System.out.println("What is your GPA score?");
			
			double GPA=scan.nextDouble();
			if(GPA>=3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
			
			}else {
				System.out.println("You should get a degree");
		}

	}

}
