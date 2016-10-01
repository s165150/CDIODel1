
public class Raffle {
	Die die1 = new Die();
	Die die2 = new Die();
	
	int d1, d2, score;
	
	
	public Raffle(int dice1, int dice2, int sum)
	{
		d1 = dice1;
		d2 = dice2;
		score = sum;
	}
	
	public void setDice1()
	{
		d1 = die1.getRoll();
		}
	
	public int getDice1()
	{
		return d1;
	}
	
	public void setDice2()
	{
		d2 = die2.getRoll();
	}
	
	public int getDice2()
	{
		return d2;
	}
	
	public int setScore()
	{
		score = d1+d2;
		return score;
	}
	public int getScore()
	{
		return score;
	}
	
}
