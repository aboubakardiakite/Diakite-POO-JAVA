import org.junit.*;
import static org.junit.Assert.*;

import example.Robot;
import example.util.*;

public class RobotTest{

	@Test
	public void testTake(){
	Robot carry = new Robot();
	Box b = new Box(10);
	carry.take(b);
	assertEquals(b,carry.getCarriedBox());
	Box c = new Box(12);
	carry.take(c);
        assertEquals(b,carry.getCarriedBox());
	}


	
	@Test
	public void testcarryBox(){
		Robot robot= new Robot();
		assertFalse(robot.carryBox());
		robot.take(new Box(12));
		assertTrue(robot.carryBox());
	}

	@Test
	public void testPutOn(){
	Robot robbie = new Robot();
	Box bo = new Box(12);
	robbie.take(bo);
	ConveyerBelt conv =new ConveyerBelt(15);
	robbie.putOn(conv);
	assertFalse(robbie.carryBox());
	Box b = new Box(15);
	robbie.take(b);
	ConveyerBelt cov =new ConveyerBelt(10);
	robbie.putOn(cov);
	assertTrue(robbie.carryBox());
	assertEquals(b,robbie.getCarriedBox());
	
	}






    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(RobotTest.class);
    }
}

