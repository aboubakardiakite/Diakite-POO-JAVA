import battleship.*;
import battleship.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class CellTest {
    
    @Test
    public void testFirstDecreaseLifePoints(){
        Cell c = new Cell();
        Ship s = new Ship(4,1);
        c.setShip(s);
        assertEquals(4,s.getLifePoints());
        c.hit();
        assertEquals(3,s.getLifePoints());

        
    }
    @Test
    public void testShotWhenAlreadyShotDoesNotChangeLifePoint(){
        Cell c = new Cell();
        Ship s = new Ship(4,1);
        c.setShip(s);
        assertEquals(4,s.getLifePoints());
        c.hit();
        assertEquals(3,s.getLifePoints());
        c.hit();
        assertEquals(3,s.getLifePoints());
    }
    

    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(CellTest.class);
    }

}
