/*
 * 2015112145 
 * ±è¹ÎÁö
 */
package roulette;

public class Game {
	private static final String DEFAULT_NAME = "Roulette";

	private Wheel myWheel;
	private Bet[] myPossibleBets = { 
			new RedBlack(), 
			new OddEven(), 
			new ConsecutiveNumber(),
			new HighLow(),
			new HighMiddleLow(),
			new SameRemainder()
			};

	public Game() {
		myWheel = new Wheel();
	}

	public String getName() {
		return DEFAULT_NAME;
	}

	public void play(Gambler player) {
		int amount = ConsoleReader.promptRange("How much do you want to bet", 0, player.getBankroll());

		Bet bet = promptForBet();
		bet.bet();

		System.out.println("Spinning ...");
		myWheel.spin();
		System.out.println("Dropped into " + myWheel.getColor() + " " + myWheel.getNumber());

		// ½ÂÆÐ ÆÇº°ÇÏ¿© µ· °è»ê
		if (bet.betIsMade(myWheel)) {
			System.out.println("*** Congratulations :) You win ***");
			amount *= bet.getPayout();
		} else {
			System.out.println("*** Sorry :( You lose ***");
			amount *= -1;
		}
		player.updateBankroll(amount);
	}

	private Bet promptForBet() {
		System.out.println("You can make one of the following types of bets:");
		for (int k = 0; k < myPossibleBets.length; k++) {
			System.out.println((k + 1) + ") " + myPossibleBets[k].getDescription());
		}
		int choice = ConsoleReader.promptRange("Please make a choice", 1, myPossibleBets.length) - 1;
		return myPossibleBets[choice];
	}

}
