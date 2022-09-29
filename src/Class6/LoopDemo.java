package Class6;

public class LoopDemo {

	public static void main(String[] args) {
		// Increment/decrement
		
		int a=10;
		while(a<=25) {
			System.out.println(a + " ");
			a++;
			
		}

		System.out.println("_______________");
		
		int b=10;
		while (b>=1) {
			System.out.println(b);
			b--;
			
		}
	// print all numbers from 50 to 20
		// print all even numbers from 1 to 20
		System.out.println("_______________");
		
		int c=50;
		while (c>=20) {
			System.out.println(c);
			c--;
		}
		System.out.println("_______________");
		int d=2;
	while (d<=20) {
		System.out.println(d + " ");
		d+=2;
		}
	
	System.out.println("Another way");
	int i=1;
	while(i<=20) {
		if(i%2==0) {
			System.out.println(i + " ");
		}
		i++;
	}
	}
	
	
	

}
