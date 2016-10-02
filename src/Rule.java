import java.util.Scanner;

import desktop_resources.GUI;

public class Rule {
	
	Players p1, p2;
	Die die1 = new Die();
	Die die2 = new Die();
	Raffle cup;
	Game runagain;
	Scanner scan = new Scanner(System.in);
	
	
	/**
	 * Creates the rule about if a player gets above 40 points and hit 2 equals, he wins.
	 * @param p1
	 * @param cup
	 */
	public void fourty(Players p1, Raffle cup)
	{
		if (p1.getPlayerScore()>200)
		{
			if(cup.getDie1() == cup.getDie2())
			{
			System.out.println(cup.getDie1() + " " + cup.getDie2());
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
	public void snakeEyes(Players p1, Raffle cup)
	{
		if (p1.getLastRollValue() == 2 && cup.getRaffle() == 2)
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
	public void themSixes(Players p1, Raffle cup)
	{
		if (p1.getLastRollValue() == 12)
		{
			
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("You just hit them double 6's. Try again and win the game");
			System.out.println(p1.getPlayerName() + " please roll the dies");
			scan.nextLine();
			cup.setRaffle();
			p1.setPlayerScore(cup.getRaffle());
			p1.setLastRollValue(cup.getRaffle());
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
	public void equals(Players p1, Raffle cup)
	{

		while (cup.getDie1() == cup.getDie2())
		{
			System.out.println("EXTRA TURN");
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println(p1.getPlayerName() + " please roll the dies");
			scan.nextLine();
			cup.setRaffle();
			p1.setPlayerScore(cup.getRaffle());
			p1.setLastRollValue(cup.getRaffle());
			GUI.setDice(cup.getDie1(), cup.getDie2());
			System.out.println ("Die One: " + cup.getDie1() + ", Die Two: " + cup.getDie2());
			System.out.println("Sum of points: " + p1.getPlayerScore());
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			snakeEyes(p1, cup);
			fourty(p1, cup);
			themSixes(p1, cup);
		}
	}
}
