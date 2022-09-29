package GroupProject;

public class Task3 {

	public static void main(String[] args) {
		
		int sum=0;

	      int[][] nums= {

	                {56,31},
	                {40,65},
	                {20,36},
	                {61,70},
	                {10,20},
	        };
	       for(int i=0;i<nums.length;i++) {

	           for(int j=0; j<nums[i].length; j++) {

	               sum+=nums[i][j];

	           }

	           System.out.println(sum);
	       }


	    }}