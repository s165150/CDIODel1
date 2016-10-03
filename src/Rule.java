import java.util.Scanner;

import desktop_resources.GUI;

public class Rule {
	
	/**
	 * Creates the rule about if a player gets above 40 points and hit 2 equals, he wins.
	 * @param p1
	 * @param cup
	 */
	public void ruleForty(Player p1, Shaker cup)
	{
		if (p1.getPlayerScore()>40)
		{
			if(cup.getDie1() == cup.getDie2())
			{
			System.out.println("You win!");
			System.exit(0);
			}
		}
	}
	/**
	 * Creates the rule about snakeeyes. If the player hits double aces, his score gets reset.
	 * @param p1
	 * @param cup
	 */
	public void ruleSnakeEyes(Player p1, Shaker cup)
	{
		if (p1.getLastRollValue() == 2 && cup.getShake() == 2)
		{
			System.out.println("Your score has been reset. Stay away from snakes!");
			p1.resetPlayerScore();			
		}
		
		
	}
	/**
	 * Set the rule that when the player hits 2 6'es he gets a chance to win the game. The extra WIN turn is not counted into his points.
	 * @param p1
	 * @param cup
	 */
	public void ruleThemSixes(Player p1, Shaker cup, Scanner scan)
	{
		if (p1.getLastRollValue() == 12)
		{
			
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("You just hit them double 6's. Try again and win the game");
			System.out.println(p1.getPlayerName() + " please roll the dies");
			scan.nextLine();
			cup.setShake();
			p1.setPlayerScore(cup.getShake());
			p1.setLastRollValue(cup.getShake());
			GUI.setDice(cup.getDie1(), cup.getDie2());
			System.out.println ("Die One: " + cup.getDie1() + ", Die Two: " + cup.getDie2());
			if (p1.getLastRollValue() == 12)
			{
				//Wins the game on two sixes in a row
				System.out.println("Jackpot! You got two sixes in a row!");
				System.exit(0);	
			}
			System.out.println("Better luck next time");
		}
	}
	/**
	 * Creates the rule that when the player hits 2 equal eyes, he gets another turn.
	 * @param p1
	 * @param cup
	 */
	public void ruleEquals(Player p1, Shaker cup, Scanner scan)
	{

		while (cup.getDie1() == cup.getDie2())
		{
			System.out.println("EXTRA TURN");
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println(p1.getPlayerName() + " please roll the dies");
			scan.nextLine();
			cup.setShake();
			p1.setPlayerScore(cup.getShake());
			p1.setLastRollValue(cup.getShake());
			GUI.setDice(cup.getDie1(), cup.getDie2());
			System.out.println ("Die One: " + cup.getDie1() + ", Die Two: " + cup.getDie2());
			System.out.println("Sum of points: " + p1.getPlayerScore());
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			ruleSnakeEyes(p1, cup);
			ruleForty(p1, cup);
			ruleThemSixes(p1, cup, scan);
		}
	}
}
