/**
 * Her igen har vi så en blueprint (klasse) der så henter ting fra Die klassen.
 * Ideen er så her at den laver die1 og die2 fra den funktion der var i Die.roll
 * Derefter giver den så resultatet til brugeren.
 * Derudover er lavet to int til die1 og die2, så disse kan føres nemmere over i andre
 * classes.
 * @author aleks
 *
 */
public class Points {
	Die die1, die2;
	int dice1, dice2, sum;
	
	
	public int sum()
	{
		dice1 = die1.roll();
		dice2 = die2.roll();
		sum = dice1 + dice2;
		return sum;
	}
	
	
	
	
	
//	public int sum() {
//		
//		point = (die1.roll()+die2.roll());
//		return point;
//	}
//
//	public int die1() {
//		// TODO Auto-generated method stub
//		return die1;
//	}
//
//	public int die2() {
//		// TODO Auto-generated method stub
//		return die2;
//	}
//	
	
	
}
