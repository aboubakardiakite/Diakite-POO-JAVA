package rental;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RentalAgencyTest {

			private RentalAgency agency;
			private Vehicle v;
			private Vehicle v1;
			private Vehicle v2;
			private Client client1;
			private Client client2;
			private Client client3;
			

			@Before
			public void Before(){
				this.agency = new RentalAgency();
				this.v = new Vehicle("Vroum", "Vroum", 2000, 100);
				this.v1 = new Vehicle("BMW","vroum",2000,120);
				this.v2 = new Vehicle("Mercedes","Vroum",3000,300);
				this.client1 =  new Client("Tim Oleon", 25);
				this.client2 =  new Client("Tim Oleon", 25);
				this.client3 =  new Client("Tim Oleon", 27);
				
			}

			@Test(expected=UnknownVehicleException.class)
			public void twoClientObjectsWithSameNameCorrespondsToSameClient() throws UnknownVehicleException,IllegalStateException{
				assertEquals(100, agency.rentVehicle(client1, v),0.0001);
				assertTrue(agency.hasRentedAVehicle(client1));
				assertTrue(agency.hasRentedAVehicle(client2));
			}

			@Test(expected=UnknownVehicleException.class)
			public void hasRentedAVehicleTest() throws IllegalStateException,UnknownVehicleException{
				this.agency.rentVehicle(this.client1,this.v);
				assertTrue(this.agency.hasRentedAVehicle(this.client1));
				assertFalse(this.agency.hasRentedAVehicle(this.client3));

			}
			@Test(expected=UnknownVehicleException.class)
			public void isRentedTest() throws UnknownVehicleException,IllegalStateException{
				this.agency.rentVehicle(this.client1,this.v);
				assertTrue(this.agency.isRented(this.v));
				assertFalse(this.agency.isRented(this.v1));
				
				
				

			}

			@Test(expected=UnknownVehicleException.class)
			public void rentVehicleTestWhenUnknownVehiculeException() throws UnknownVehicleException,IllegalStateException{
				this.agency.rentVehicle(this.client1, this.v2);
			}

			@Test(expected=UnknownVehicleException.class)
			public void rentVehicleTestWhenIllegalStateException() throws UnknownVehicleException,IllegalStateException{
				this.agency.rentVehicle(this.client1, this.v2);
				this.agency.rentVehicle(this.client2, this.v2);
				this.agency.rentVehicle(this.client1, this.v2);
			}

			@Test(expected=UnknownVehicleException.class)
			public void returnVehicleTest() throws IllegalStateException,UnknownVehicleException {
				this.agency.rentVehicle(this.client1, this.v2);
				assertTrue(this.agency.hasRentedAVehicle(this.client1));
				this.agency.returnVehicle(this.client1);
				assertFalse(this.agency.hasRentedAVehicle(this.client1));
			}

	// ---Pour permettre l'execution des tests ----------------------
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(rental.RentalAgencyTest.class);
	}

}
