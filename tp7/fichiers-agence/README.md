Author: *Diakité aboubakar siriki et avave itir*
-------------------------------------------------

PROJECT: *TP7 Rental Agency*
----------------------------

*Présentation et Objectif du TP*
--------------------------------

Ce TP avait pour objectif de géerer une agence de location de vehicules avec certains contrainte imposés aux Clients,un client n'est pas en capacitéde louer deux vehicule à la fois,deux client ne peuvent pas louer le mêmevehicule.Ensuite l'agence de location dispose en son seins plusieurs typedevehicule.Ces contraites nous a permis de voir les notions étudier comme l'interface et surtout l'héritage.

*Generation de la documentation*
--------------------------------

Pour générer la documentation du *pakage rental*,on se place dans le dossier *src* avec l'existance d'un dossier *docs* et on fait:
													         
		javadoc rental -d ../docs	

Pour le faire avec le Makefile on se place dans la racine du projet et on fait:
	   
		make doc
		
*Consultation de la documentation*
----------------------------------

Pour consulter la documentation ce placer dans le dossier docs et ouvrir le fichier index.html dans le navigateur.


*Compiler les tests*
--------------------
Ce placer dans la racine du projet avec l'existance du dossier classes

		javac -d classes/ -cp test-1.7.jar:class -sourcepath src:test test/rental/*.java


Pour le faire avec le Makefile on se place dans la racine du projet et on fait:
		make compilerTest

*Exécuter les test*
------------------

Ce placer dans la racine du projet avec l'existance du dossier classes et après avoir Compiler les tests.

		java -jar test-1.7.jar -cp test-1.7.jar:classes rental.NomClassTest


Pour le faire avec le Makefile on se place dans la racine du projet et on fait:

		make NomClassTest

*NB* Avec NomClassTest:
	
	*RentalAgencyTest*
	*BrandFilterTest*
	*ClientTest*
	*MaxPriceFilterTest*
	*VehicleTest*

*Générer le fichier .jar*
-------------------------
Pour générer le fichier.jar on se place dans le dossier classes et tape la commande suivante:

		jar cvf ../executable.jar rental
		jar cvf ../executableVoiture.jar rental		

Pour le faire avec le Makefile on se place dans la racine du projet et on fait:
		make genereJar

		

*Consulter le fichier jar*
--------------------------
le faire avec le Makefile on se place dans la racine du projet et on fait:
	
		jar tvf executable.jar
		jar tvf executableVoiture.jar


*Creation du fichier manifest*
------------------------
Pour générer le fichier manifest on se place dans le repertoire classes  on suppossant l'existance des deux fichiers manifest d'abord et on fait:

		jar cvfm ../executable.jar ../manifest-ex rental/
		jar cvfm ../executable.jar ../manifest-ex rental/


Pour le faire avec le Makefile on se place dans la racine du projet et on fait:
		make manifest
		
*Execution du programme*
------------------------
Pour exécuter le programme sans le fichier jar on fait la commande suivante après avoir compiler bien-sûr le programme sinon error donc si vous n'avez pas encore compiler alors faites le maintenant.

Pour compiler le Main qui se trouve dans le repertoire src/rental on se place dans la racine du projet on fait :

		java -cp classes/ rental.Main 

Pour compiler le MainVoiture qui se trouve dans le repertoire src/rental on on se place dans la racine du projet on fait :

		java -cp classes/ rental.MainVoiture

 
Pour le faire avec le Makefile on se place dans la racine du projet et on fait:

		make Main
		make MainVoiture


Avec les fichier jar rien de plus simple on fait juste on se place dans la racine du projet et on fait:

		java -jar executable.jar
		java -jar executableVoiture.jar

Pour le faire avec le Makefile on se place dans la racine du projet et on fait:

		make MainWithJar
		make MainVoitureWhithJar		



*NB* En fesant la commande suivante vous compiler tout le programme avec les tests,la creation du manifest,du fichier jar:
		
		make all

*NB* et pour efface les dossier pas necessaire on fait:

		make clean
		










