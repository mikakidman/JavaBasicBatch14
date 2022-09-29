package reviewClass5;

import java.util.Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {
		String[] dresses=new String[] {"Pink dress", "cocktail", "Summer dreass", "Pencil dress"};
		//last index is always size -1 because
		//arrays index start from zero
		System.out.println(dresses.length);
		
		for(int i=0; i<dresses.length; i++) {
			System.out.println("Let's try " + dresses[i]);
		}
	
		//enhanced loop:
		for(String dress:dresses) {
			System.out.println(dress);//only one direction;
										//you can not skip some elements of array
		}
	
		System.out.println("****************");
		//print all elements of Array without loop
		System.out.println(Arrays.toString(dresses));
		
	}
	

}
