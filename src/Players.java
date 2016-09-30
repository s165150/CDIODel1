/**
 * Players class is created to keep track of the players name, and their current score in the game.
 * The way it does it is explained further down.
 * @author aleks
 *
 */
public class Players {
	
	private int nummer;
	private int score;
	private String nameOfPlayer;
	/**
	 * Creates the constructor
	 * @param nr Reserves space for the players number, if it is player 1 or player 2
	 * @param navn Reserves space for the players name.
	 * @param point Reserves space for the players name
	 */
	public Players (int nr, String name, int point)
	{
		nummer = nr;
		nameOfPlayer = name;
		score = point;
	}
	/**
	 * calculates the players score. This is done by having the (int point) added to the score. 
	 * (int point) can be any int, including int sum, from the main code.
	 * @param point
	 * @return
	 */
	public int setPlayerScore(int point)
	{
		score = score + point;
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
	public int ekstraTurn()
	{
		
	}
}

//HUSKESEDDEL AF HVAD TANKEN ER!!!!!!
//Når du oprettet players med nr og point, har du bare reserveret plads til de.
//så vi kan hele vejen igennem i Game vinduet ændre i players.point og få værdien ændret konstant.
