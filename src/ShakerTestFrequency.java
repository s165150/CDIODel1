/**
 * @author Morten N
 *
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class ShakerTestFrequency
{

	@Test
	public void testShaker() 
	{
		//Define attributes for test
		Shaker shaker = new Shaker();
		int two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0, ten = 0, eleven = 0, twelve = 0, shakeValue, controlCount = 0;
		
		//While loop for shaker test - Test for 110000 shakes
		while (controlCount < 110000)
		{
			//Shake the dice from the class shaker
			shaker.setShake();
			shakeValue = shaker.getShake();
			
			//Switch statement for control count and shake
			switch (shakeValue)
			{
			case 2: two++; controlCount++; break;
			case 3: three++; controlCount++; break;
			case 4: four++; controlCount++; break;
			case 5: five++; controlCount++; break;
			case 6: six++; controlCount++; break;
			case 7: seven++; controlCount++; break;
			case 8: eight++; controlCount++; break;
			case 9: nine++; controlCount++; break;
			case 10: ten++; controlCount++; break;
			case 11: eleven++; controlCount++; break;
			case 12: twelve++; controlCount++;
			}	
	    }
		
		//Printout to confirm result
		System.out.println("Frequency and result of 110000 shakes");
		System.out.println("Two: " + two);
		System.out.println("Three: " + three);
		System.out.println("Four: " + four);
		System.out.println("Five: " + five);
		System.out.println("Six: " + six);
		System.out.println("Seven: " + seven);
		System.out.println("Eight: " + eight);
		System.out.println("Nine: " + nine);
		System.out.println("Ten: " + ten);
		System.out.println("Eleven: " + eleven);
		System.out.println("Twelve: " + twelve);
		System.out.println("Total: " + controlCount);
		
		//Test assertEquals on 110000 shakes
		assertEquals(3000,two,200);
		assertEquals(6000,three,300);
		assertEquals(9000,four,400);
		assertEquals(12000,five,500);
		assertEquals(15000,six,600);
		assertEquals(18000,seven,700);
		assertEquals(15000,eight,600);
		assertEquals(12000,nine,500);
		assertEquals(9000,ten,400);
		assertEquals(6000,eleven,300);
		assertEquals(3000,twelve,200);
		assertEquals(110000,controlCount);		
	}

}
