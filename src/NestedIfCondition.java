
public class NestedIfCondition {

	public static void main(String[] args) {
		
		int time=5;
		String day= "Monday";
		  
		if(day.equals("Monday")) {
			if (time>7) {
				System.out.println("Let's go to the office");
				
			}
			
			if (time<6) {
				System.out.println("Let's sleep more");
				
			}
		}
		
		
		double moneyInMyAccount=10000;
		String season= "Spring";
		if(season.equals("Spring"))
		{	
			if(moneyInMyAccount>30000)
			{
				System.out.println("Lest's go vacation");
			}
			else
			{
				System.out.println("I need to save more");
			}
			}

	}

}




