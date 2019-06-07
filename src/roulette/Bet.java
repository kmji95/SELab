/*
 * 2015112145
 * ±è¹ÎÁö
 */
package roulette;
public abstract class Bet {
	private String myDescription;
	private int myPayout;

	public Bet(String description, int payout) {
		myDescription = description;
		myPayout = payout;
	}

	/**
	 * @return odds given by the house for this kind of bet
	 */
	public int getPayout() {
		return myPayout;
	}

	/**
	 * @return name of this kind of bet
	 */
	public String getDescription() {
		return myDescription;
	}

	public abstract void bet();

	public abstract boolean betIsMade(Wheel wheel);
}
