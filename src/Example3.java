import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Did you solve any Repl Assignments?");
		boolean solvedAnyRepls=scan.nextBoolean();
		
		if(solvedAnyRepls)
		{
			System.out.println("How many Repls you solved?");
			int noOfReplsSolved=scan.nextInt();
			
			if(noOfReplsSolved>=17)
			{
				System.out.println("You are doing great");
			}else if (noOfReplsSolved>10) {
				System.out.println("You are doing ok, Please complete them as soon as possible");
			}else {
				System.out.println("You should solve some  more repls");
			}
		}
		else
		{
			System.out.println("They are very important to learn Java, please solve them");
		}

	}

}
