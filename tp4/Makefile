example: 
	@cd src && javac example/*.java -d ../classes/
example.util:
	@cd src && javac example/util/*.java -d ../classes/

date:
	@cd src && javac date/*.java -d ../classes/

date.util:
	@cd src && javac date/util/*.java -d ../classes/

doc:
	@cd src && javadoc example date example.util date.util -d ../docs	
RobotMain:
	@java -cp classes example.Robot

DateMain:
	@java -cp classes date.DateMain

jar:
	@cd classes && jar cvf ../appli.jar example date
	@cp appli.jar tmp/
	@cd tmp && jar xvf appli.jar

RobotJar:
	@cd tmp && java -cp appli.jar example.Robot

DateJar:
	@cd tmp && java -cp appli.jar date.DateMain

manifest:
	@cd classes && jar cvfm ../appli.jar ../manifest-ex
