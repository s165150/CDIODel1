import java.util.Scanner;

import desktop_resources.GUI;

public class Game {
	
	private Scanner scan = new Scanner(System.in);
	private String name1 = "a";
	private String name2 = "a";
	private Shaker cup = new Shaker ();
	private Player p1 = new Player (name1, 0);
	private Player p2 = new Player (name2, 0);
	private Rule rule = new Rule();
	private int turnCount = (int) (Math.random()*2);
	

		
			
	
	
			
			public void start()
			{
				System.out.println("Indtast spiller 1's navn:");
				p1.setPlayerName(scan.next());
//				name1 = scan.nextLine();
//				p1.setPlayerName(name1);
				System.out.println("Indtast spiller 2's navn:");
				p2.setPlayerName(scan.next());
				scan.nextLine();
				System.out.println(p1.getPlayerScore() + " " + p1.getPlayerName());
				System.out.println(p2.getPlayerScore() + " " + p2.getPlayerName());	
			}
	
	
			public void player(Player p1, Shaker cup, Rule rule)
			{
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
				rule.ruleSnakeEyes(p1, cup); 
				rule.ruleForty(p1, cup);
				rule.ruleThemSixes(p1, cup, scan);
				rule.ruleEquals(p1, cup, scan);
				
				
			}
			
			public void startGame()
			{
			
			start();
			
			while(turnCount == 2)
			{
				player(p1, cup, rule);
				player(p2, cup, rule);
			}	
			
			while(turnCount == 1)
			{
				player(p2, cup, rule);
				player(p1, cup, rule);
			}
			}
			
			
			


	}



