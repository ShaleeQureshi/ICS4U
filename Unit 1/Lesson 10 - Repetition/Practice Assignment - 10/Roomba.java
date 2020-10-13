/*
* Date: October 9, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This contains the services for the Roomba Robot question (#3)
*
* Constructor List:
* 1. Roomba(City city, int street, int avenue, Direction direction)
*
* Method List: 
* 1. void cleanUp() = This method cleans the room
* 2. Boolean reachedWall() = This method determines if the robot has reached the wall
* 3. void cleanThisRow() = This method cleans the current row
* 4. void continueToNext() = This method moves to the next row
* 5. void comeHome() = This method returns the robot to its initial location (0, 0)
*
* Dependences:
* 1. becker.jar
*/

// Import Statements
import becker.robots.*;

public class Roomba extends RobotSE {

    // Constructor
    public Roomba(City city, int street, int avenue, Direction direction) {
        super(city, street, avenue, direction);
    } // Constructor

    // Services

    // This method cleans the room
    public void cleanUp() {

        this.cleanThisRow();

        while (!this.reachedWall()) {
            this.continueToNext();
            this.cleanThisRow();
        } // while loop

        this.comeHome(); // Returning to the starting position

    } // cleanUp Method

    // This method determines if the robot has reached the wall
    private Boolean reachedWall() {

        if (this.getDirection() == Direction.WEST) {
            this.turnLeft();
            return !this.frontIsClear();
        } else {
            this.turnRight();
            return !this.frontIsClear();
        }
    } // reachedWall Method

    // This method cleans the current row
    private void cleanThisRow() {

        this.pickAllThings(); // Picking up things

        // While the front is clear the following will occur
        while (this.frontIsClear()) {
            this.move();
            this.pickAllThings();
        } // while loop

    } // cleanThisRow Method

    // This method moves to the next row
    private void continueToNext() {

        this.move();
        this.turnLeft();
        if (!this.frontIsClear()) {
            this.turnAround();
        }

    } // continueToNext Method

    // This method returns the robot to its initial location (0, 0)
    private void comeHome() {

        this.turnAround();
        while (this.frontIsClear()) {
            this.move();
        }
        this.turnLeft();
        while (this.frontIsClear()) {
            this.move();
        }
        this.turnAround();

    } // comeHome Method

} // Roomba Class