/**
 * 
 */
package com.neova.sds;

/**
 * @author Ashish
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcom to git  branching model :)");
		//Your code will go here. add comments as much you want :)
		
//		Calling calculateDivision() method of Division class
		Division division = new Division();
		int divRes = division.calculateDivision(20, 10);
		System.out.println("Division of 20 by 10 is: "+divRes);
	}
}