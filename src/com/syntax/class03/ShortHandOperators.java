package com.syntax.class03;

public class ShortHandOperators {

	public static void main(String[] args) {
		
		int num=100;
		num=num+100;
		
		System.out.println(num);//200
		
		num+=100; //this is shortHand of reassigning variables		
		System.out.println(num);		
		num-=200;		
		System.out.println(num);
		
		int a=10;
		int b=20;
		int c=30;
		
		a+=b; 
		System.out.println(a);
		a+=b+c;
		System.out.println(a);
		
		
		// TODO Auto-generated method stub

	}

}
