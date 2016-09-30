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
	 * Creates the (Kan ikke huske hvad det hedder)
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
	
	public int points(int point)
	{
		score = score + point;
		return score;
	}
	public String getPlayerName(String name)
	{
		
		nameOfPlayer = name;
		return name;
		
	}
	
	public String getName()
	{
		return nameOfPlayer;
	}
	
	public int getSum()
	{
		return score;
	}
	
}

//HUSKESEDDEL AF HVAD TANKEN ER!!!!!!
//Når du oprettet players med nr og point, har du bare reserveret plads til de.
//så vi kan hele vejen igennem i Game vinduet ændre i players.point og få værdien ændret konstant.
