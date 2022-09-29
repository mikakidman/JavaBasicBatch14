package Homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        System.out.println("Where are you from?");
        String country=input.nextLine();
        String language;
        switch(country) {  
       
        case "USA":
        	language="English";
        	break;
        	
        case "Kazakhstan":
        	language="Kazakh";
        	break;
        	
        case "Turkey":
        	language="Turkish";
        	break;
        	
        case "Egypt":
        	language="Arabic";
        	break;
        	
        	default:
        		language="Unknown";
        		break;
        }
        System.out.println("Your native language is " + language);
        }
	}


