import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What time is it now? (Please use 24 hour format)");
		double hour=scan.nextDouble();
		if(hour>=1 && hour<=11) {
			System.out.println("Morning");
		}
		else if(hour>=12 && hour<=15){
			System.out.println("Afternoon");
		}
		else if(hour>=16 && hour<=20){
			System.out.println("Evening");
		}
		else {
			System.out.println("Night");
		}

			}

		

	

	}


