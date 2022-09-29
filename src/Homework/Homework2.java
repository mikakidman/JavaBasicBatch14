package Homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        System.out.println("Please enter a grade");
        char grade=input.next().charAt(0);
        String explanation;
        switch(grade) {
        
        case 'A':
        	explanation="Excellent";
        	break;
        	
        case 'B':
        	explanation="Good";
        	break;
        	
        case 'C':
        	explanation="Average";
        	break;
        	
        case 'D':
        	explanation="Bad";
        	break;
        	
        default:
        	explanation="Not acceptable";
        }
        System.out.println("Your grade is " + grade + " which is " + explanation);
        	
        }
	}

