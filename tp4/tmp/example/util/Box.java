package example.util;

/**
 *  In this simple version boxes have different weights, there is no other distinction
 * 
 * @author Diakite aboubakar siriki 
 * @version 1.0
 */

public class Box {   

    /**
     * creates a Box with given weight 
     * @param weight weight of the created box
     */
    public Box(int weight) {
        this.weight = weight;
    }
    
    // les attributs de la classe Caisse
    /** weight of the box*/
    private int weight;
    
    // les methodes de la classe Caisse 
    /**
     * @return box weight
     */
    public int getWeight() {
        return this.weight;
    }
    /**
    * @see java.lang.Object#toString()
    * @return a string representing a weight
    */
    public String toString() {
        return "a box of weight "+this.weight;
    }
}
