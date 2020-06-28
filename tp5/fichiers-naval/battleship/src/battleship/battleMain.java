package battleship;
import battleship.util.*;
public class battleMain{
    public static void main(String[] args){
        Sea board=new Sea(10,10);
        Ship[] ships=new Ship[3];
        for (int i=0;i<3;i++){
            ships[i]=new Ship(3,2);
        }
        Position pos_1=new Position(0,0);
        board.addShipVertically(ships[0], pos_1);
        Position pos_2=new Position(0,2);
        board.addShipHorizontally(ships[1], pos_2);
        Position pos_3=new Position(3,6);
        board.addShipVertically(ships[2], pos_3);
        Game game=new Game(board);
        game.shoot();
    }
}
