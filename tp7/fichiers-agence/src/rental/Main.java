package rental;

public class Main{


public static void main(String[] args){
			RentalAgency agency = new RentalAgency();
            Vehicle v = new Vehicle("Vroum", "Vroum", 2000, 100);
            Vehicle v1 = new Car("Mercedes", "c128", 500, 300,6);
			Vehicle v2 = new Car("BMW","x7", 1500, 250,4);
  			Vehicle v3 = new Motorbike("Vroum", "siriki", 1200, 120,4);
  			Vehicle v4 = new Motorbike("Vroum", "Bidule", 1300, 350,4);
            Client client1 = new Client("diakite abou", 20);
   	  		agency.addVehicle(v);
	  		agency.addVehicle(v1);
	  		agency.addVehicle(v2);
	  		agency.addVehicle(v3);
	  		agency.addVehicle(v4);
	  		System.out.println("L'affichage avec le filter MaxPriceFilter");
	  		VehicleFilter price = new MaxPriceFilter(260);
	  		agency.displaySelection(price);
	  		SuspiciousRentalAgency agency1 = new SuspiciousRentalAgency();
	  		agency1.addVehicle(v);
	  		System.out.println("Les clients qui ont loué dans l'agence sont");
	  		try{
	    			System.out.println("le prix de location du vehicle "+v.getBrand()+" est de "+agency1.rentVehicle(client1, v));
	  			}catch(UnknownVehicleException e){
	    			System.out.println("le vehicle n'exite pas dans l'agence");
	  			}catch(IllegalStateException e){
	    			System.out.println("le vehicle est loué ou le client loue déja un autre vehicle");
	  		}


	}	

}


