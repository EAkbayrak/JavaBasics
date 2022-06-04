package com.syntax.Class08;

import java.util.Scanner;

public class BreakTasks {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		for (int i=0; i<=50; i++) {
			
			if (i%3==0) {
				continue;
			} System.out.print(i+" ");break;
		} 
			
		String ans="null";
		do { System.out.println("Will you apply for a credit card?");
		
			ans=input.next();
		}while (!ans.equalsIgnoreCase("yes")); {
			
		} System.out.println("Well done");
			
	
	}

}
