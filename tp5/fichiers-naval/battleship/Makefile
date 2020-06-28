battleship: 
	@cd src && javac battleship/*.java -d ../classes/
battleship.util:
	@cd src && javac battleship/util/*.java -d ../classes/


doc:
	@cd src && javadoc battleship battleship.util -d ../docs

battleMain:
	@java -cp  classes/ battleship.battleMain

main: battleship
	@java -classpath classes battleship.battlemain


jarGame: battleship
	@touch manifest-ex
	@echo "Main-Class: battleship.main" > manifest-ex
	@cd classes; jar cvf ../appliBattleShip.jar battleship io; cd ..
	@cd classes; jar cvfm ../appliBattleShip.jar ../manifest-ex battleship io; cd ..


jar:
	@cd classes && jar cvf ../battles.jar battleship
	@cp battles.jar tmp/
	@cd tmp && jar xvf battles.jar

battleJar:
	@cd tmp && java -cp battles.jar battleship.battleMain

ExecGame:
	@java -jar appliBattleShip.jar


manifest:
	@cd classes && jar cvfm ../battles.jar ../manifest-ex


clean:
	@rm -rf classes/battleship/ classes/io/
	@rm -f test/*.class appli*
	@rm -rf docs
	@clear
        
