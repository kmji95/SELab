/*
 * 2015112145 
 * ±è¹ÎÁö
 */
package roulette;

public class SameRemainder extends Bet {

	private String myChoice;
	private static int myRange = 3;

	public SameRemainder() {
		super("Same Remainder", myRange-1);
		// TODO Auto-generated constructor stub
	}

	public void bet() {
		myChoice = ""
				+ ConsoleReader.promptRange("Enter the remainder when it's devided into " + myRange, 0, myRange - 1);
	}

	protected String getChoice() {
		return myChoice;
	}

	public boolean betIsMade(Wheel wheel) {
		int remainder = wheel.getNumber() % myRange;
		int choice = Integer.parseInt(myChoice);
		return (remainder == choice % myRange);
	}

}
