/**
 * Her igen har vi s� en blueprint (klasse) der s� henter ting fra Die klassen.
 * Ideen er s� her at den laver die1 og die2 fra den funktion der var i Die.roll
 * Derefter giver den s� resultatet til brugeren.
 * Derudover er lavet to int til die1 og die2, s� disse kan f�res nemmere over i andre
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
