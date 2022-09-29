package GroupProject;

public class Task11 {

	public static void main(String[] args) {
		
		        String [] array = {"dog", "cat", "wolf", "tiger", "cat", "bear", "dog"};

		        System.out.println("These are the elements that are duplicates in the String Array: \n");

		        for(int i = 0; i < array.length; i++)
		        {
		            for(int j = i + 1; j < array.length; j++)
		            {
		                if(array[i].equals(array[j]))
		                    System.out.println(array[j]);
		            }
		        }
		    }

		

	}


