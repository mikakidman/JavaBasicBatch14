package Class12;

public class Homework3Solved {

	public static void main(String[] args) {
		String motherName="Mary";
		String fatherName="Daniel";
		boolean isBoy=false;
		String firstHalf;
		String secondHalf;
		
		if(isBoy) {
			firstHalf=fatherName.substring(0, fatherName.length()/2);
			secondHalf=motherName.substring(motherName.length()/2);
			System.out.println(firstHalf+secondHalf);
		}else {
			firstHalf=motherName.substring(0, motherName.length()/2);
			secondHalf=fatherName.substring(fatherName.length()/2);
		}
		System.out.println(firstHalf + secondHalf);
		
	}

}
