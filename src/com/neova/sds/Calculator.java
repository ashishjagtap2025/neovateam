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
		int a = 50, b= 25;
		Division division = new Division();
		int divRes = division.calculateDivision(a, b);
		System.out.println("Division of a by b is: "+divRes);
		
		//		Calling calculateAddition() method of Addition class
		Addition addition = new Addition();
		int addRes = addition.calculateAddition(a, b);
		System.out.println("Addition of a with b is: "+addRes);
		
		System.out.println("i am  drecco9");
	    System.out.println("End of Calculations.!");

	}
}