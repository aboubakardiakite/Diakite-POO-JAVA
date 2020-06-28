
/**
 * Décrivez votre classe Stock ici.
 *
 * @author diakite,frik
 * @version (un numéro de version ou une date)
 */
public class Stock
{
    // Les ATTRIBUTS
    /**
     * la quantité stocker
     */
    private int quantity;
    
    //Constructeur : pour construire les instances
    /**
     * 
     */
     public Stock(int newQuantity){
            this.quantity=newQuantity;
        }
    
    /**
     * Builds a Stock,Initilly quantity
     */
    public Stock(){
        this.quantity=0;
    }
    
    /**
     * return the quantity of Stock
     */
     
    public int getQuabtity(){
        return this.quantity;
    }
    
    /**
     * increase the quantity of Stock
     */
    public void add(int n){
            this.quantity=this.quantity+n;
    }
    
    /**
     * decrease the stock if @n less than at @this.quantity
     */
    public void remove(int n){
            if(this.quantity>=n){
                this.quantity=this.quantity-n;
            }
    }
    
    
    /**
     * 
     */
    
    public String toString(){
        String donne;
        donne="the stock's quantity is "+this.quantity;
        return donne; 
    } 
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}