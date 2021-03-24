****dépôt des TP de POO des étudiants aboubakar siriki diakite ET avave itir

I-Preseantation du TP et ses Objectifs

Ce TP appellé pierre feuille ciseaux  consiste a fait jouer un humain qui choisir les strategies qu'il voudrait applique   et un ordinateur qui joueur aleatoirement et à la fin renvoye le nom du gagnant si c'est l'humain qui gagne il renvoy le nom de l'humain et si ordinateur il renvoy ordinateur

II- Les instructions
	1-génération et consultation de la documentation
	a-génération
	Ce placer dans le fichier src et exécutez la commande suivante :
	-pour générer la documentation du paquetage pfc, pfc.strategy et io on fait : 
			javadoc pfc pfc.strategy  io -d ../docs/
				     	ou				
			make doc


b-consultation de la documentation
		Pour consulter la documentation ce placer dans le dossier docs et ouvrir le fichier index.html dans le navigateur.
	
2-Compiler les sources du projet
Ce placer dans le dossier src
Compiler l'ensemble des sources du paquetage pfc ou io on fait la commande suivante dans le shell:

			javac pfc/*.java io/*.java -d ../classes
					       ou							 
			make compiler
			

3-Compiler et exécuter les tests
Ce placer dans la racine du projet avec l'existance du dossier classes
-Compiler
		javac -cp test-1.7.jar test/GameTest test/PlayerTest.java  	                                 
		                        ou				
		make compileTest    

-Exécuter le test
		java -jar test-1.7.jar GameTest
				ou	
		make compileGameTest

		java -jar test-1.7.jar PlayerTest
			ou
		make compilePlayerTest

4-Génération du fichier .jar
	pour générer le fichier.jar on se place dans le dossier classes et tape la commande suivante: 
		jar cvf ../executable.jar pfc io
			ou						
		make genereJar

	por consulter on se place dans la racine et on fait:
		jar tvf executable.jar
			ou	
		make consulteJar

5-executer le programme
	-generer le fichier manifest d'abord
	on se place dans le repertore classes et on fait
		jar cvfm ../executable.jar ../manifest-ex pfc/ io/
				ou
		make manifest
	-avec le fihier jar 
	on se place dans la racine cu fichier et on fait :
		
		java -jar executable.jar
			ou
		make exeWithJar
	
-sans le fichier .jar on se place dans la racine du tp est on fait
		java -cp  classes/ pfc.Main
			OU
		make exeMain


Comment créer une nouvelle stretegie?

on se place dans le package pfc.strategy et on creer une classe implementer par l'interface Strategie puis à l'interieur de cette classe qui n'a pas de constructeur on code une methode qui a pour signature:
	public Choice strategy();
sans oublié d'importer le package pfc.*;


