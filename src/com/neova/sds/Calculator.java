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
		int a = 50, b= 25;
		Division division = new Division();
		int divRes = division.calculateDivision(a, b);
		System.out.println("Division of a by b is: "+divRes);
	}
}