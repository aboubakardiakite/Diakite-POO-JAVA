package pfc;
import java.util.*;

public enum Choice{
	PIERRE,FEUILLE,CISEAUX;

	private Choice choix;
	
	public Choice getChoice(){
		return this.choix;
	}
	/**
	 *comparison two choice of the players
	 *@param c the Choice
	 *@return result of the comparison
	 */
	public int compareChoice(Choice c){
		if(this == c)
			return 0;
		if(this == PIERRE){
			if(c == CISEAUX)
				return 1;
			else
				return -1;
		}
		if(this == CISEAUX){
			if(c == FEUILLE)
				return 1;
			else
				return -1;
		}
		if(this == FEUILLE){
			if(c == PIERRE)
				return 1;
			else 
				return -1;
		}
		return 0;
	}



}

	

