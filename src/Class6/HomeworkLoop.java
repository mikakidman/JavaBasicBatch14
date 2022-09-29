package Class6;

public class HomeworkLoop {

	public static void main(String[] args) {
		// Print numbers from 1 to 100 in 1 line with space
        int a=1;
        while(a<=100) {
        	System.out.print(a + " ");
        	a++;
	}
System.out.println("_______________");

//Print numbers from 100 to 1
	int b=100;
	while(b>=1) {
		System.out.println(b);
		b--;
	}
	
	System.out.println("____________________");
	
	//Print even  numbers from 20 to 1(2 ways)
	//first way
	
	int c=20;
	while(c>=2) {
		System.out.print(c+ " ");
		c-=2;
	}
	
	System.out.println("_____________");
	//Second way
	
	int d=1;
	while(d<=20) {
	if(d%2==0) {
		System.out.print(d+ " ");
	}
	d++;
	}
	
	
	
	
	}
	}

