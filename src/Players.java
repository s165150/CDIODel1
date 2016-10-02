/**
 * Players class is created to keep track of the players name, and their current score in the game.
 * The way it does it is explained further down.
 * @author aleks
 *
 */
public class Players {
	
	private int nummer = 0;
	private int score = 0;
	private String nameOfPlayer;
	private int dice1 = 0;
	private int dice2 = 0;
	private int sum = 0;
	/**
	 * Creates the constructor
	 * @param nr Reserves space for the players number, if it is player 1 or player 2
	 * @param navn Reserves space for the players name.
	 * @param point Reserves space for the players name
	 */
	public Players (int nr, String name, int point, int die1, int die2, int summen)
	{
		nummer = nr;
		nameOfPlayer = name;
		score = point;
		dice1 = die1;
		dice2 = die2;
		sum = summen;
	}
	public void setDie1(int p)
	{
		dice1 = p;
	}
	public void setDie2(int p)
	{
		dice2 = p;
	}
	public int getDie1()
	{
		return dice1;
	}
	public int getDie2()
	{
		return dice2;
	}
	/**
	 * calculates the players score. This is done by having the (int point) added to the score. 
	 * (int point) can be any int, including int sum, from the main code.
	 * @param point
	 * @return
	 */
	public int setPlayerScore(int p)
	{
		score = score + p;
		return score;
	}
	/**
	 * Sets the player name
	 * @param name
	 * @return
	 */
	public String setPlayerName(String name)
	{
		
		nameOfPlayer = name;
		return name;
		
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
	
}

//HUSKESEDDEL AF HVAD TANKEN ER!!!!!!
//N�r du oprettet players med nr og point, har du bare reserveret plads til de.
//s� vi kan hele vejen igennem i Game vinduet �ndre i players.point og f� v�rdien �ndret konstant.
