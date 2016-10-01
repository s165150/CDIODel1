
public class Raffle {
	
	Die die1, die2;
	die1.setRoll();
	die2.setRoll();
	int dice1 = die1.getRoll();
	int dice2 = die2.getRoll();
	
	
	public Raffle ()
	{
		
	}
	
	public void setShake()
	{
		dice1 = die1.setRoll();
		dice2 = 
			
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
