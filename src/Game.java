/**
 * @author Aleksander and Morten N
 *
 */
import java.util.Scanner;

public class Game {
	
	//Creation of attributes and new instance of the class Scanner, Player, Shaker and Rule
	private String namePlayer1 = "";
	private String namePlayer2 = "";
	private int turnCount = (int) (Math.random()*2);
	private Scanner scan = new Scanner(System.in);
	private Shaker cup = new Shaker ();
	private Player player1 = new Player (namePlayer1, 0);
	private Player player2 = new Player (namePlayer2, 0);
	private Rule rule;
	
			/**
			 * This make a new instance of the class Rule, and makes the current Game instance, follow, for the rule class to access.
			 * This is NOT the optimal solution in our software! We need to work on this in another version.
			 */
			public Game()
			{
				rule = new Rule(this);
			}
			
			/**
			 * Method we use to enter the name of the players and print the start score
			 */
			public void start()
			{
				System.out.println("Welcome to the best dice game in the world!");
				System.out.println("The game must be played by two players.");
				System.out.println("The person who gets to start is decided by a coin flip.");
				System.out.println("The game has four rules:");
				System.out.println("1) The winner will be the player who first reaches 40 points and after that roll a pair");
				System.out.println("2) You will loose ALL of your points if you roll snake eyes (Pair of ones).");
				System.out.println("3) You will get an extra turn if you hit any pair of the same kind.");
				System.out.println("4) If you hit a pair of sixes two times in a row you win the game!");
				System.out.println("Press ENTER to start the game");
				scan.nextLine();
				System.out.println("Enter name of Player 1:");
				player1.setPlayerName(scan.next());
				System.out.println("Enter name of Player 2:");
				player2.setPlayerName(scan.next());
				scan.nextLine();
				System.out.println("Press ENTER to take the coin flip!");
				scan.nextLine();
				if (turnCount == 0)
				{
					System.out.println(player1.getPlayerName() + " won the coin flip!");
				}
				else
					System.out.println(player2.getPlayerName() + " won the coin flip!");
			}
	
			/**
			 * Method to play the game - This shake the cup, printout the score and make sure our rules is complied
			 * @param player Player1 or Player2
			 * @param cup Cup we use to roll the dice
			 * @param rule We use rule to make sure our rules is complied
			 */
			public void play(Player player, Shaker cup, Rule rule)
			{
				playerTurn(player, cup);
				rules(player, cup, rule);
			}
			
			/**
			 * Method for our rules
			 * @param player Player1 or Player2
			 * @param cup Cup we use to roll the dice
			 * @param rule We use rule to make sure our rules is complied
			 */
			public void rules(Player player, Shaker cup, Rule rule)
			{
				rule.ruleSnakeEyes(player); 
				rule.ruleForty(player, cup);
				rule.ruleThemSixes(player, cup);
				rule.ruleEquals(player, cup);
			}
			
			/**
			 * Method we use every new turn - This shakes the cup, roll the dice, printout the score and update the total score.
			 * @param player Player1 or Player2
			 * @param cup Cup we use to roll the dice
			 */
			public void playerTurn(Player player, Shaker cup)
			{
				System.out.println();
				System.out.println(player.getPlayerName() + " please press ENTER to roll the dice");
				scan.nextLine();
				cup.setShake();
				player.setPlayerScore(cup.getShake());
				player.setLastRollValue(cup.getShake());
				System.out.println(player.getPlayerName() + " you got:");
				System.out.println("Die One: " + cup.getDie1() + ", Die Two: " + cup.getDie2());
				System.out.println("Total score: " + player.getPlayerScore());
			}
			
			/**
			 * Method to start the game - The turnCount makes a "coin flip" and decides who will start the game
			 */
			public void startGame()
			{
			start();
			
				while(turnCount == 0)
				{
					play(player1, cup, rule);
					play(player2, cup, rule);
				}	
			
				while(turnCount == 1)
				{
					play(player2, cup, rule);
					play(player1, cup, rule);
				}
			}
}