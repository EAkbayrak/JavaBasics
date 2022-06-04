package com.syntax.class11;

public class car {
	
		String colour;
		String make;
		String model;
		int hp;
		int year;
		String typeOfEngine;
		int noOfDoors;
		
		void moveForward() {
			System.out.println(make + " is moving forward");
		}
		void reverse() {
			System.out.println(make + " is moving backwards");
		}
		public static void main(String[] args) {
			car bmw = new car();
			
			bmw.make="bmw";
			bmw.model="x6";
			bmw.colour="black";
			bmw.noOfDoors=5;
			bmw.year=2022;
			bmw.hp=300;
			bmw.moveForward();
			bmw.reverse();
			System.out.println(bmw.model);
			
			car nissan=new car();
			nissan.make="Nissan";
			nissan.year=2022;
			nissan.typeOfEngine="Automatic";
			nissan.colour="red";
			nissan.hp=150;
			nissan.moveForward();
			nissan.reverse();
			
			
			
		}
		
		
}		
