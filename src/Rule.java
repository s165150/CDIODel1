import java.util.Scanner;

public class Rule {
	
	/**
	 * Creates the rule that states that if a player gets more than 40 points and then hits 2 equals, he/she wins.
	 * @param player
	 * @param cup
	 */
	public void ruleForty(Player player, Shaker cup)
	{
		if (player.getPlayerScore()>40)
		{
			if(cup.getDie1() == cup.getDie2())
			{
			System.out.println("You win!");
			System.exit(0);
			}
		}
	}
	/**
	 * Creates the rule for snakeeyes. If the player hits double aces, his/her score gets reset.
	 * @param player
	 * @param cup
	 */
	public void ruleSnakeEyes(Player player, Shaker cup)
	{
		if (player.getLastRollValue() == 2 && cup.getShake() == 2)
		{
			System.out.println("Your score has been reset. Stay away from snakes!");
			player.resetPlayerScore();			
		}
		
		
	}
	/**
	 * Sets the rule that when the player hits 2 6's he/she gets a chance to win the game. The extra WIN turn is not counted into his/her points.
	 * @param player
	 * @param cup
	 */
	public void ruleThemSixes(Player player, Shaker cup, Scanner scan)
	{
		if (player.getLastRollValue() == 12)
		{
			
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("You just hit them double 6's. Try again and win the game");
			System.out.println(player.getPlayerName() + " please roll the dies");
			scan.nextLine();
			cup.setShake();
			player.setPlayerScore(cup.getShake());
			player.setLastRollValue(cup.getShake());
			//GUI.setDice(cup.getDie1(), cup.getDie2());
			System.out.println ("Die One: " + cup.getDie1() + ", Die Two: " + cup.getDie2());
			if (player.getLastRollValue() == 12)
			{
				//Wins the game on two sixes in a row
				System.out.println("Jackpot! You got two sixes in a row!");
				System.exit(0);	
			}
			System.out.println("Better luck next time");
		}
	}
	/**
	 * Creates the rule that when the player hits 2 equal eyes, he/she gets another turn.
	 * @param player
	 * @param cup
	 */
	public void ruleEquals(Player player, Shaker cup, Scanner scan)
	{

		while (cup.getDie1() == cup.getDie2())
		{
			System.out.println("EXTRA TURN");
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println(player.getPlayerName() + " please roll the dies");
			scan.nextLine();
			cup.setShake();
			player.setPlayerScore(cup.getShake());
			player.setLastRollValue(cup.getShake());
			//GUI.setDice(cup.getDie1(), cup.getDie2());
			System.out.println ("Die One: " + cup.getDie1() + ", Die Two: " + cup.getDie2());
			System.out.println("Sum of points: " + player.getPlayerScore());
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			ruleSnakeEyes(player, cup);
			ruleForty(player, cup);
			ruleThemSixes(player, cup, scan);
		}
	}
}
