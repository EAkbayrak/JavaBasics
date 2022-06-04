package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
	
		int i=100;
		double d=100;
		
		System.out.println(i); //100
		System.out.println(d); //100.0
		//casting is converting 1 type into another, above is an example.
		
		
		//widening converting 1 type in to another type
		
		// you can convert smaller to bigger int
		
		// byte > short > char > int > long > float > double
		
		
		/*
		 * 	Narrowing 
		 *  double -> float -> long -> int -> char -> short -> byte
		 */
		
			
			
			int x=(int)100.22f;
			
			byte y=(byte)500;
			
			System.out.println(y+x);
			
			
			
			
	}

}
