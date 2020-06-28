Autor: Diakite aboubakar siriki

1-Presentation du TP et ses objectifs

Ce TP avait pour but d'apprendre à écrit une classe , a documenter les instances de cette classe et à tester les instances de cette classe avec des tests qui était déja fournir dont on devais étudie et savoir son fonctionnement.L'objectif principal de ce TP était de coder deux classes Bike et BikeStation qui était respectivement une classe qui permertais de la creation des velo et l'autre la creation des station pour velo

2-Géneration et consultation de la documentation

Ouvrir le shell et ce rendre dans le fichier contenant les fichier dont ont veux generer la documentation et fait la commande suivante:

$ javadoc BikeStation.java Bike.java -d docs  


3-Compiler les classe

Ouvrir le shell et ce rendre dans le repertoire contenant les fichiers .java et fait la commande suivante pour generer les fichiers .class:

$ javac nomDuFichier.java
nomDuFichier est: Bike, BikeStation, BikeStationMain


4-Compilation et exécution des tests
Ouvrir le shell et ce rendre dans le repertoire contenant les fichiers .java et faire les commande suivante:
  
  a-tester le fichier Bike.java
	javac -classph test-1.7.jar test/BikeTest.java
	javac -jar test-1.7.jar BikeTest

  a-tester le fichier BikeStation.java
        javac -classph test-1.7.jar test/BikeStationTest.java
        javac -jar test-1.7.jar BikeStationTest

5-Execution du programme

 a-creation du fichier .class
	javac fichiersMain.java

 b-Executrer les programmes mains
	java fichiersMain

exemple:
	$ javac BikeMain.java
        $ java BikeMain	



