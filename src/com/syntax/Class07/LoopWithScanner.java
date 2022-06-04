package com.syntax.Class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		/*
		 *  we are going to ask you if you got a job
		 *  we will continously  asking you if you get a job until you say a yes
		 *  
		 *  Once you say yes until you say yes ===== congratulation 
		 */
		String job;
		do {
		System.out.println("Did you get a job?");
		 job=input.nextLine();
		
		} while(!job.equalsIgnoreCase("yes"));
		
		System.out.println("congrats!");
		
		
		System.out.println("-+--------------------");
		
		int num=10;
		int result = ++num;
		
		System.out.println("The value of num = "+num);
		System.out.println("The value of result = " +result);
		
		
		
		// TODO Auto-generated method stub

	}

}
