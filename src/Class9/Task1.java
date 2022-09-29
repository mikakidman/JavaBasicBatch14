package Class9;

public class Task1 {

	public static void main(String[] args) {
		
		String[][] arr= {
				
				{"Yusuf", "Hamza", "Adam", "John"},
				{"A", "B", "C", "D"}
		};
		
		for(String[]singleArray:arr) {
			
			for(String el:singleArray) {
				System.out.print(el + " ");
			}
			System.out.println();
		}
			
		
for(int i=0; i<arr.length; i++) {
	for(int j=0; j<arr[i].length; j++) {
		System.out.print(arr[i][j] + " ");
	}
	System.out.println();
}
	}

}
