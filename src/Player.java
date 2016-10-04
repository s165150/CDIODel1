/**
 * Player class is created to keep track of the player's name, and their current score in the game.
 * The way this is done is explained below.
 * @author aleks
 *
 */
public class Player {
	
	private int score = 0;
	private String nameOfPlayer;
	private int lastValue = 0;
	/**
	 * Creates the constructor
	 * @param nr reserves space for the player's number, either player 1 or player 2
	 * @param navn reserves space for the player's name.
	 * @param point reserves space for the player's name
	 */
	public Player (String name, int point)
	{
		nameOfPlayer = name;
		score = point;
	}
	
	/**
	 * calculates the player's score. This is done by having the (int point) added to the score. 
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
	 * Sets the player's name
	 * @param name
	 * @return
	 */
	public  void setPlayerName(String name)
	{
		nameOfPlayer = name;
	}
	/**
	 * Returns the player's name.
	 * @return
	 */
	public String getPlayerName()
	{
		return nameOfPlayer;
	}
	/**
	 * Returns the player's current score.
	 * @return
	 */
	public int getPlayerScore()
	{
		return score;
	}
	/**
	 * Resets a player's score to 0.
	 * @return
	 */
	public int resetPlayerScore()
	{
		score = 0;
		return score;
	}
	/**
	 * Stores the last roll a player has made. This is done in order to see if he/she scores 2 6's twice in a row.
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