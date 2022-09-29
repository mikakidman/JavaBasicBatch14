package Class11;

public class DogDemo {
//State
	//attributes/properties/fields
	String name;
	String color;
	String breed;
	double weight;
	int age;
//These are the behaviors of a dog
	void bark() {
		System.out.println("Barking......");
	}
	
	void sleep() {
		System.out.println("Dog is sleeping......");
	}
	
	public static void main(String[] args) {
		//creating objects from a class
		DogDemo dog1=new DogDemo();
		//calling a behavior on an object
		dog1.bark();
		dog1.sleep();
	}
	
}
