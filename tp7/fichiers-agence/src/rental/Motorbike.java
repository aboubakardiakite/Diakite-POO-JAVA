package rental;
import java.util.*;

public class Motorbike extends Vehicle{
	protected int capacity;

	public Motorbike(String brand, String model,int productionYear, float dailyRentalPrice,int capacity){
		 super(brand,model,productionYear,dailyRentalPrice);
		 this.capacity=capacity;
	}

	/**
	 * @return the capacity for this Motobike
	 */
	public int getCapacity(){
		return this.capacity;
	}


	 public String toString() {
        return super.toString() + " " + this.capacity+" "+" m³";
    }
}