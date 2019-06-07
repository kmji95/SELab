/*
 * 2015112145 
 * ±è¹ÎÁö
 */
package roulette;
public class HighLow extends OneChoice {
	private static final String[] POSSIBLE_CHOICES = { "Low", "High" };

	public HighLow() {
		super("High or Low", 1, POSSIBLE_CHOICES);
	}

	public boolean betIsMade(Wheel wheel) {
		int number = wheel.getNumber();
		return ((number >= 0 && number <= 18 && getChoice().equals(POSSIBLE_CHOICES[0]))
				|| (number > 18 && number <= 36 && getChoice().equals(POSSIBLE_CHOICES[1])));
	}
}
