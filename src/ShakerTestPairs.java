/**
 * @author Morten N
 *
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class ShakerTestPairs
{

	@Test
	public void testShaker() 
	{
		//Define attributes for test
		Shaker shaker = new Shaker();
		int pairOfOne = 0, pairOfTwo = 0, pairOfThree = 0, pairOfFour = 0, pairOfFive = 0, pairOfSix = 0, shakeValue, die1, die2, controlCount = 0, totalCountOfRolls = 0;
		float percent = 0;
		
		//While loop and for shaker test - Test for 120000 shakes
		while (controlCount < 120000)
		{
			//Shake and get the dice from the class shaker
			shaker.setShake();
			shakeValue = shaker.getShake();
			die1 = shaker.getDie1();
			die2 = shaker.getDie2();
			totalCountOfRolls++;
			
			//If statements count the resualt
			if (die1 == die2 && shakeValue == 2)
			{
				pairOfOne++; controlCount++;
			}
			if (die1 == die2 && shakeValue == 4)
			{
				pairOfTwo++; controlCount++;
			}
			if (die1 == die2 && shakeValue == 6)
			{
				pairOfThree++; controlCount++;
			}
			if (die1 == die2 && shakeValue == 8)
			{
				pairOfFour++; controlCount++;
			}
			if (die1 == die2 && shakeValue == 10)
			{
				pairOfFive++; controlCount++;
			}
			if (die1 == die2 && shakeValue == 12)
			{
				pairOfSix++; controlCount++;
			}
	    }
		
		//Calculate percent
		percent = (float)controlCount/totalCountOfRolls*100;
		
		//Printout to confirm result
		System.out.println("Distribution and result of 120000 shakes");
		System.out.println("Double One: " + pairOfOne);
		System.out.println("Double Two: " + pairOfTwo);
		System.out.println("Double Three: " + pairOfThree);
		System.out.println("Double Four: " + pairOfFour);
		System.out.println("Double Five: " + pairOfFive);
		System.out.println("Double Six: " + pairOfSix);
		System.out.println("Total: " + controlCount);
		System.out.println("Total count of rolls: " + totalCountOfRolls);
		System.out.println("The frequency is " + percent + "% - Should be around 16.7%");
		
		//Test assertEquals on 110000 shakes
		assertEquals(20000,pairOfOne,300);
		assertEquals(20000,pairOfTwo,300);
		assertEquals(20000,pairOfThree,300);
		assertEquals(20000,pairOfFour,300);
		assertEquals(20000,pairOfFive,300);
		assertEquals(20000,pairOfSix,300);
		assertEquals(120000,controlCount);
	}

}