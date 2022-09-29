import java.util.Scanner;

public class InputFromKeyBoard {

	public static void main(String[] args) {
		
		//Scanner is a class that helps us take the input from the keyboard
		
		Scanner input=new Scanner(System.in);
		//A message will be displayed to the user on the console to enter his/her name
		System.out.println("Please enter your name");
		String name=input.next();
		
		System.out.println("Hello " +name);

	}

}
