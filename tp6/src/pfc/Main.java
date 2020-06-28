package pfc;

import io.*;
import java.io.*;
import java.util.*;
import pfc.strategy.*;

public class Main{
	public static void main(String[] args){
		Player player1;
		Player player2;
		Game game;
		Object winner;
		try{
			System.out.println("Nous avons les strategies suivante :\n- 1 pour la jouer pierre\n- 2 pour jouer feuille\n- 3 pour jouer ciseaux\n- 4 pour jouer aleatoirement s.v.p : \n");

			System.out.println("Entrez le nombre de tours s.v.p: ");
			int nRound = Integer.parseInt(Input.readString());
			
			System.out.println("Entrez votre nom s.v.p: ");
			String nom = Input.readString();

			System.out.println("Choisissez votre strategie: ");
			int strategie = Integer.parseInt(Input.readString());
			while(strategie!= 1 && strategie!= 2 && strategie!= 3 && strategie!= 4){
				System.out.println("votre strategie n'existe pas dans la liste recommencez s.v.p : ");
				strategie = Integer.parseInt(Input.readString());
			}
		
			player2 = new Player("ordinateur", new RandomStrategy());
			if(strategie == 1){
				player1 = new Player(nom, new PlayPierre());
				game = new Game(player1,player2,nRound);
				winner = game.play(game.getnbRound());
				System.out.println("le vainqueur est "+winner);
			}

			if(strategie == 2){
				player1 = new Player(nom, new PlayFeuille());
				game = new Game(player1,player2,nRound);
				winner = game.play(game.getnbRound());
				System.out.println("le vainqueur est "+winner);
			}
			if(strategie == 3){
				player1 = new Player(nom, new PlayCiseaux());
				game = new Game(player1,player2,nRound);
				winner = game.play(game.getnbRound());
				System.out.println("le vainqueur est "+winner);
			}

			if(strategie == 4){
				player1 = new Player(nom, new RandomStrategy());
				game = new Game(player1,player2,nRound);
				winner = game.play(game.getnbRound());
				System.out.println("le vainqueur est "+winner);
			}

		}catch(Exception e){
		System.out.println("Vous avez saisir une mauvaise valeur pour le nombre de tours recommencez le jeux s.v.p ");
	}
	
		
		
	

	}	



}
