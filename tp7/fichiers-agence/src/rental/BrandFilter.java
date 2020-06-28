 package rental;
/** a BrandFilter allows to select a Vehicle for a given brand
*/

public class BrandFilter implements VehicleFilter {
    private String brand;
    /**
     *  @param brand the required brand 
     *  */
    public BrandFilter(String brand) {
        this.brand = brand;
    }
    /** @return <code>true</code> if v's brand is the same than the required brand 
     *  @see VehicleFilter#accept(Vehicle) */
    public boolean accept(Vehicle v) {
        return this.brand.equals(v.getBrand());
    }
}
