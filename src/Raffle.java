
public class Raffle {
	
	Die die1, die2;
	private int dice1, dice2;
	int sum;
	
	public Raffle (int sum)
	{
		int summen = sum;
	}
	
	public void setShake()
	{
		dice1 = die1.getRoll(); 
		dice2 = die2.getRoll();
		
	}
	/**
	 * Returns the value of the dices.
	 * @return
	 */
	public int getShake()
	{
		return dice1+dice2;
		
	}
	
}
