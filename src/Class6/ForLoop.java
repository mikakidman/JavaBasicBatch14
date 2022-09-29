package Class6;

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
			
		}
		System.out.println("__________");
		
		//print numbers from 1 to 20
		
		for(int i=1; i<=20; i++) {
			System.out.println(i);
		}
		System.out.println("__________");
		//what is the output
		for(int i=0; i<=10; i+=2) {
			System.out.println(i + " ");
		}
	
		System.out.println("__________");
		//what is the output
		for(int i=10; i<=25; i+=5) {
			System.out.println(i + " ");
		}
	
		System.out.println("__________");
		//what is the output
		
		int sum=0;
		for(int i=1; i<=6; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	

}
