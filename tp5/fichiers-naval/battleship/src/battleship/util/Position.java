package battleship.util;

public class Position{

    private final  int x;
    private  final int y;

    public Position(int x, int y){
        this.x= x;
        this.y = y;

    }
    /**
      *returns the X-coordinate of this position
      *@return int
      */
    public int getX(){
        return this.x;
    }
    /**
  *returns the Y-coordinate of this position
  *@return int
  */
    public int getY(){
        return this.y;
    }
    /**
      *returns wether the this position is equal to another
      *@param o  object
      *@return boolean
      */
    public boolean equals (Object o){
        if (! (o instanceof Position)) return false ;
        Position other  = (Position) o;
        return this.getX() == other.getX() && this.getY() == other.getX();
    }

    /**
      *return a string representation of this position
      *@return String
      */
    public String toString(){
        return "("+this.getX()+","+this.getY()+")";
    }
}
