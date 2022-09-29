package GroupProject;

public class Task9 {

	public static void main(String[] args) {
		
		int[] items= {10,0,30,-2,7,1,5,90,-76,100,45,55};
		
		int max=items[0];
		int min=items[0];
		
		for(int i=0; i<items.length; i++) {
			if(items[i]>max) {
				max=items[i];
			}
			else if(items[i]<min) {
				min=items[i];
			}
		}
System.out.println(max);
System.out.println(min);
	}

}
