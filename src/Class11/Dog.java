package Class11;

public class Dog {
String name;
String breed;
String color;
int age;
double weight;

void play() {
	System.out.println("playing");
}
void growl() {
	System.out.println("growling");
}
void sniff() {
	System.out.println("sniffing");
}
	public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.breed="Husky";
		dog1.age=2;
		System.out.print(dog1.breed+ " is ");
		dog1.play();
		
		System.out.println("***********");
		Dog dog2=new Dog();
		dog2.breed="Bulldog";
		dog2.name="Hatiko";
		dog2.color="white";
		System.out.print(dog2.color+ " "+ dog2.name + " is ");
		dog2.growl();
		
		System.out.println("***********");
		Dog dog3=new Dog();
		dog3.breed="Labrador";
		dog3.age=1;
		dog3.weight=8.5;
		System.out.print(dog3.age + " year old " + dog3.breed + " is ");
		dog3.sniff();
	}

}
