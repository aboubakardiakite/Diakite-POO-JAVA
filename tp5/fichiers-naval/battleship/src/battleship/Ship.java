package battleship;

public class Ship{

  private int length;
  private int lifePoints;
  private boolean wasHited;

  public  Ship(int lifepoints,int length){
    this.lifePoints=lifepoints;
    this.length=length;
  }
  /**
  *returns the current ship lifePoints
  *@return an  integer presenting the lifepoints of the ships
  */
  public int getLifePoints(){
    return this.lifePoints;
  }
  /**
  *returns the length of the Ship
  *@return  an int representing the length
  */
  public int getLength(){
    return this.length;
  }
  /**
  *decressing the lifePoints of the sip when hited
  */
  public boolean washited(){
    return this.wasHited;
  }
  private void decreaseLifePoints(){
    this.lifePoints--;
    this.wasHited=true;
  }

  /**
  *returns wether the ship is sunk or another
  *@return true or False depen
  */
  public boolean hasBeenSunk(){
    return this.lifePoints==0;
  }
  /**
  *allow to user to attack this ship
  *@return Answer of the attack or not
  */
  public Answer hit(){
    if (this.hasBeenSunk()){
      return Answer.MISSED;
    }
    this.decreaseLifePoints();
    if(this.hasBeenSunk()){
      return Answer.SUNK;
    }
    return Answer.HIT;
  }
}
