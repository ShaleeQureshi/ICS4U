/*
* Date: September 29, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: Extends the Robot class to create a TrailBot object
*
* Method List: 
* 1. void trailMove() = This method leaves an object on the current intersection and moves forward to the next intersection
* 2. void threeTurn() = This method turns the robot left 3 times
*
* Constructor List:
* 1. TrailBot(City city, int street, int avenue, Direction direction)
*/

// Import Statements
import becker.robots.*;

public class TrailBot extends Robot {

    // Constructor
    public TrailBot(City city, int street, int avenue, Direction direction) {
        super(city, street, avenue, direction, 100);
    } // Constructor

    // This method leaves an object on the current intersection and moves forward to
    // the next intersection
    public void trailMove() {
        this.putThing(); // Dropping the object
        this.move(); // Moving the robot forward 1 intersection
    } // trailMove Method

    // This method turns the robot left 3 times
    public void threeTurn() {
        this.turnLeft();
        this.turnLeft();
        this.turnLeft();
    } // threeTurn Method

} // TrailBot Class