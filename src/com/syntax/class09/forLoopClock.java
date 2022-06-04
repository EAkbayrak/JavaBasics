package com.syntax.class09;

public class forLoopClock {

	public static void main(String[] args) {

		//Clock
		
		//Outer loop  is HH == 24
		
		//Inner loop is mm == 60
		
		for (int h = 0; h < 24; h++ ) {
			for (int m = 0; m < 60; m++) {
				
				if(h <= 9 && m <= 9) {
				System.out.println("0"+h+":"+"0"+m);
				
			}	else if(h <= 9 && m >= 9) {
				
				System.out.println("0"+h+":"+m);
			
			} else if (h >= 9 && m <= 9) {
				System.out.println(h+":"+"0"+m);
				
			}else if (h >= 9 && m >= 9) {
				System.out.println(h+":"+m);
			}
		}
		
	}
		
	
	
	}}


