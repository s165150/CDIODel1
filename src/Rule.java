import java.util.Scanner;

public class Rule {
	
	Players p1, p2;
	Die die1 = new Die();
	Die die2 = new Die();
	Raffle cup;
	Game runagain;
	Scanner scan = new Scanner(System.in);
		
	
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
	
	public void snakeEyes(Players p1, Raffle cup)
	{
		if (p1.getLastRollValue() == 2 && cup.getRaffle() == 2)
		{
			p1.resetPlayerScore();			
		}
		
		
	}
	public void themSixes(Players p1, Raffle cup)
	{
		if (p1.getLastRollValue() == 12)
		{
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println(p1.getPlayerName() + " please roll the dies");
			scan.nextLine();
			cup.setRaffle();
			p1.setPlayerScore(cup.getRaffle());
			p1.setLastRollValue(cup.getRaffle());
			System.out.println ("Die One: " + cup.getDie1() + ", Die Two: " + cup.getDie2());
			if (p1.getLastRollValue() == 12)
			{
				//Wins the game on two sixes in a row
				System.out.println("Jackpot! You got two sixes in a row!");
				System.exit(0);	
			}
		}
	}
	
}
