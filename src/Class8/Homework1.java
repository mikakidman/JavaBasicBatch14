package Class8;

public class Homework1 {

	public static void main(String[] args) {
		// cars

		String[] cars= {"Toyota", "Tesla", "Volva", "Audi", "Mercedes", "BMW"};
		
		for(int i=0; i<cars.length; i++) {
		System.out.println(cars[i]);
		
	}
System.out.println("__________________");

//Another way

for(String models: cars) {
	System.out.println(models);
}
}
}
