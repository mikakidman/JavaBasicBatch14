package Class8;

public class Homework2 {

	public static void main(String[] args) {
		// animals
		
		String[] animals ={"tiger", "elephant", "lion", "zebra", "bear"};
		
		for(int i=0; i<animals.length; i++) {
		System.out.println(animals[i]);
	}

		System.out.println("____________________");
		//Another way
		
		for(String names:animals) {
			System.out.println(names);
		}
}
}
