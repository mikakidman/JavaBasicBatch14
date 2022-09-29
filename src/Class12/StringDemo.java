package Class12;

public class StringDemo {

	public static void main(String[] args) {
	//Proper way of creating an object
		String str=new String("Java");
	//Counts the number of characters in a string including the spaces
	
		//Simpler and shorter way provided by Java Creators to make our life a little easier
	String name="Meruyert Kitmanova";// Only works for String and Wrapper classes
	System.out.println(str.length());
	System.out.println(name.length());
	if(name.length()>15) {
		System.out.println("Name can not be more than 15 characters");
	}
	}

}
