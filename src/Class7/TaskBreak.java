package Class7;

public class TaskBreak {

	public static void main(String[] args) {
		// Print numbers from 1 to 50 except those that are divisible by 3
		
		 for (int a=1; a<=50; a++) {

	            if(a%3==0 ) {
	                continue;
	            }

	            System.out.print(a+" ");
	        }

	}

}
