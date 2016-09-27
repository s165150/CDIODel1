
public class RollingDice {

	public static void main(String[] args) 
	{
		Die die1, die2;
		int sum;
		
		die1 = new Die();
		die2 = new Die();
		
		
		die1.roll();
		die2.setFaceValue(4);
		
		// Prints out value of both dice and the sum of the two
		
		System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
		 sum = die1.getFaceValue() + die2.getFaceValue();
		 System.out.println ("Sum: " + sum);
		 
		 } 
}