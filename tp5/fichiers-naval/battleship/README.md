dépôt des TP de POO des étudiants aboubakar siriki diakite

I-Preseantation du TP et ses Objectifs

Ce TP appellé  consistait à mettre crée un jeux appelé battaille navale qui consistait a fait joeur deux personne qui sont le defenseur et l'attaquant qui essay de fait coulé leurs bateaux en utilisant des paquetage, et plusieur classe dans ces packages

II- Les instructions
	1-génération et consultation de la documentation
	a-génération
	Ce placer dans le fichier src et exécutez la commande suivante :
	-pour générer la documentation du paquetage battleship et battleship.util on fait : 
			javadoc battleship battleship.util -d ../docs

	-pour générer la documentation du paquetage io on fait : 
			javadoc io -d ../docs

	b-consultation de la documentation
		Pour consulter la documentation ce placer dans le dossier docs et ouvrir le fichier index.html dans le navigateur.
	
	2-Compiler les sources du projet
	Ce placer dans le dossier src
	Compiler l'ensemble des sources du paquetage battleship ou date on fait la commande suivante dans le shell:
		
			javac battleship/*.java -d ../classes
			javac io/*.java -d ../classes
			

	3-Compiler et exécuter les tests
	Ce placer dans la racine du projet avec l'existance du dossier classes
	-Compiler
		javac -cp test-1.7.jar test/CellTest.java
		javac -cp test-1.7.jar test/seaTest.java 
		javac -cp test-1.7.jar test/shipTest.java 	

	-Exécuter le test
		java -jar test-1.7.jar CellTest
		java -jar test-1.7.jar seaTest
		java -jar test-1.7.jar shipTest


	4-Génération du fichier .jar
	pour générer le fichier.jar on se place dans le dossier classes et tape la commande suivante: 
		jar cvf ../battles.jar battleship
	
	por consulter on se place dans la racine et on fait:
		jar tvf battles.jar


	5-executer le programme
	-avec le fihier jar 
	on se place dans temp et si on veux executer le fichier DateMain à l'aide du jar on fait :
	NB:cette commade ne marche pas
		java -cp battles.jar battleship.battleMain
	
	
	-sans le fichier .jar on se place dans la racine du tp est on fait
		java -cp  classes/ battleship.battleMain



