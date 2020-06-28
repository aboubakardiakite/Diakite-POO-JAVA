package example;
import example.util.Box;
import example.util.*;
import java.lang.String;

/**
 * A robot can carry one box at a time and put it on a coveyer belt
 * 
 * @author Diakite aboubakar siriki
 * @version 1.0
 *
 */

public class Robot {
    /**
     * creates a robot
     */
    public Robot() {
	this.carriedBox = null;
    }

    // les attributs de la classe Robot
    /** the box carried by robot  */
    private Box carriedBox;

    // les methodes de la classe Robot
    /**
     * this robot takes a box if it was not allready carrying one, else nothing happens	 
     * @param box the carried box
     */
    public void take(Box box) {
	if (!this.carryBox()) { // already carrying a box ?
	    this.carriedBox = box;
	}	
    }

    /**
     * this robot puts the carried box on the belt
     * 
     * @param belt the belt on which box is put
     * @return a String depending on the result... 
     *    (this is bad: should throw an exception for the last three cases, and then no return value would be necessary)
     *   <dl>
     *     <dt>"ok"</dt><dd>if box has been succesfully put</dd>
     *     <dt>"no box"</dt><dd>if no box carried</dd>     
     *     <dt>"belt full"</dt><dd>if belts was full</dd>     
     *     <dt>"box too heavy"</dt><dd>if box is to heavy for belt</dd>     
     *   </dl>
     */
    public String putOn(ConveyerBelt belt) {
	if (this.carryBox() && belt.accept(carriedBox) && !belt.isFull()) {
	    // put box on belt
	    belt.receive(carriedBox);
	    // no more box is carried
	    this.carriedBox = null;
	    return "ok";
	} else {
	    if (!this.carryBox()) {
		return "no box";
	    } else if (belt.isFull()) {
		return "belt full";
	    } else {
		return "box too heavy";
	    }
	}
    }

    /**
     * returns <code>true</code> iff this robot is carrying a box
     * 
     * @return <code>true</code> iff this robot is carrying a box
     */
    public boolean carryBox() {
	return this.carriedBox != null;
    }
    
    /** returns the carried box
     * @return the carried box
     */
    public Box getCarriedBox() {
        return this.carriedBox;
    }


       public static void main(String[] args) {

        System.out.println("beginning of main from robot.Robot");

        Robot robbie = new Robot();
        ConveyerBelt belt1 = new ConveyerBelt(50);
        ConveyerBelt belt2 = new ConveyerBelt(150);
        Box box10 = new Box(10);
        Box box15 = new Box(15);
        Box box100 = new Box(100);
        Box box60 = new Box(60);

        robbie.take(box10);
        robbie.putOn(belt1);
        robbie.take(box15);
        robbie.putOn(belt1);
        robbie.take(box100);
        robbie.putOn(belt2);

        belt1.display();

        System.out.println("end of main from robot.Robot");
    }

}
