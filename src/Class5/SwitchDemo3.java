package Class5;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Where are you from?");
		String country=in.nextLine();
		String favoriteFood;
		
		switch (country) {
		case "Usa":
			favoriteFood="burgers";
			break;
		case "Kazakhstan":
			favoriteFood="beshbarmak";
			break;
		case "Turkey":
			favoriteFood="baklava";
			break;
		}

	}

}
