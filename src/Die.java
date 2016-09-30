/**
 * Her går vi ind og navngiver et blueprint (class) Die.
 * Inde i den Die, har vi så en roll. Når vi så vil "kalde" den i andre dele skrives der
 * die.roll(); Det betyder at den kalder klassen die, og så derefter funktionen roll.
 * Den returnere her så det skrevne, og vi har så en klasse der returnere et terningekast
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
	public int roll() {
		
		
		faceValue = (int) (Math.random() * MAX + 1);
		
		return faceValue;
	}
	
	
	public int getFacevalue()
	{
		return faceValue;
	}
	}