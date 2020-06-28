package rental;

public interface VehicleFilter {
	  /**
	   * @param v the vehicle that must be tested by the filter
	   * @return true if and only id the vehicle v is accepted by this filter.
	   * v is said to be selected by this filter.
	  */
    public boolean accept(Vehicle v);
}
