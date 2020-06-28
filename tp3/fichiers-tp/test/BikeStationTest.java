
import static org.junit.Assert.*;

import org.junit.Test;


public class BikeStationTest {

	@Test
	public void dataAreCorrectAtCreation() {
		BikeStation station = new BikeStation("timoleon",5);
		assertEquals("timoleon", station.getName() );
		assertEquals(5, station.getCapacity() );
		// no bike at creation
		assertEquals(0, station.getNumberOfBikes() );
	}
	
	
	@Test
	public void firstFreeSlotWhenOneSlotIsFree() {
		BikeStation station = new BikeStation("none",5);
		// no bike slot 0 is first slot
		assertEquals(0, station.firstFreeSlot());
		station.dropBike(new Bike("ref1",BikeModel.CLASSICAL));
		station.dropBike(new Bike("ref2",BikeModel.CLASSICAL));
		// two bikes added, first free slot is 2
		assertEquals(2, station.firstFreeSlot());
	}
	
	@Test
	public void firstFreeSlotReturnsMinusOneWhenNoFreeSlots() {
		BikeStation station = new BikeStation("none",5);
		// fill the station
		for (int i = 0; i < station.getCapacity(); i++) {
			station.dropBike(new Bike("ref",BikeModel.CLASSICAL));
		}
		// no more free slots
		assertEquals(-1, station.firstFreeSlot());		
	}


	@Test
	public void dropBikeReturnsTrueWhenFreeSlot() {
		BikeStation station = new BikeStation("none",2);
		Bike b1 = new Bike("ref",BikeModel.CLASSICAL);
		// check that bike can be droped 
		assertTrue(station.dropBike(b1));
		// there is 1 more bike
		assertEquals(1, station.getNumberOfBikes());
		// similar with second bike
		assertTrue(station.dropBike(b1));
		assertEquals(2, station.getNumberOfBikes());
	}
    
	@Test
	public void dropBikeReturnsFalseWhenNoFreeSlot() {
		BikeStation station = new BikeStation("none",2);
		Bike b1 = new Bike("ref",BikeModel.CLASSICAL);
		// two first bikes can be dropped
		assertTrue(station.dropBike(b1));
		assertEquals(1, station.getNumberOfBikes());
		assertTrue(station.dropBike(b1));
		assertEquals(2, station.getNumberOfBikes());
		// already two added bikes, can not drop a third one
		assertFalse(station.dropBike(b1));
		assertEquals(2, station.getNumberOfBikes());
	}
    
	@Test
	public void dropBikeUseFirstFreeSlot() {
		BikeStation station = new BikeStation("none",2);
		Bike b1 = new Bike("ref",BikeModel.CLASSICAL);
		// first free slot is 0
		assertEquals(0, station.firstFreeSlot());
		// use first free slot (0)
		station.dropBike(b1);
		// first free slot has been used, then it has become 1
		assertEquals(1, station.firstFreeSlot());
		// use first free slot (1)
		station.dropBike(b1);
		// and now it is -1 since station is full
		assertEquals(-1, station.firstFreeSlot());		
	}


	@Test
	public void takeBikeIsOkWhenBikeAvailable() {
		BikeStation station = new BikeStation("none",5);
		Bike b1 = new Bike("ref",BikeModel.CLASSICAL);
		station.dropBike(b1);
		assertEquals(1, station.getNumberOfBikes());
		// taken bike, at slot 0, is b1
		assertSame(b1,station.takeBike(0));
		assertEquals(0, station.getNumberOfBikes());
	}

	@Test
	public void takeBikeReturnsNullWhenNoBike()  {
		BikeStation station = new BikeStation("none",5);
		assertNull(station.takeBike(0));
	}
	@Test
	public void takeBikeReturnsNullWhenIndexNegative() {
		BikeStation station = new BikeStation("none",5);
		Bike b1 = new Bike("ref",BikeModel.CLASSICAL);
		station.dropBike(b1);
		assertNull(station.takeBike(-1));
	}
	@Test
	public void takeBikeReturnsNullWhenIndexTooBig() {
		BikeStation station = new BikeStation("none",5);
		Bike b1 = new Bike("ref",BikeModel.CLASSICAL);
		station.dropBike(b1);
		// index too big
		assertNull(station.takeBike(10));
	}

	
    

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(BikeStationTest.class);
    }

    
}

