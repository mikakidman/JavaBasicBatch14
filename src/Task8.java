import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int number=scan.nextInt();

		if(number>=1 && number<=10) {
			System.out.println("This is small number");
		}
		else if(number>=11 && number<=100){
			System.out.println("This is medium number");
		}
		else if(number>=101 && number<=1000){
			System.out.println("This is large number");
		}

			}

		

	}


