import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number of day");
int day=scan.nextInt();

if(day>=1 && day<=5) {
	System.out.println("It is weekday");
	
}
else if(day>=6 && day<=7){
	System.out.println("It is weekend");
}
else {
	System.out.println("Invalid day");
}

	}

}
