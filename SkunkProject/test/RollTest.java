import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RollTest
{

	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void test_new_roll()
	{
		Roll roll = new Roll();
		assertNotEquals("missing Dice in new Roll",null,roll.getDice());
	}
	
	@Test
	public void test_double_skunk()
	{
		Roll roll = new Roll();
		Die die1 = new Die(new int[] { 1 });
		Die die2 = new Die(new int[] { 1 });
		
		roll.setDice(die1,die2);
		
		assertTrue ("double skunk not rolled", roll.isDoubleSkunk() );
		
	}
	

}
