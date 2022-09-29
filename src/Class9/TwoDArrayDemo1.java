package Class9;

public class TwoDArrayDemo1 {

	public static void main(String[] args) {
	
		String[][] countries= {
				{"USA", "Canada"},// 1 array with index 0
				{"Peru", "Brazil", "Colombia", "Ecuador"},// 20array with index 1
				{"Ethiopia", "Egypt", "Kenya"},
				{"Germany", "Tukiye", "Moldova", "Ukraine"},
				{"Kazakhstan", "Afghanistan", "Korea"}	
		};
	
		System.out.println(countries.length);//5 - total number of arrays or rows
		
		int elof1array =countries[0].length;
		System.out.println("# of elements from 1 array = " + elof1array);
		
		int elof2array =countries[1].length;
		System.out.println("# of elements from 2 array = " + elof2array);
		
		System.out.println("_____________getting all values from 2d array _________");
		
		for(int r=0; r<countries.length; r++) {// loops over rows
			
			for(int c=0; c<countries[r].length; c++) {
				System.out.print(countries[r][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println("___________");
		for(String[] country:countries) {
			for(String c:country) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}

	}


