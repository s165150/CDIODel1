/**
 * @author Aleksander and Morten N
 */
public class Shaker {
	
	//Creation of attributes and new instance
	private int shakeValue;
	Die die1 = new Die();
	Die die2 = new Die();
	
	/**
	 * Creates the constructor, Shaker.
	 */
	public Shaker()
	{
		shakeValue = 0;
	}
	
	/**
	 * Rolls the dice, but doesn't return a value.
	 */
	public void setShake()
	{
		die1.setRoll();
		die2.setRoll();
	}
	
	/**
	 * Returns the value of the roll.
	 * @return
	 */
	public int getShake()
	{
		shakeValue = die1.getRoll() + die2.getRoll();
		return shakeValue;
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
	 * Converts the shakeValue from an int to a string.
	 */
	public String toString()
	{
		String result = Integer.toString(shakeValue);
		return result;
		
	}
}