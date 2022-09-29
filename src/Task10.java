import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your birth month");
        String month=scan.next();
        if(month.equals("March")|| month.equals("April")|| month.equals("May")) {
        System.out.println("Spring");
        }
        else if(month.equals("June")|| month.equals("July")|| month.equals("August")) {
        System.out.println("Summer");
        }
        else if(month.equals("September")|| month.equals("October")|| month.equals("November")) {
            System.out.println("Autumn");
            }
        else {
            System.out.println("Winter");
            }
	}

	}

