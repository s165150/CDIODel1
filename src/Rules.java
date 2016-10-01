
public class Rules {
	
	Game run1, run2;
	int sum1;
	int sum2;
	int count = (int) (Math.random()*2+1);

	String name1 = "a";
	String name2 = "a";
	Raffle cup = new Raffle ();
	public Players p1 = new Players (1, name1, 0);
	public Players p2 = new Players (2, name2, 0);
	int sum = 0;
	
	public Rules()
	{
		
	}
	
	
	public void fourty()
	{

			System.out.println("Du vandt");
			System.exit(0);
		
	}
	
	public void equals1()
	{
		run1.player1();
	}
	
	public void equals2()
	{
		run1.player2();
	}
	
	public void resetPlayerScore(Players p1)
	{
		p1.resetPlayerScore();
	
	}
	
}
