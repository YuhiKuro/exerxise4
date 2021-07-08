package exercise4;

import java.util.Random;

public class DiceGame {

	public static void main(String[] args) {
		DiceGame diceGame = new DiceGame();
		diceGame.showDice();
	}

	public void showDice() {
		DiceGame diceGame = new DiceGame();
		Random rand = new Random();
		int diceNum1 = rand.nextInt(7) + 1;
		int diceNum2 = rand.nextInt(7) + 1;
		int totalVal = diceNum1 + diceNum2;

		System.out.println("Rolling the dice...");
		System.out.println("Die 1 : " + diceNum1);
		System.out.println("Die 2 : " + diceNum2);
		System.out.println("Total value : " + totalVal);
		diceGame.judge(name, totalVal);
	}

	public void judge(String name, int value) {
		if (value>7) {
			System.out.println(name + " won!");
		} else {
			System.out.println(name + " lose!");
		}
	}
}
