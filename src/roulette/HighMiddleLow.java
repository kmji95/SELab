/*
 * 2015112145 
 * ±è¹ÎÁö
 */
package roulette;

public class HighMiddleLow extends OneChoice {
	private static final String[] POSSIBLE_CHOICES = { "Low", "Middle", "High" };

	public HighMiddleLow() {
		super("High or Middle or Low", 2, POSSIBLE_CHOICES);
	}

	public boolean betIsMade(Wheel wheel) {
		int number = wheel.getNumber();
		return ((number > 0 && number <= 12 && getChoice().equals(POSSIBLE_CHOICES[0]))
				|| (number > 12 && number <= 24 && getChoice().equals(POSSIBLE_CHOICES[1]))
				|| (number > 24 && number <= 36 && getChoice().equals(POSSIBLE_CHOICES[2])));
	}
}
