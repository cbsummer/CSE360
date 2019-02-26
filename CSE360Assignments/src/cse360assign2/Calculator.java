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
	private String history;
	
	//Initialize variables
	
	public Calculator () {
		
		history = new String();
		total = 0;  
		history += total;
	
	}
	
	//Returns total
	
	public int getTotal () {
		
		return total;
	
	}
	
	//Adds to running total
	
	public void add (int value) {
	
		total += value;
	
		history += " + " + value;
	}
	
	//Subtracts from running total
	
	public void subtract (int value) {
	
		total -= value;
	
		history += " - " + value;
	}
	
	//Multiplies to running total
	
	public void multiply (int value) {
		
		total *= value;
		
		history += " * " + value;
	
	}
	
	//Divides from running total. If value equals zero change total to zero
	
	public void divide (int value) {
		
		if(value == 0) {
			total = 0;
		}
		
		else {
			total /= value;
		}
		
		history += " / " + value;
	}
	
	public String getHistory () {
		return history;
	}
}