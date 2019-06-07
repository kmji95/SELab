/*
 * 2015112145 
 * ±è¹ÎÁö
 */
package roulette;
import java.util.Random;

public class Wheel {
	// constants
	public static final String RED = "red";
	public static final String BLACK = "black";
	public static final String GREEN = "green";

	// wheel values --- not quite every other one :(
	private static final String[] OUR_SPOTS = { GREEN, RED, BLACK, RED, BLACK, RED, BLACK, RED, BLACK, RED, BLACK,
			BLACK, RED, BLACK, RED, BLACK, RED, BLACK, RED, RED, BLACK, RED, BLACK, RED, BLACK, RED, BLACK, RED, BLACK,
			BLACK, RED, BLACK, RED, BLACK, RED, BLACK, RED, GREEN };

	private int myNumSpins;
	private int myValue;
	private Random myRoller;

	/**
	 * Construct the wheel.
	 */
	public Wheel() {
		myNumSpins = 0;
		myValue = 0;
		myRoller = new Random();
	}

	/**
	 * @return color of the current spot on the wheel
	 */
	public String getColor() {
		return OUR_SPOTS[getNumber()];
	}

	/**
	 * @return number of the current spot on the wheel
	 */
	public int getNumber() {
		return myValue;
	}

	/**
	 * @return number of times the wheel has been spun
	 */
	public int getNumSpins() {
		return myNumSpins;
	}

	/**
	 * Spins the wheel, choosing a new spot.
	 */
	public void spin() {
		myNumSpins++;
		myValue = myRoller.nextInt(OUR_SPOTS.length);
	}
}
