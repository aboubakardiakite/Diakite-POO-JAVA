package rental;
import java.util.*;

public class SuspiciousRentalAgency extends RentalAgency{

  private int surcout;
  public SuspiciousRentalAgency(){
    super();
    surcout = 10;
  }
  /**
* Change additional cost of this renatal agency.
*/
  public void setCout(int n){
    this.surcout = n;
  }
  /** client rented a vehicle
  * @param client the rented
  * @param v the rented vehicle
  * @return the daily rental price whith cost if the client age is inferior 25 year.
  * @exception UnknownVehicleException   if v is not a vehicle of this agency
  * @exception IllegalStateException if v is already rented or client rents already another vehicle
  */

  public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException{
    float price = super.rentVehicle(client,v);
    if (client.getAge()<25){
      price = price + (price* this.surcout/100);
    }
    return price;
  }

}
