package Class13;

public class Class4 {

	public static void main(String[] args) {
		String str="nbjsjKJGFm527899)*&%#$#";
		//replace all numbers from 0 to 9 with@
		System.out.println(str.replaceAll("[0-9]", "@"));
		
		//Remove all numbers from 0 to 9
		System.out.println(str.replaceAll("[0-9]", ""));
		
		//remove all letters from a to z refer the ascii table for range info
		System.out.println(str.replaceAll("[a-z]", ""));
		
		//remove all letters from A to Z refer the ascii table for range info
		System.out.println(str.replaceAll("[A-Z]", ""));
		
		//remove all letters other than A to Z  refer the ascii table for range info
		System.out.println(str.replaceAll("[^A-Z]", ""));
		
		//remove all letters other than A to Z and a to z refer the ascii table for range info
		System.out.println(str.replaceAll("[^a-zA-Z]", ""));
		
		//remove all letters other than A to Z and a to z and 0 to 9 refer the ascii table for range info
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

	}

}
