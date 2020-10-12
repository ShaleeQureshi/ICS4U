/*
* Date: October 6, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains various services for the GymBot
*
* Constructor List:
* 1. GymBot(City city, int street, int avenue, Direction direction)
*
* Method List: 
* 1. void move() = This method causes the GymBot to move 1 intersection forward and spin
* 2. void shortJump() = This method allows the GymBot to jump over 1 intersection
* 3. void highJump() = This method allows the GymBot to jump over 4 intersections
*
* Dependences:
* 1. becker.jar
*/

// Import Statements
import becker.robots.*;
import java.awt.*;

public class GymBot extends RobotSE {

    // Constructor
    public GymBot(City city, int street, int avenue, Direction direction) {
        super(city, street, avenue, direction);
        this.setColor(Color.BLUE); // Altering the color of this GymBot
    } // Constructor

    // Services

    // This method overrides the superclass move method
    // This method causes the GymBot to move 1 intersection forward and spin
    public void move() {
        super.move(); // Calling superclass move method to avoid stackoverflow error
        this.turnRight();
        this.turnRight();
        this.turnRight();
        this.turnRight();
    } // move Method

    // This method allows the GymBot to jump over 1 intersection
    public void shortJump() {
        this.turnLeft();
        super.move(); // Calling superclass move method to avoid the spin with this class move method
        this.turnRight();
        super.move();
        this.turnRight();
        super.move();
        this.turnLeft();
    } // shortJump Method

    // This method allows the GymBot to jump over 4 intersections
    public void highJump() {
        this.turnAround();
        super.move(); // Calling superclass move method to avoid the spin with this class move method
        super.move();
        this.turnAround();
        super.move();
        super.move();
        this.turnLeft();
        super.move();
        this.turnRight();
        super.move();
        super.move();
        super.move();
        super.move();
        this.turnRight();
        super.move();
        this.turnLeft();
        this.move(); // Calling this class move method as we want to spin
    } // highJump Method

}// end of class