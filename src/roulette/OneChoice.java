/*
 * 2015112145 
 * ±è¹ÎÁö
 */
package roulette;
import java.util.*;

public abstract class OneChoice extends Bet {
	private String myChoice;
	private Set myPossibles;

	public OneChoice(String description, int payout, String[] possibleChoices) {
		super(description, payout);
		myChoice = "";
		myPossibles = new TreeSet<String>(Arrays.asList(possibleChoices));
	}

	public void bet() {
		myChoice = ConsoleReader.promptOneOf("Please bet", myPossibles);
	}

	public String getChoice() {
		return myChoice;
	}
}
