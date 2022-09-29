package Class12;

public class Homework2 {

	public static void main(String[] args) {
		//Create a String and print it in reverse order

		String name="Sunday";
		char[] charArray=name.toCharArray();
		for(int i=name.length()-1; i>=0; i--) {
			System.out.println(charArray[i]);
		}
	}

}
