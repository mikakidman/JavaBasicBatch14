package Class11;

public class Student {

	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	void study() {
		System.out.println("Student is studying");
	}
	
	void deleteMessages() {
		System.out.println("Deleting messages from Discord");
	}
	
	void eat() {
		System.out.println("Eating pizzaaaaaaa...");
	}
	
	
	public static void main(String[] args) {
		//new Student()=>Creates the object of Student class
	Student fraidoonObject=new Student();
	 fraidoonObject.name="Fraidoon";
	 fraidoonObject.id= "123";
	 fraidoonObject.age= 22;
	 
	 System.out.println(fraidoonObject.name);
	 System.out.println(fraidoonObject.age);
	 fraidoonObject.deleteMessages();
	 
	 System.out.println("*************");
	 
	 Student student2=new Student();
	 student2.name="Meruyert";
	 student2.age=30;
	 student2.weight=55;
	 student2.gender='F';
	 
	 System.out.println( student2.name);
	 student2.eat();
	}
}
