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
	Rules rule = new Rules();
	

		
			
	
	
			
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
				System.out.println ("Die One: " + cup.getDie1() + ", Die Two: " + cup.getDie2());
				System.out.println("Sum of points: " + p1.getPlayerScore());
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				if (p1.getPlayerScore() > 39)
					{
					rule.fourty();
					}
				if (cup.getDie1() == cup.getDie2())
				{
					player1();
				}
				if (p1.getPlayerScore() == 7)
				{
					rule.resetPlayerScore(p1);
					p1.getPlayerScore();
				}
			}
			
			public void player2()
			{
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.out.println(p2.getPlayerName() + " please roll the dies");
				scan.nextLine();
				cup.setRaffle();
				p2.setPlayerScore(cup.getRaffle());
				System.out.println ("Die One: " + cup.getDie1() + ", Die Two: " + cup.getDie2());
				System.out.println("Sum of points: " + p2.getPlayerScore());
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				if (p2.getPlayerScore() > 39)
				{
				rule.fourty();
				}
				if (cup.getDie1() == cup.getDie2())
				{
					player2();
				}
				if (p2.getPlayerScore() == 7)
				{
					rule.resetPlayerScore(p2);
					p2.getPlayerScore();
				}
			}
			
			
			


	}


