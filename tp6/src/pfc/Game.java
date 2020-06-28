package pfc;
import pfc.strategy.*;

import java.util.*;

public class Game{
		private Player player1;
		private Player player2;
		private Choice choix1;
		private Choice choix2;
		private int nbRound;

		/**Creates a Game 	
		*
		*@param two player and the number of round
		*/
		public Game(Player player1,Player player2,int nbRound){
			this.player1=player1;
			this.player2=player2;
			this.nbRound=nbRound;
			
		}
		/**
		 *return the number of round
		 *@return number of round
		 */
		public int getnbRound(){
			
			return this.nbRound;
		}
		/**
		 *return the player
		 *@return the first player 
		 */
		public Player getPlayer1(){
			return this.player1;
		}

		/**
                 *return the second player
                 *@return the second player 
                 */

		public Player getPlayer2(){
			return this.player2;
		}
		/**
		 *return the choice of the first player
		 *@return the choice of the first player
		 */

		public Choice getChoice1(){
			return this.choix1;
		}
		/**
                 *return the choice of the second player
                 *@return the choice of the second player
                 */
		public Choice getChoice2(){
			return this.choix2;
		}
		/**
		 *Takes in param two players and compares their choice of game
		 *@param player1 the first player
		 *@param player2 the second player 
		 *@return the results of the comparison of the players'choice
		 */
		
		public int playOneRound(Player player1,Player player2){
			this.choix1 = player1.choose();
			this.choix2 = player2.choose();
			int resultat  = this.choix1.compareChoice(this.choix2);
			return resultat;
		}
		/**
		 *return a string the name and the choice of players 
		 *@param player1 the first player
		 *@param player2 the second player
		 *@param choix1 the choice of the first player
		 *@param choix2 the choice of the second player
		 *@return the String  the names of the players and choice 
		 */

		public String toStringPlayer(Player player1,Choice choix1,Player player2,Choice choix2){
			return player1.getName()+" a joué "+choix1+". "+player2.getName()+" a joué "+choix2;
		}
		/**
                 *return a name of the winner
                 *@param player the winner player
                 *@return a names of the winner
                 */
		public String toStringPlayerWinner(Player player){
			return player.getName()+" l'emporte et marque 2 points";
		}
		/**
		 *the result of the point from players
		 *@param player1 the first player
                 *@param player2 the second player
		 *@return the result of the point from players
		 */

		public String toStringScore(Player player1,Player player2){
			return "le score et de maintenant : "+player1.getName()+" = "+player1.getPoints()+" points - "+player2.getName()+" = "+player2.getPoints()+" points";
		}
		/**
		 *Plays the game according of nounds entered
		 *@param nbRound the number of round
		 *@return the object the name of winner
		 */
		public Object play(int nbRound){
			
			for(int i=0;i<nbRound;i++){
				int cpt = playOneRound(this.player1,this.player2);
				System.out.println(toStringPlayer(this.player1,this.choix1,this.player2,this.choix2));
				if(cpt<0){
					this.player2.addPoints(2);
					System.out.println(toStringScore(this.player1,this.player2));
					System.out.println(toStringPlayerWinner(player2));
				}else{
					if(cpt>0){
						this.player1.addPoints(2);
						System.out.println(toStringScore(this.player1,this.player2));
						System.out.println(toStringPlayerWinner(player1));
					}else{
						if(cpt==0){
					this.player2.addPoints(1);
					this.player1.addPoints(1);
					System.out.println(toStringScore(this.player1,this.player2));
						}
					}

					
				}
			}

			if(this.player1.getPoints()<this.player2.getPoints()){
				return this.player2.getName();
			}else{
				if(this.player1.getPoints()>this.player2.getPoints())
					return this.player1.getName();
				else
					return "match nul";
			}
		
						
		}

		

	}

		






