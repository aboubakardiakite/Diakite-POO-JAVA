package battleship;
import battleship.util.*;
import io.*;
import java.util.*;
public class Game{
    private Sea plateau;
    public Game(Sea plateau){
        this.plateau = plateau;
    }
    public Answer shoot(){
        while (plateau.getLifePoints()>0){
            int line;
            int colomne;
            try{
		plateau.display(true);
                System.out.print("Veuillez entre le nombre pour x: ");
                line = Input.readInt();
                System.out.print(" Veuillez entrer le nombbre pour y : ");
                colomne = Input.readInt();
                Position pos = new Position(colomne,line);
                Cell cell = this.plateau.getCellPosition(pos);
                Answer anserwing =cell.hit();
                plateau.display(true);
                System.out.println(anserwing);
            }
            catch (Exception e) {
                System.out.println("Il est probabble que vous ayez taper une mauvaise données ");
                return this.shoot();
        }
    }
    return Answer.MISSED;
}
}
