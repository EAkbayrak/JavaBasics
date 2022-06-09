package com.syntax.class11;

public class phone {

	
		String make, model, colour; 
		int ram, storage, age;
		double screenSize;
		
		
		void ringTone(){
			System.out.println("blaa blaa blaa");
		}
		void torch() {
			System.out.println("Lights up!");
		}
		void vibration() {
			System.out.println("on!");
		}
		void textMessage(){
			System.out.println("beep");
		}
		
		public static void main(String[] args) {
			
			phone iPhone=new phone();
			
			iPhone.age=2022;
			iPhone.colour="Blue";
			iPhone.ram=16;
			iPhone.screenSize=7;
			iPhone.make="iPhone";
			
System.out.println("My "+iPhone.make+" has a screen size of "+ iPhone.screenSize +" inches and its of a "+iPhone.colour+" colour");
System.out.print("When my phone get a text it goes ");iPhone.textMessage(); 			
			
System.out.println();
System.out.println("*********************************************************");
System.out.println();
			
			phone pixel=new phone();
			
			pixel.age=2023;
			pixel.colour="Black";
			pixel.ram=32;
			pixel.screenSize=6.5;
			pixel.make="Pixel";
			
			pixel.ringTone();
			
			System.out.println("*********************************************************");
			
			
			phone samsung=new phone();
			
			samsung.make="Samsung";
			samsung.model="S21 Ultra";
			samsung.storage=64;
			samsung.ringTone();
			samsung.textMessage();
			
			System.out.println("*********************************************************");
			
			
			
		}
		
	
	

}
