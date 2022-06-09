package com.syntax.class14;

public class MethodDemo4 {
	
	public static void main(String[] args) {
		
		MethodDemo4 sum = new MethodDemo4();
				
		System.out.println(sum.sumNumbers(5, 10));
		sum.printsMany("I love java", 3);
		
	}
	//write a method that takes a string and int and prinsout that string on the console
	// that many times that value that we can int
	
	
	
	
		int sumNumbers(int num1,int num2) {
		return num1 + num2;		
	}
		void printsMany(String str, int times){
			for(int a = 0; a<times; a++ )
			System.out.println(str);
		}

}
