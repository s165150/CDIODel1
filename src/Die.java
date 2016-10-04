/**
 * This is the creation of our blueprint (class) Die.
 * Inside this class we've created a method called roll
 * If we want to call this method into another class we'll simply type die.setRoll() or die.getRoll.
 * This means that we're calling the class Die and then the method getRoll or setRoll.
 * This will in turn return the values seen below. What this means is that we now have a class
 * that will simulate a diceroll.
 * @author Aleksander/Martin
 *
 */
public class Die {
	
	//Creation of attributes
	private final int MAX = 6;
	private int faceValue;
	
	/**
	 * Creates the constructor, Die.
	 */
	public Die()
	{
		faceValue = 1;
	}
	
	/**
	 * This method rolls the die for us.
	 */
	public void setRoll() 
	{
		faceValue = (int) ((Math.random() * MAX) + 1);
	}
	
	/**
	 * This returns the die's value.
	 * @return
	 */
	public int getRoll()
	{
		return faceValue;
	}
}