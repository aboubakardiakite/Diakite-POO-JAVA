package rental;

import java.util.*;

/** a rental vehicle agency, client can rent one vehicle at a time */
public class RentalAgency {
    // vehicles of this agency
    private List<Vehicle> theVehicules;

    // maps client and rented vehicle (at most one vehicle by client) 
    private Map<Client,Vehicle> rentedVehicles;

    public RentalAgency() {
        this.theVehicules = new ArrayList<Vehicle>();
        this.rentedVehicles = new HashMap<Client,Vehicle>();
    }
    
    /** adds a vehicle to this agency 
    * @param v the added vehicle
    */
    public void addVehicle(Vehicle v) {
    	this.theVehicules.add(v);
    }

    /** provides the list of the vehicles that is accepted by filter  
    * @param filter the selection filter
    * @return  the list of the vehicles accepted by filter
    */
    public List<Vehicle> select(VehicleFilter filter){	
        List<Vehicle> res = new ArrayList<Vehicle>();
        for(Vehicle v: this.theVehicules){
            if(filter.accept(v)){
                res.add(v);
            }
        }
        return res;
    }
    
    /** displays the vehicles accepted by the filter 
    * @param filter the selection filter
    */
    public void displaySelection(VehicleFilter filter){
        for(Vehicle v: this.theVehicules){
            if(filter.accept(v)){
                System.out.println("Les vehicules acceptés par le filtre sont "+v);
            }
        }
    	
    }


    /** returns <em>true</em> iff client c is renting a vehicle
     * @param client the client for which we want to know it has rented a vehicle
    * @return <em>true</em> iff client c is renting a vehicle
    */
    public boolean hasRentedAVehicle(Client client){
            if(this.rentedVehicles.containsKey(client)){
                return true;
            }
        return false;
    }
    
    /** returns <em>true</em> iff vehicle v is rented
     * @param v the vehicle we want to check if it is rented
    * @return <em>true</em> iff vehicle v is rented    
    */
    public boolean isRented(Vehicle v){
    	if(this.rentedVehicles.containsValue(v)){
            return true;
        }
        return false;
    }

   /** client rents a vehicle 
    * @param client the renter
    * @param v the rented vehicle
    * @return the daily rental price
    * @exception UnknownVehicleException   if v is not a vehicle of this agency  
    * @exception IllegalStateException if v is already rented or client rents already another vehicle
    */
    public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException{
        if(isRented(v) || hasRentedAVehicle(client))
                throw new IllegalStateException();
        else                
            if(!this.rentedVehicles.containsValue(v))
                throw new UnknownVehicleException();
            else
                return v.getDailyPrice();

    }

    
    /** the client returns a rented vehicle. Nothing happens if client didn't have rented a vehicle. 
    * @param client the client who returns a vehicle
    */
    public void returnVehicle(Client client){
            if(hasRentedAVehicle(client)){
                this.rentedVehicles.remove(client);
            }
    }
    /** provides the collection of rented vehicles for this agency
    * @return collection of currently rented vehicles 
    */
    public Collection<Vehicle> allRentedVehicles(){
            return this.rentedVehicles.values();
      
    }

}
