import java.util.Scanner;

public class examples {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		
		if(age<18) {
			System.out.println("You should study");
		}else {
			System.out.println("You should start working");
			
		}
	}

}
