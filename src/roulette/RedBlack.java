/*
 * 2015112145 
 * ±è¹ÎÁö
 */
package roulette;

public class RedBlack extends OneChoice {
	private static final String[] POSSIBLE_CHOICES = { Wheel.BLACK, Wheel.RED };

	public RedBlack() {
		super("Red or Black", 1, POSSIBLE_CHOICES);
	}

	public boolean betIsMade(Wheel wheel) {
		return getChoice().equals(wheel.getColor());
	}
}
