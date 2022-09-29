package Class8;

public class Homework4 {

	public static void main(String[] args) {
		// the largest
		int [] num= {50, 100, 5, 25, 150};
		int largest=0;
		for(int i=0; i<num.length; i++) {
			if(num[i]>largest) {
				largest=num[i];
			}
		}
System.out.println(largest);
	}

}
