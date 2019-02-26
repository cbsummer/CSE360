/**********************************************
 * Author: 		Chase Summers
 * ClassID: 	557
 * Assignment: 	2
 * Description: Assignment to build a calculator
 * 				and to practice using team
 * 				collaborative tools.
 *********************************************/


package cse360assign2;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	//Returns total
	
	public int getTotal () {
		
		return total;
	
	}
	
	//Adds to running total
	
	public void add (int value) {
	
		total += value;
	
	}
	
	//Subtracts from running total
	
	public void subtract (int value) {
	
		total -= value;
	
	}
	
	//Multiplies to running total
	
	public void multiply (int value) {
		
		total *= value;
	
	}
	
	//Divides from running total. If value equals zero change total to zero
	
	public void divide (int value) {
		
		if(value == 0) {
			total = 0;
		}
		
		else {
			total /= value;
		}
	}
	
	public String getHistory () {
		return "";
	}
}