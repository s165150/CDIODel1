
public class Rules {
	
	
	int sum1;
	int sum2;
	int count = (int) (Math.random()*2+1);

	String name1 = "a";
	String name2 = "a";
	Raffle cup = new Raffle ();
	public Players p1 = new Players (1, name1, 0, 0, 0, 0);
	public Players p2 = new Players (2, name2, 0, 0, 0, 0);
	Game run = new Game();
	int sum = 0;
	
	public Rules()
	{
		
	}
	
	
	public void fourty(Players p1)
	{

		if (p1.getPlayerScore() > 39)
		{
			System.out.print("You won!");
			System.exit(0);
		}
		
	}
// VIRKER IKKE	
	public void equals1(Players p1)
	{
		if (p1.getDie1() == p1.getDie2())
		{	
		run.player(p1);
		}
	}
	
		
	

// VIRKER IKKE
	public void equals2(Raffle cup, Game run)
	{
		if (cup.getDie1() == cup.getDie2())
		{	
		run.player2();
		}
	}
	
		
	


	public void resetPlayerScore(Raffle cup, Players p1)
	{
		if (cup.getRaffle() == 7)
		{
		p1.resetPlayerScore();
		p1.getPlayerScore();
		System.out.println("Your score has been reset");
		}
	
	}
	
}
