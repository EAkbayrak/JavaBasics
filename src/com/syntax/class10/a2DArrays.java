package com.syntax.class10;

public class a2DArrays {

	public static void main(String[] args) {
		
		
		int [][] rows= {
				{1,2,3,4,5},
				{188,300,588,700},	
				{1900,4578,98787},
		};
		
		for(int i=0; i<rows.length; i++) {
			
			for(int j=0; j < rows[i].length; j++) {
				
				System.out.print(rows[i][j] + " ");
			}System.out.println();
		} 
		

	}

}
