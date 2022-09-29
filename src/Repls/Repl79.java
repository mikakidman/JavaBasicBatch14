package Repls;

import java.util.Arrays;

public class Repl79 {

	public static void main(String[] args) {
		double [][] a= {

	            {1.4, 2.0, 3.3, 2},
	            {4.0, 1.5, 6.1, 1},
	            {1.2, 3.1, 4, 1.6,}
	        };

	       double doubled=0;
	    for(int i=0; i<a.length; i++){
	      for(int j=0; j<a[i].length; j++){
	        doubled=a[i][j];
	        System.out.print(doubled + " ");
	      }
	      System.out.println();
	    }
	       

		}

	}