import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter you city");
		
		String city=scan.next();
		
		System.out.println("Please enter the temperature (°F)in your city");
		
		float temperatureF=scan.nextFloat();
		float temperatureC=(temperatureF-32)*5/9;
		
		System.out.println("The temperature in " + city + " is " +temperatureC + "°C");
		

	}

}
