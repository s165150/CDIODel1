
public class Raffle {
	Die die1 = new Die();
	Die die2 = new Die();
	
	int raffleValue;
	
	/**
	 * Creates the constructor, Raffle.
	 */
	public Raffle()
	{
		raffleValue = 0;
	}
	
	/**
	 * Rolls the dices, but doesnt return a value.
	 */
	public void setRaffle()
	{
		die1.setRoll();
		die2.setRoll();
	}
	/**
	 * Returns the value of the roll.
	 * @return
	 */
	public int getRaffle()
	{
		raffleValue = die1.getRoll() + die2.getRoll();
		return raffleValue;
	}
	/**
	 * Returns the value of Die1 from the roll.
	 * @return
	 */
	public int getDie1()
	{
		return die1.getRoll();
	}
	
	/**
	 * Returns the value of Die2 from the roll.
	 * @return
	 */
	public int getDie2()
	{
		return die2.getRoll();
	}
	
	/**
	 * Converts the rafflevalue from int to string.
	 */
	public String toString()
	{
		String result = Integer.toString(raffleValue);
		return result;
		
	}
}
