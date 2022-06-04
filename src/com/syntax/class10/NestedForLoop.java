package com.syntax.class10;

public class NestedForLoop {

	public static void main(String[] args) {
		
		//1 2 3 4 5 6 7
		//1 2 3 4 5 6 
		//1 2 3 4 5 
		//1 2 3 4 
		//1 2 3
		//1 2 
		
		
		for(int a = 8; a >= 1; a--) {
			for(int b=1; b <= a; b++) {
				System.out.print(b+" ");
			}System.out.println("");				
		}
		for(int a = 1; a <= 9; a++) {
			for(int b=1; b <= a; b++) {
				System.out.print(b+" ");
			}System.out.println("");				
		}

	}

}
