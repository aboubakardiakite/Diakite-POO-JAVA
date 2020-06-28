import battleship.*;
import battleship.util.*;
import org.junit.*;
import static org.junit.Assert.*;
public class seaTest{
    @Test
    public void creationSea(){
        Sea sea=new Sea(15,15);
        assertNotNull(sea);
    }
    
    @Test
    public void tryingShootCellWithEmptyShip(){
      Sea sea=new Sea(10,10);
      Position p=new Position(0,0);
      Answer ans=sea.shoot(p);
      assertSame(Answer.MISSED,ans);
    }
    @Test
    public void answeringWhenACellIsAttackedSecondly(){
      Sea sea=new Sea(10,10);
      Position p=new Position(0,0);
      Ship ship =new Ship(2,1);
      sea.addShipHorizontally(ship,p);
      Answer ans1=sea.shoot(p);
      assertSame(Answer.HIT,ans1);
      Answer ans2=sea.shoot(p);
      assertSame(Answer.MISSED,ans2);
    }
    @Test
    public void answeringWhenShipSunked(){
      Sea sea=new Sea(10,10);
      Position p=new Position(0,0);
      Ship ship =new Ship(1,1);
      sea.addShipVertically(ship,p);
      Answer ans1=sea.shoot(p);
      assertSame(Answer.SUNK,ans1);
      Answer ans2=sea.shoot(p);
      assertSame(Answer.MISSED,ans2);
    }
    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testGetCellWithBadPosition(){
      Sea sea = new Sea(5,5);
      Position p = new Position(10,10);
      Cell cell = sea.getCellPosition(p);
    }
    @Test
    public void goodPositionOfCells(){
      Sea sea=new Sea(5,5);
      Position p=new Position(2,3);
      Cell cell =sea.getCellPosition(p);
      assertNotNull(cell);
      assertSame(cell,sea.getCellPosition(p));
    }
    @Test
    public void posiibilituAdditionVertically(){
        Sea sea=new Sea(2,2);
        Position p=new Position(0,0);
        Cell cell =sea.getCellPosition(p);
        Ship ship =new Ship(10,2);
        sea.addShipVertically(ship,p);
        Position p1=new Position(0,0);
        Position p2=new Position(0,1);
        Cell cell1=sea.getCellPosition(p1);
        Cell cell2=sea.getCellPosition(p2);
        assertSame(cell1.getShip(),cell2.getShip());
    }
    @Test (expected =IllegalStateException.class)
    public void canPlacedBadPosition(){
      Sea sea=new Sea(2,2);
      Position p=new Position(10,10);
      Ship ship =new Ship(10,2);
      sea.addShipVertically(ship,p);
    }
    @Test (expected =IllegalStateException.class)
    public void ousideoftheboard(){
      Sea sea=new Sea(2,2);
      Position p=new Position(0,0);
      Ship ship =new Ship(10,3);
      sea.addShipVertically(ship,p);
      sea.addShipHorizontally(ship,p);
    }
    @Test (expected =IllegalStateException.class)
    public void refusinbatPosition(){
      Sea sea=new Sea(2,2);
      Position p=new Position(10,10);
      Ship ship =new Ship(10,2);
      sea.addShipHorizontally(ship,p);
    }
    @Test (expected =IllegalStateException.class)
    public void refusewhenplaceoccuped(){
      Sea sea=new Sea(2,2);
      Position p=new Position(0,0);
      Ship ship =new Ship(10,1);
      sea.addShipHorizontally(ship,p);
      Ship ship2=new Ship(5,1);
      sea.addShipVertically(ship2,p);
    }
    @Test
    public void tryAdditionVerticallyInSea(){
        Sea sea=new Sea(10,10);
        Position p=new Position(0,0);
        Cell cell =sea.getCellPosition(p);
        Ship ship =new Ship(10,2);
        sea.addShipHorizontally(ship,p);
        Position p1=new Position(0,0);
        Position p2=new Position(1,0);
        Cell cell1=sea.getCellPosition(p1);
        Cell cell2=sea.getCellPosition(p2);
        assertSame(cell1.getShip(),cell2.getShip());
    }
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(seaTest.class);
        }

}
