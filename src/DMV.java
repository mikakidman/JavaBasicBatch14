import java.util.Scanner;

public class DMV {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("How old are you?");
		 
		int age=scan.nextInt();
		if (age>=18) {
			System.out.println("Congratulations, you will get your  driver licence");
		
		}else {
			System.out.println("You should get your learners permit");
		}

	}

}
