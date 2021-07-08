package exercise4;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	String name;

	public static void main(String[] args) {
		DiceGame diceGame = new DiceGame();
		diceGame.greet();
		diceGame.showDice();
	}
	public void showDice() {
		Random rand = new Random();
		int diceNum1 = rand.nextInt(6) + 1;
		int diceNum2 = rand.nextInt(6) + 1;
		int totalVal = diceNum1 + diceNum2;

		System.out.println("Rolling the dice...");
		System.out.println("Die 1 : " + diceNum1);
		System.out.println("Die 2 : " + diceNum2);
		System.out.println("Total value : " + totalVal);
	}

	public void greet() {
		System.out.println("What your name?");
		System.out.print("> ");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		System.out.println("Hello, " + name + "!");
	}

}
