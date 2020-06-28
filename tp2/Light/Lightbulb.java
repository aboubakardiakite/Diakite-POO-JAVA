
/**
 * Write a description of class Lightbulb here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lightbulb
{
    // les attributs de la classe
    private String state;
    private int power;
    private String color;
    //constructeur
    /**
     * Bulds a Lightbuld,initialy it is off,the power is 220,the color
     * is yellow
     */
    public Lightbulb(){
        this.state="Off";
        this.power=220;
        this.color="yellow";
    }
    /**
     *Bulds a Lightbuld,initialy it is off,the power is 220,the color
     *@param the power and the color
     */
    public Lightbulb(int power,String color){
        this.state="Off";
        this.power=power;
        this.color=color;
    }
   //les methodes de la classe
    /**
     * change the state of light
     */
    public void setState(){
        if(this.state=="Off"){
            this.state="On";
        }else{
            this.state="Off";
        }
    }
    /**
     * return this state of Light
     * @return this state of Light
     */
    public String getState(){
        return this.state;
    }
    
    /**
     * return the color of light
     * @return the color
     */
    public String getColorLight(){
        return this.color;
    }
    /**
     * return the power of light
     * @return the power of light
     */
    public int getPowerLight(){
        return this.power;
    }
    /**
     * @return a string representation for this Lightbulb
     */
    public String toString(){
        String resultat;
        if(this.getState()=="On"){
            resultat="On";
        }else{
                resultat="Off";
        }
        return "ampoule est "+resultat+" de couleur "+getColorLight()+" et une puissance de "+getPowerLight()+"W";
    }
}
