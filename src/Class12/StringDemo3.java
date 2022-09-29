package Class12;

public class StringDemo3 {

	public static void main(String[] args) {
		String str=" i love java ";
		System.out.println(str);
		/*Remove the spaces before and after the String
		*But not the ones which are present in between
		*/
	System.out.println(str.trim());

	String str2="Java is Very easy";
	/*startsWith=>checks if a String Starts with a specific letter or word
	 * endsWith=>checks if a String Ends with a specific letter or word
	 * contains=>checks if a String Contains a specific letter or word
	 */
	System.out.println(str2.startsWith("J"));
	System.out.println(str2.endsWith("e"));
	/*
	 * /Method chaining helps us call multiple methods on a single line one method after one another
	 */
	System.out.println(str2.toLowerCase().contains("very"));
	}

}
