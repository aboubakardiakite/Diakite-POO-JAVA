package battleship;
import battleship.util.*;
import java.util.*;
public class Sea{


  private Cell[][] board;
  private final int width;
  private final int height;
  private int lifePoints;



  public  Sea(int width ,int height){
    this.width=width;
    this.height=height;   
    this.board=new Cell[width][height];
    for (int i=0;i<width;i++){
      for (int j=0;j<height;j++){
        this.board[i][j]=new Cell();
      }
    }
  }

  /**
  *returns the Cell at position p
  *@param p Position :position of the Cell
  *@return Cell
  */
  public Cell getCellPosition(Position p){
    return this.board[p.getY()][p.getX()];
  }
  /**
  *allow to the user to attack the Cell at position p and returns the Answer of this attack
  *@param p Position :the position of the cell to be attacked
  *@return Answer
  *@throws ArrayIndexOutOfBoundsException if the position p is invalid
  */
  public Answer shoot(Position p) throws ArrayIndexOutOfBoundsException{
    try{
      Cell cell=this.getCellPosition(p);
      Answer ans= cell.hit();
      if (ans!=Answer.MISSED){
        this.lifePoints--;
      }
      return ans;
    }catch(Exception e){
      throw new ArrayIndexOutOfBoundsException("invalid coordinate");
    }
  }
  /**
   * returns the total life points of ships in the sea
   * @return int
   */
  public int getLifePoints(){
    return this.lifePoints;
  }
    /**
    *place the ship vertically in playing area starting from position p
    *@param ship Ship :ship want to place in the game
    *@param p Position :position where to place the ship
    * @throws IllegalStateException if the ship b can not be placed on the sea
    *(outside of the board or some cell is not empty)
    */
    public void addShipVertically(Ship ship,Position p)throws IllegalStateException{
      if ((p.getX()>this.width||p.getY()>this.height)||(p.getY()+ship.getLength()>this.height)){
        throw new IllegalStateException("can't place this ship at this position");
      }
      else{
        int length=ship.getLength();
        this.lifePoints+=ship.getLifePoints();
        for(int i=p.getY();length-->0;i++){
          Position p1=new Position(p.getX(),i);
          if (this.getCellPosition(p1).getShip()!=null)throw new IllegalStateException("can't place this ship at this position");
          else{
            this.getCellPosition(p1).setShip(ship);
          }
        }
        }
      }
    /**
    *place the ship horizontally in playing area starting from position p
    *@param ship Ship :ship want to place in the game
    *@param p Position :position where to place the ship
    * @throws IllegalStateException if the ship b can not be placed on the sea
    *(outside of the board or some cell is not empty)
    */
    public void addShipHorizontally(Ship ship ,Position p) throws IllegalStateException{
      if ((p.getX()>this.width||p.getY()>this.height)||(p.getX()+ship.getLength()>this.height)){
        throw new IllegalStateException("can't place this ship at this position");
      }
      else{
        this.lifePoints+=ship.getLifePoints();
        int length=ship.getLength();
        for(int i=p.getX();length-->0;i++){
          Position p1=new Position(i,p.getY());
          if (this.getCellPosition(p1).getShip()!=null)throw new IllegalStateException("can't place this ship at this position");
          else{
            this.getCellPosition(p1).setShip(ship);
          }
        }
        }
    }
    /** displays the board line by line and cell by cell,
    *the display changes for the defender or the opponent, defined
    *by the <code>defender</code> argument* @param defender <code>true</code> if display is for defender,
    * <code>false</code> if for opponent
    */
    public void display(boolean defender){
      for (int i=0;i<this.height;i++){
        for (int j=0;j<this.width;j++){
          System.out.print(this.board[i][j].getCharacter(defender));
        }
        System.out.print("\n");
      }
    }
  }
