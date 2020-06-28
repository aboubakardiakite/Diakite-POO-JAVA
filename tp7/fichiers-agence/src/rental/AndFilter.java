package rental;
import java.util.*;
/**
 * An AndFilter performs the intersection of filters. It accepts a vehicle if each of its filter accepts it.
*/
public class AndFilter implements VehicleFilter {
    
    private List<VehicleFilter> theFilters;

    /** creates an InterFilter with no filter */
    public AndFilter() {
        this.theFilters = new ArrayList<VehicleFilter>();
    }

    /** adds a new filter
    * @param f the added filter
    */
    public void addFilter(VehicleFilter f) {
        this.theFilters.add(f);
    }

    /** Accept the vehicle if each of its filters accepts it 
     * @see VehicleFilter#accept(Vehicle) */
    public boolean accept(Vehicle v){
          for(VehicleFilter filter: this.theFilters){
            if((filter.accept(v))){
              return true; 
            }
          }
	      return false;
    }
}
