
doc:
	@cd src && javadoc pfc pfc.strategy io -d ../docs/

compiler:
	@cd src && javac pfc/*.java io/*.java -d ../classes/

compileTest:
	@javac -cp test-1.7.jar test/GameTest.java test/PlayerTest.java

executeGameTest:
	@java -jar test-1.7.jar GameTest

executePlayerTest:
	@java -jar test-1.7.jar PlayerTest

genereJar:
	@cd classes && jar cvf ../executable.jar pfc io
	@cp executable.jar tmp/
	@cd tmp && jar xvf executable.jar

consulteJar:
	@jar tvf executable.jar

manifest:
	@cd classes && jar cvfm ../executable.jar ../manifest-ex pfc/ io/;clear

exeMain:
	@java -cp  classes/ pfc.Main

jarGame: compiler
	@touch manifest-ex
	@echo "Main-Class: pfc.Main"> manifest-ex
	@cd classes; jar cvf ../executable.jar pfc io
	@jar cvfm ../executable.jar ../manifest-ex pfc io;cd ..

exeWithJar: manifest
	@java -jar executable.jar


