
/**
 * Décrivez votre classe Gods ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Gods
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private double value;
    private String name;
    /**
     * Gods is defined by its name
     * @param name the name of Gods
     */
    public Gods(String name)
    {
       this.name=name;//le type du parametre est String comme celui
       this.value=0;  //de l'attribut
    }
    /**
     * Gods is defined by its name,its value
     * @param name the name of Gods
     * @param value the value of Gods
     */
    public Gods(double value,String name)
    {
        this.value=value;//les types des parametres est pareille que
                            //que celui des attributs
        this.name=name;
    }
    /**
     * return value
     */
    public double getValue()
    {
        return this.value;
    }
    /**
     * set value
     * @param value
     * return newvalue
     */
    public void setValue(double value)
    {
         this.value=value;
    }
    /**
     * @return name
     */
    public String getName()
    {
        return this.name;
    }
    /**
     * return set name
     * @return name change name
     * 
     */
    public String setName(String name)
    {
        return this.name=name;
    }
    /**
     * provide a string representation for this Gods object
     * @return a string representaation for this Godds
     */
    public String toString(){
           
            return "the goods "+this.name+" cost "+this.value;
     
    }
    /**
     * return the value TTC
     * @return TTC
     */
    public double valeurTTC(){
        
        return this.value-(this.value*20/100);
                
    }
}
