package GroupProject;

public class Task10 {

	public static void main(String[] args) {
		int Largest=0;
		int SecondLargestNumber=0;
		int[]nums= {54,65,234,76,43,23,98};
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>Largest) {
				SecondLargestNumber=Largest;
				
				Largest=nums[i];
			}else if(nums[i]>SecondLargestNumber) {
				SecondLargestNumber=nums[i];
			}
		}
System.out.println("The second largest number is " + SecondLargestNumber);
	}

}
