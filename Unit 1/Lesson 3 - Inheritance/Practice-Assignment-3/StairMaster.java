/*
* Date: September 29, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class extends the Robot class to allow a robot to climb stairs
*
* Method List: 
* 1. void turnRight(Robot robot) = This method allows the Robot to turn right
* 2. void stepUp() = This method allows the Robot to move up a step
* 3. void stepDown() = This method allows for the Robot to move down a step
*
* Constructor List:
* 1. StairMaster(City city, int street, int avenue, Direction direction)
*/

// Import Statements
import becker.robots.*;

public class StairMaster extends Robot {

    // Constructor
    public StairMaster(City city, int street, int avenue, Direction direction) {
        super(city, street, avenue, direction);
    } // Constructor

    // This method allows the Robot to turn right
    private void turnRight(Robot robot) {
        robot.turnLeft();
        robot.turnLeft();
        robot.turnLeft();
    } // turnRight Method

    // This method allows the Robot to move up a step
    public void stepUp() {
        this.turnLeft();
        this.move();
        this.turnRight(this);
        this.move();
    } // stepUp Method

    // This method allows for the Robot to move down a step
    public void stepDown() {
        this.move();
        this.turnRight(this);
        this.move();
        this.turnLeft();
    } // stepDown Method

} // StairMaster Class
