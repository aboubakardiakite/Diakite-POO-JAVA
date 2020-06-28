
/**
 * Décrivez votre classe LightString ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class LightString
{
    //les attributs de las classe LightString
    private Lightbulb[] light;
    private String etat;
    private String color;
    private int nombre;
    private int power;
    private Lightbulb theBulb;
    //constructeur
    /**
     * Initialise les guirlandes et ces propriete
     * @param nbLight qui represente le nombre de guilande
     */
    public LightString(int nbLight){
        this.etat="Off";
        this.nombre=nbLight;
        this.light=new Lightbulb[nbLight];
        for(int i=0;i<this.nombre;i++){
            this.light[i]=new Lightbulb(1,"white");
        }
    }
    /**
     * retourne l'etat de des guilandes
     * @return etat des guilandes
     */
    public String getState(){
            return this.etat;
    }
    /**
     * change l'etat de la guilande
     */
    public void setState(){
 
        if(this.etat=="Off"){
            this.etat="On";
        }else{
            this.etat="Off";
        }
        for(int i=0;i<this.nombre;i++){
            this.light[i].setState();
        }
    }
      /**
       * optenir la ieme ampoule de la guilande
       * @param indice de la guilande qui est strictement positive
       * @return une ampoule
       */  
       
    public Lightbulb getLight(int i){
        if(this.nombre<=i){
            return null;
        }else{
            return this.light[i];
        }
    }
    /** replace the n-th lightbulb of the light string by the given lightbulb.
     * Nothing happens if i is not a valid index.
     * @param i the number of the lightbulb to be changed (first has number 1)
     * @param theBulb the new lightbulb
     */
    public void changeLightbulb(int i, Lightbulb theBulb){
        this.theBulb = theBulb;
        this.light[i]=this.theBulb;
        
    }
    /**
     * donne comme resultat la puissance total exprimée en watt
     * @return un string qui correspond a la puissance de la guilande allumée ou pas
     */
    public String getConsumedPower(){
        this.power=0;
        String w;
        if(this.etat=="On"){
            for(int i=0;i<this.nombre;i++){
                this.power=this.power+1;
        }
        
    }
    w=this.power+"Watt";
    return w;
}
}
    
