package pfc;

import pfc.strategy.*;
import java.util.*;

public class Player{

	private int  nbPoints;
	private String name;
	private Strategie st;
	
	/**
	 *creates the player
	 *
	 *@param name of the player
	 *@param s the strategy choice
	 */	

	public Player(String name,Strategie s){
		this.name=name;
		this.st=s;
		this.nbPoints=0;
	}

	/**
	 *Increase the number of points
	 *@param n the number of points add
	 */

	public void addPoints(int n){
		this.nbPoints+=n;
	}
	
	/**
	 *return the points
	 *@return the number points
	 */

	public int getPoints(){
		return this.nbPoints;
	}
	/**
         *return the name of player
         *@return the name of player
         */

	public String getName(){
		return this.name;
	}
	/**
	 *return the strategy choice by player
	 *@return the strategy choice of player
	 */

	public Choice choose(){
		return this.st.strategy();
	}

	

}
