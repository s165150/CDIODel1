/**
 * @author Aleksander and Morten N
 *
 */
public class Rule {
	Game play;
	
	public Rule(Game game) {
		play = game;
		
	}

	/**
	 * Creates the rule that states that if a player gets more than 40 points and then hits 2 equals, he/she wins.
	 * @param player Player1 or Player2
	 * @param cup Cup we use to roll the dice
	 */
	public void ruleForty(Player player, Shaker cup)
	{
		if (player.getPlayerScore()>40)
		{
			if(cup.getDie1() == cup.getDie2())
			{
			System.out.println(player.getPlayerName() + " Won!");
			System.exit(0);
			}
		}
	}
	
	/**
	 * Creates the rule for snake eyes. If the player hits double aces, his/her score gets reset.
	 * @param player Player1 or Player2
	 * @param cup Cup we use to roll the dice
	 */
	public void ruleSnakeEyes(Player player)
	{
		if (player.getLastRollValue() == 2)
		{
			System.out.println("Your score has been reset. Stay away from snakes!");
			player.resetPlayerScore();			
		}
	}
	
	/**
	 * Sets the rule that when the player hits 2 6's he/she gets a chance to win the game. The extra WIN turn is not counted into his/her points.
	 * @param player Player1 or Player2
	 * @param cup Cup we use to roll the dice
	 */
	public void ruleThemSixes(Player player, Shaker cup)
	{
		if (player.getLastRollValue() == 12)
		{
			System.out.println("You just hit them double 6's. Try again and win the game");
			play.playerTurn(player, cup);
			ruleSnakeEyes(player);
			ruleEquals(player, cup);
			
			if (player.getLastRollValue() == 12)
			{
				//Wins the game on two sixes in a row
				System.out.println(player.getPlayerName() + " Jackpot! You got two sixes in a row!");
				System.exit(0);	
			}
			System.out.println("Better luck next time");
			
		}
	}
	
	/**
	 * Creates the rule that when the player hits 2 equal eyes, he/she gets another turn.
	 * @param player Player1 or Player2
	 * @param cup Cup we use to roll the dice
	 */
	public void ruleEquals(Player player, Shaker cup)
	{
		while (cup.getDie1() == cup.getDie2())
		{
			System.out.println("EXTRA TURN");
			play.playerTurn(player, cup);
			ruleSnakeEyes(player);
			ruleForty(player, cup);
			ruleThemSixes(player, cup);
		}
	}
}
