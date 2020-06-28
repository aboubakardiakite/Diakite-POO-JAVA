package battleship;
public class Cell{
  private boolean washited;
  private Ship ship;

  public  Cell(){
    this.washited=false;
    this.ship=null;
  }
  /**
  *returns wether the cell was attcked before or not
  *@return boolean
  */
  public boolean isHitedBefore(){
    return this.washited;
  }
  /**
  *allow to user to attack this cell
  *@return Answer
  */
  public Answer hit(){
    if (!this.washited && this.ship!=null){
      this.washited=true;
      return this.ship.hit();
    }else{
      return Answer.MISSED;
    }
  }
  /**
  *place the ship into the Cell
  *@param ship Ship :the ship to be placed
  */
  public void setShip(Ship ship){
    this.ship=ship;
  }
  /**
  *returns the Ship in the cell if exists
  *@return Ship if cell contains a ship ,null otherwise
  */
  public Ship getShip(){
    return this.ship;
  }
  /**
   * returns a string representation of the cell
   * @param defender boolean
   * @return String
   */
  public String getCharacter(boolean defender){
    if(defender)
    {
      if (this.getShip()==null){
        return "~";
      }
      else if(!this.getShip().washited()){
        return "B";
      }
      return "*";
    }
    else{
      if(!this.isHitedBefore()){
        return ".";
      }
      else if (this.getShip()!=null && this.getShip().washited()){
        return "*";
      }
      return "~";
    }
  }

}
