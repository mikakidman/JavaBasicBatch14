package GroupProject;

public class Task4 {

	public static void main(String[] args) {
		int[][] OddEven= {{2,4,6,8,10},
				{1,3,5,7,9,11}
		};
		for(int [] even:OddEven) {
			for(int e:even) {
				if(e%2==0) {
					System.out.println(e + " ");
				}
			}
		}

	}

}
