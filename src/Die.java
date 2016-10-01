/**
 * Her g�r vi ind og navngiver et blueprint (class) Die.
 * Inde i den Die, har vi s� en roll. N�r vi s� vil "kalde" den i andre dele skrives der
 * die.roll(); Det betyder at den kalder klassen die, og s� derefter funktionen roll.
 * Den returnere her s� det skrevne, og vi har s� en klasse der returnere et terningekast
 * @author aleks
 *
 */
public class Die 
{
	private final int MAX = 6;
	private int faceValue;
	
	public Die()
	{
		faceValue = 1;
	}
	public void setRoll() {
		
		
		faceValue = (int) (Math.random() * MAX + 1);
		
		}
	
	
	public int getRoll()
	{
		faceValue = (int) (Math.random() * MAX + 1);
		return faceValue;
	}
	}