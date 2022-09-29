package Class11;

public class Phone {
String make;
String model;
String color;
int year;
int storage;

void recordVideo() {
	System.out.println("recording videos");
}
	void call() {
		System.out.println("calling");
	}
	void waterproof() {
		System.out.println(" is waterproof");
	}
	
	public static void main(String[] args) {
		Phone iphone=new Phone();
		iphone.make="Apple";
		iphone.model="Iphone 14 Pro Max";
		iphone.color="Pacific Blue";
		iphone.year=2022;
		iphone.storage=512;
		System.out.println(iphone.color+" "+iphone.model + " which " + iphone.storage + " GB ");
		iphone.call();
		
		System.out.println("*********");
		
		Phone pixelPhone=new Phone();
		pixelPhone.make="Google";
		pixelPhone.model="Pixel 6a";
		pixelPhone.color="Black";
		pixelPhone.year=2022;
		pixelPhone.storage=128;
		System.out.println(pixelPhone.model);
		pixelPhone.waterproof();
		
		System.out.println("*********");
		
		Phone samsungPhone=new Phone();
		samsungPhone.make="Samsung";
		samsungPhone.model="Samsumg Galaxy S22";
		samsungPhone.color="Beidge";
		samsungPhone.year=2022;
		samsungPhone.storage=256;
		System.out.println(samsungPhone.model + " which came out in " +samsungPhone.year );
		samsungPhone.recordVideo();
	}

}
