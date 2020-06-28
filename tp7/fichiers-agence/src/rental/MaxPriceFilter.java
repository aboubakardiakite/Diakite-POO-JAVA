package rental;
/**
 * a MaxPriceFilter allows to select a vehicle if its daily rental price is lower than a given price
*/
public class MaxPriceFilter implements VehicleFilter {
    private int price;
    /** @param price the maximal rental price */
    public MaxPriceFilter(int price) {
        this.price = price;
    }
    /**  @return <code>true</code> if v's daily rental price is lower than the maximal price
     * @see VehicleFilter#accept(Vehicle) 
     */
    public boolean accept(Vehicle v) {
        return this.price > v.getDailyPrice();
    }
}
