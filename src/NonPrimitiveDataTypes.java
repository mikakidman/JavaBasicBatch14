
public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		// String is just 1 example of non  primitive data types
		
		String name="Asma";
		String address="123 address street";
		
		String phone="123 456 7890";
		int age=17;
		
		
		//ctrl+space-auto completes the statement
		// syso+ctrl+space
		
		System.out.println(name);

		//"My name is Asma" + Asma
		System.out.println("My name is "+name);
		
		//Asma is 17
		System.out.println(name+ " is "+age);
		
		//The price of the apple is 1.99
		String fruit="apple";
		double price=1.99;
		System.out.println("The price of the "+fruit +" is "+ price);
		
		fruit="mango";
		price=5.99;
		
		System.out.println("The price of the "+fruit +" is "+ price);
		
		/*to attach any value (int, double, boolean, char, etc.)
		 * to String we use +
		 * + next to the String acts as Concatenation
		 */
		
		
		
	}

}
