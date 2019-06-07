/*
 * 2015112145 
 * ±è¹ÎÁö
 */
package roulette;

public class OddEven extends OneChoice {
	private static final String[] POSSIBLE_CHOICES = { "even", "odd" };

	public OddEven() {
		super("Odd or Even", 1, POSSIBLE_CHOICES);
	}

	public boolean betIsMade(Wheel wheel) {
		int number = wheel.getNumber();
		return ((number % 2 == 0 && getChoice().equals(POSSIBLE_CHOICES[0]))
				|| (number % 2 == 1 && getChoice().equals(POSSIBLE_CHOICES[1])));
	}
}
