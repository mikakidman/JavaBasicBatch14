package Class7;

public class ClockLoop {

	public static void main(String[] args) {
		// Digital timer
		
		for(int a1=0; a1<=2; a1++) {
			for(int a2=0; a2<9; a2++) {
				if(a1==2 && a2==4) {
					break;
				}
				for(int b1=0; b1<=5; b1++) {
					for(int b2=0; b2<=9; b2++) {
						
						System.out.println(a1+ ""+a2+""+":"+b1+b2);
					}
					
				
				}
				
				
			}
		}

	}

}
