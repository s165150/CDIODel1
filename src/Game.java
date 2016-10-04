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
	private Rule rule = new Rule();
	
	
			//Method we use to enter the name of the players and print the start score
			public void start()
			{
				System.out.println("Enter name of Player 1:");
				player1.setPlayerName(scan.next());
				System.out.println("Enter name of Player 2:");
				player2.setPlayerName(scan.next());
				scan.nextLine();
				System.out.println();
				System.out.println(player1.getPlayerName() + " - Score: " + player1.getPlayerScore());
				System.out.println(player2.getPlayerName() + " - Score: " + player2.getPlayerScore());
			}
	
			//Method to play the game - This shake the cup, printout the score and make sure our rules is complied
			public void play(Player player, Shaker cup, Rule rule)
			{
				System.out.println(player.getPlayerName() + " please press ENTER to roll the dice");
				scan.nextLine();
				cup.setShake();
				player.setPlayerScore(cup.getShake());
				player.setLastRollValue(cup.getShake());
				System.out.println ("Die One: " + cup.getDie1() + ", Die Two: " + cup.getDie2());
				System.out.println("Total score: " + player.getPlayerScore());
				rule.ruleSnakeEyes(player, cup); 
				rule.ruleForty(player, cup);
				rule.ruleThemSixes(player, cup, scan);
				rule.ruleEquals(player, cup, scan);
				System.out.println();
			}
			
			//Method to start the game - The turnCount makes a "coin flip" and decides who will start the game
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