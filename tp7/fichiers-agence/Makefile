doc:
	@cd src && javadoc rental -d ../docs;clear

compiler: 
	@cd src && javac rental/*.java -d ../classes/;clear

all: doc compileTest manifest compileTest
	@rm -rf rental

compileTest:
	@javac -d classes/ -cp test-1.7.jar:class -sourcepath src:test test/rental/*.java

RentalAgencyTest: compileTest
	@java -jar test-1.7.jar -cp test-1.7.jar:classes rental.RentalAgencyTest

BrandFilterTest: compileTest
	@java -jar test-1.7.jar -cp test-1.7.jar:classes rental.BrandFilterTest

ClientTest: compileTest
	@java -jar test-1.7.jar -cp test-1.7.jar:classes rental.ClientTest

MaxPriceFilterTest: compileTest
	@java -jar test-1.7.jar -cp test-1.7.jar:classes rental.MaxPriceFilterTest

VehicleTest: compileTest
	@java -jar test-1.7.jar -cp test-1.7.jar:classes rental.VehicleTest

genereJar:
	@cd classes && jar cvf ../executable.jar rental
	@cd classes && jar cvf ../executableVoiture.jar rental
	@rm -rf tmp && mkdir tmp/
	@cp executable.jar tmp/
	@cp executableVoiture.jar tmp/
	@cd tmp && jar xvf executable.jar 
	@jar xvf executableVoiture.jar
 	

consulterJar:
	@jar tvf executable.jar
	@jar tvf executableVoiture.jar


creeManifest:genereJar
	@touch manifest-ex
	@touch manifest1-ex
	@echo "Main-Class: rental.Main">manifest-ex
	@echo "Main-Class: rental.MainVoiture">manifest1-ex

manifest:creeManifest compiler
	@cd classes && jar cvfm ../executable.jar ../manifest-ex rental/
	@cd classes && jar cvfm ../executableVoiture.jar ../manifest1-ex rental;clear

Main:compiler
	@java -cp classes/ rental.Main


MainVoiture:compiler
	@java -cp classes/ rental.MainVoiture

MainWithJar:
	@java -jar executable.jar

MainVoitureWithJar:
	@java -jar executableVoiture.jar


clean:
	@rm -f manifest-ex
	@rm -f manifest1-ex
	@rm -f executable.jar executableVoiture.jar
	@rm -rf classes docs tmp META-INF rental	

