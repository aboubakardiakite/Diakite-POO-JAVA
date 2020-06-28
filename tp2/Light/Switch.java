
/**
 * Un Swich qui permet d'allumer et d'etteindre une ampoule donnée.
 *
 * @author Diakite aboubakar siriki,elias frik
 * @version 1.0
 */
public class Switch
{
    //les attributs de la classe
    private Lightbulb onLight;
    private boolean state;
    //constructeur
    /**
     * Initialisation du Swich
     * @param light de type Lightbulb
     */
    public Switch(Lightbulb light){
            this.onLight=light;
            this.state=false;
    }
    //les methodes de classe Switch
    /**
     * permet de changer l'etat de l'ampoule
     */
    public void on_Off(){
            if(this.onLight.getState()=="On"){
                this.state=false;
                this.onLight.setState();
            }else{
                this.state=true;
                this.onLight.setState();
            }
        }
    /**
     * return l'etat de l'ampoule
     * @return une une chaine de carratere correspondant à l'etat de l'ampoule
     */
     
    public String getStateOn_Off(){
        String mState;
                if(this.state==true){
                 mState="On";   
                }else{
                    mState="Off";
                }
         return mState;
    }
                
    
    
    
}
