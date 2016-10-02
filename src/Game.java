import java.util.Scanner;

public class Game {
	
	Scanner scan = new Scanner(System.in);
	int count = (int) (Math.random()*2+1);

	String name1 = "a";
	String name2 = "a";
	Raffle cup = new Raffle ();
	public Players p1 = new Players (1, name1, 0);
	public Players p2 = new Players (2, name2, 0);
	int sum = 0;
	Rule rule = new Rule();
	Die die1, die2;
	

		
			
	
	
			
			public void start()
			{
				System.out.println("Indtast spiller 1's navn:");
				name1 = p1.setPlayerName(scan.nextLine());
				System.out.println("Indtast spiller 2's navn:");
				name2 = p2.setPlayerName(scan.nextLine());
				
				
				System.out.println(p1.getPlayerScore() + " " + p1.getPlayerName());
				System.out.println(p2.getPlayerScore() + " " + p2.getPlayerName());	
			}
	
	
			public void player1()
			{
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.out.println(p1.getPlayerName() + " please roll the dies");
				scan.nextLine();
				cup.setRaffle();
				p1.setPlayerScore(cup.getRaffle());
				p1.setLastRollValue(cup.getRaffle());
				System.out.println ("Die One: " + cup.getDie1() + ", Die Two: " + cup.getDie2());
				System.out.println("Sum of points: " + p1.getPlayerScore());
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				rule.snakeEyes(p1, cup); 
				rule.fourty(p1, cup);
				rule.themSixes(p1, cup);
				rule.equals(p1, cup);
				
				
			}
			
			public void player2()
			{
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.out.println(p2.getPlayerName() + " please roll the dies");
				scan.nextLine();
				cup.setRaffle();
				p2.setPlayerScore(cup.getRaffle());
				p2.setLastRollValue(cup.getRaffle());
				System.out.println ("Die One: " + cup.getDie1() + ", Die Two: " + cup.getDie2());
				System.out.println("Sum of points: " + p2.getPlayerScore());
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				rule.snakeEyes(p2, cup);
				rule.fourty(p2, cup);
				rule.themSixes(p2, cup);
				rule.equals(p2, cup);
				
								
			}
			
			
			


	}



