
public class Raffle {
	
	Die die1, die2;
	int dice1, dice2;
	
	public void setShake()
	{
		dice1 = die1.roll(); 
		dice2 = die2.roll();
		
	}
	public int getShake()
	{
		return dice1 + dice2;
		
	}
}
