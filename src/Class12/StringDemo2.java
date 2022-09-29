package Class12;

public class StringDemo2 {

	public static void main(String[] args) {
		String firstName="Meruyert";
		String lastName="Kitmanova";
		System.out.println(firstName+lastName);//Mostly this is used
		System.out.println(firstName.concat(" ").concat(lastName));
		
		String str=" ";
		//isEmpty() returns true if a String is empty
		//isEmpty() will return false even if you have a space
		//isBlank does not count spaces
		System.out.println(str.isEmpty());
		
	}

}
