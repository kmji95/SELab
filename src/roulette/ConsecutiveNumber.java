/*
 * 2015112145
 * ±è¹ÎÁö
 */
package roulette;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ConsecutiveNumber extends Bet {
	private String myChoice;
	private static int myRange = 3;

	public ConsecutiveNumber() {
		super("Three in a Row", 36/myRange-1);
		// TODO Auto-generated constructor stub
	}

	public void bet() {
		myChoice = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers", 1, 36-myRange);
	}

	protected String getChoice() {
		return myChoice;
	}

	public boolean betIsMade(Wheel wheel) {
		int start = Integer.parseInt(myChoice);
		return (start <= wheel.getNumber() && wheel.getNumber() < start + myRange);
	}
}
