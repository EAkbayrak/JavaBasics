package com.syntax.class09;

public class HW3IntSum {
	
	public static void main(String[] args) {
		
	//Create an array on integers and calculate the sum of all elements in an array
		
		
		int [] age = {25,26,24,28,31,18,17,13,52,20};
		

	int changer=0;
	int sum1=0;
	
	System.out.print("The addition of ");
		
	while(changer < age.length) {
		
		sum1+=age[changer];
		changer++;
		
	}System.out.print("the sum of ");
	for (int a = 0; a < age.length; a++) {
		
		if (a==(age.length)-1) {
			System.out.print(age[a]);
		}else 
			System.out.print(age[a]+", ");
	}
	System.out.println(" is "+sum1);
		
		
	}

}
