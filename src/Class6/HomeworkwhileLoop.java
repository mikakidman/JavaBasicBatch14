package Class6;

public class HomeworkwhileLoop {

	public static void main(String[] args) {
		// //Print odd numbers between 20 and 50(2 ways)
		//1 way
		
		int e=20;
		while(e<=50) {
			if(e%2!=0) {
				System.out.print(e + " ");
			}
		e++;
		
		}
		
		System.out.println();
		System.out.println("___________________");
		//2 way
		
		int d=21;
		while(d<=49) {
			System.out.print(d + " ");
		d+=2;
		}	
	}
	

	}


