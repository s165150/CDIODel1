/**
 * Players class is created to keep track of the players name, and their current score in the game.
 * The way it does it is explained further down.
 * @author aleks
 *
 */
public class Player {
	
	private int score = 0;
	private String nameOfPlayer;
	private int lastValue = 0;
	/**
	 * Creates the constructor
	 * @param nr Reserves space for the players number, if it is player 1 or player 2
	 * @param navn Reserves space for the players name.
	 * @param point Reserves space for the players name
	 */
	public Player (String name, int point)
	{
		nameOfPlayer = name;
		score = point;
	}
	
	/**
	 * calculates the players score. This is done by having the (int point) added to the score. 
	 * (int point) can be any int, including int sum, from the main code.
	 * @param point
	 * @return
	 */
	public int setPlayerScore(int currentShakerValue)
	{
		score = score + currentShakerValue;
		return score;
	}
	/**
	 * Sets the player name
	 * @param name
	 * @return
	 */
	public  void setPlayerName(String name)
	{
		
		nameOfPlayer = name;
		
	}
	/**
	 * Returns the players name.
	 * @return
	 */
	public String getPlayerName()
	{
		return nameOfPlayer;
	}
	/**
	 * Returns the players current score.
	 * @return
	 */
	public int getPlayerScore()
	{
		return score;
	}
	/**
	 * Resets a players score to 0.
	 * @return
	 */
	public int resetPlayerScore()
	{
		score = 0;
		return score;
	}
	/**
	 * Stores the last roll the player made. This is done so we can see if he scores 2 6's 2 times in a row.
	 * @param p
	 */
	public void setLastRollValue(int currentShakerValue)
	{
		lastValue = currentShakerValue;
	}
	
	/**
	 * Returns the last roll the player made.
	 * @return
	 */
	public int getLastRollValue()
	{
		return lastValue;
	}
}
