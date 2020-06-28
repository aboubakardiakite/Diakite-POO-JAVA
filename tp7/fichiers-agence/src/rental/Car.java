package rental;
import java.util.*;
public class Car extends Vehicle{
   
    protected int nbDePassagers;

    public Car(String brand, String model,int productionYear, float dailyRentalPrice,int nbDepassagers){
        super(brand,model,productionYear,dailyRentalPrice);
        this.nbDePassagers=nbDepassagers;
    }
    /**
     * @return the assager for this vehicle
     */
    public int getnbDePassagers(){
        return this.nbDePassagers;
    }

    public String toString() {
        return super.toString() + " " + this.nbDePassagers+" "+" places";
    }






}