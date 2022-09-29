package Class8;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] arr=new int[4];
		//store elements inside an array
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		//accessing elements from the array
		System.out.println(arr[2]);//30
		System.out.println(arr[1] + arr[2]);
		
		//Lets create elements from the array
		String[] names=new String[5];
		names[0]="Dauren";
		names[1]="Meruyert";
		names[2]="Batyr";
		names[3]="Mia";
		names[4]="Issa";
		
		System.out.println("Hello " + names[1]);
		
		
	}

}
