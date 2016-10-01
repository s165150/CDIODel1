
public class Raffle {
	Die die1 = new Die();
	Die die2 = new Die();
	
	int raffleValue;
	
	
	public Raffle()
	{
		raffleValue = 0;
	}
	
	public void setRaffle()
	{
		die1.setRoll();
		die2.setRoll();
	}
	
	public int getRaffle()
	{
		raffleValue = die1.getRoll() + die2.getRoll();
		return raffleValue;
	}
	
	public int getDie1()
	{
		return die1.getRoll();
	}
	
	public int getDie2()
	{
		return die2.getRoll();
	}
	
	public String toString()
	{
		String result = Integer.toString(raffleValue);
		return result;
		
	}
}
