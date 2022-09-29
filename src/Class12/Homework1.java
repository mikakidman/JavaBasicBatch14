package Class12;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following:
		 * If the String has an odd number of characters and has 3 or more characters,
		 * print the character in the middle of the String
		 */
		
		String name="Batyr";
		
		if(name.isEmpty()|| name.length()%2!=0) {
			System.out.println("The middle letter of " + name + " is " + name.charAt(name.length()/2));
		}
	}

}
