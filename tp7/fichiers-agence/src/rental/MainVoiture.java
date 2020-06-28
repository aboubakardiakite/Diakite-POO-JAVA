package rental;

import java.util.*;

public class MainVoiture{

  public static void main(String[] args) {
            RentalAgency agency = new RentalAgency();
            Vehicle v = new Vehicle("Vroum", "Vroum", 2000, 100);
    		Vehicle v1 = new Vehicle("Renault", "206", 500, 300);
    		Vehicle v2 = new Vehicle("BMW","x7", 1500, 250);
            Vehicle v3 = new Vehicle("Mercedes", "c180", 1200, 120);
            Client client1 = new Client("diakite abou", 20);
            Client client2 = new Client("siriki", 30);
            agency.addVehicle(v);
            agency.addVehicle(v1);
            agency.addVehicle(v2);
            agency.addVehicle(v3);
            System.out.println("L'affichage avec MaxPriceFilter");
            VehicleFilter price = new MaxPriceFilter(260);
            agency.displaySelection(price);
            System.out.println("L'affichage des vehicle avec le filter BrandFilter");
            VehicleFilter brand = new BrandFilter("Renault");
            agency.displaySelection(brand);
            System.out.println("L'affichage davec le filter AndFilter");
            AndFilter filter = new AndFilter();
            filter.addFilter(price);
            filter.addFilter(brand);
            agency.displaySelection(filter);
            System.out.println("L'affichage des client qui ont loué dans l'agence");
            try{
            System.out.println("le client "+client1.getName()+" a loué la voiture "+v.getBrand()+" "+agency.rentVehicle(client1,v));
            System.out.println("le client "+client2.getName()+" a loué la voiture "+v1.getBrand()+" "+agency.rentVehicle(client2,v1));
          }catch(UnknownVehicleException e){
            System.out.println("le vehicle n'exite pas dans l'agence");
          }catch(IllegalStateException e){
            System.out.println("le vehicle est loué ou le client loue déja un autre vehicle");
          }
            agency.returnVehicle(client1);

  }
}
