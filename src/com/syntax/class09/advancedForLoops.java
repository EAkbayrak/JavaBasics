package com.syntax.class09;

public class advancedForLoops {

	public static void main(String[] args) {

		/* Enhanced for loop/advanced for loop/
		 * for each loop can be used only when we work with array
		 * or
		 * collections
		 */
		
		String[] colours = {"pink", "blue", "turquiouse","white"};
		for(String color:colours) {
			
			
			if (color=="blue") {
				continue;
				
			}if (color=="white") {
				System.out.println(" OMG ");
			}
			System.out.print(color+" ");
		}
		
	}

}
