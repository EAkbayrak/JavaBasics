package com.syntax.class14;

public class MethodDemo3 {
	
	public static void main(String[] args) {
		
		MethodDemo3 boo = new MethodDemo3();
	
		System.out.println(boo.isEven(50));
		
		System.out.println(boo.checkChar("emre"));
		
	}

// write a method that takes a String and returns true if the number of chrr in that string 
// othersie is take string
	
boolean checkChar(String name) {
	if(name.length() %2==0) {
		return true;
	}else {
		return false;
	}
}
	
	
boolean isEven(int number) {
	if(number %2 == 0 ) {
		return true;
	}else {
		return false;
	}
}
	}
