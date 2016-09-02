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
		
		Multiplication multiplication =new Multiplication();
		System.out.println("multiplication result :"+multiplication.multiplication(3, 5));
		
		
		Square sq =new Square();
		System.out.println(sq.square(3));
		//		Calling calculateDivision() method of Division class
		Division division = new Division();
		int divRes = division.calculateDivision(20, 10);
		System.out.println("Division of 20 by 10 is: "+divRes);
	}
	}
}