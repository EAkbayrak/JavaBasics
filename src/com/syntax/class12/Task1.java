package com.syntax.class12;

public class Task1 {

	public static void main(String[] args) {
		
		/*	Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
			Password should be minimum 8 characters, if less → message=”Password is too short”.
			Password cannot contain username if so, → message=”Password cannot contain username”.
			Password should match confirmed password, if not  → message=“Passwords do not match”.
*/
		
		String username = "EAkbayfsrak s s";
		String password  = "efewEAkbayrak";
		String secondPassword ="Pop12";
		
		if(username.isEmpty() || password.isEmpty()) {
			System.out.println("Username and password cannot be empty");
		}else if(password.length()<8) {
			System.out.println("Pleae enter a password longer than 8 characters");
		}else if(password.toLowerCase().contains(username.toLowerCase())) {
			System.out.println("Password cannot contain username");
		}else if(!password.equals(secondPassword)) {
			System.out.println("Passwords do not match");
		}
		else System.out.println("Your username and password is now created");
		
		
		int counter=0;
		for(int a=0; a<username.length(); a++ ) {
			if('s'==username.trim().charAt(a)) {
				counter++;
			}
		}System.out.println(counter);

	

	}

}
