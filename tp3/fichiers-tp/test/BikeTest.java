

import static org.junit.Assert.*;

import org.junit.Test;


public class BikeTest {

	@Test 
	public void modelAndIdAreCorrectAfterCreation() {
		Bike b1 = new Bike("ref1", BikeModel.CLASSICAL);
		assertEquals("ref1", b1.getId());
		assertEquals(BikeModel.CLASSICAL, b1.getModel());
	}
	
	
	@Test 
	public void testEqualsReturnsTrueWhenSameId( ) {
		Bike b1 = new Bike("ref1", BikeModel.CLASSICAL);
		Bike sameIdThanB1 = new Bike("ref1", BikeModel.CLASSICAL);
		assertTrue( b1.equals( b1 ) );
		assertTrue( b1.equals( sameIdThanB1 ) );
	}
	@Test 
	public void testEqualsReturnsFalseWhenNotSameId( ) {
		Bike b1 = new Bike("ref1", BikeModel.CLASSICAL);
		Bike b2 = new Bike("ref2", BikeModel.CLASSICAL);
		assertFalse(b1.equals( b2 ) );
	}
	@Test 
	public void testEqualsReturnsFalseWhenNotABikeOrNull( ) {
		Bike b1 = new Bike("ref1", BikeModel.CLASSICAL);
		assertFalse(b1.equals( new Object() ) );
		assertFalse(b1.equals( null ) );
	}

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(BikeTest.class);
    }

    
}

