/*
* Date: October 9, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class runs the entire program
*
* Constructor List:
* 1. PlanterRobot(City city, int street, int avenue, Direction direction)
*
* Method List: 
* 1. void plantField(int rows) = This method plants user defined number of rows
* 2. void plantOneRow() = This method plants 1 row
* 3. void plant() = This method plants a thing object in an intersection if it can
* 4. void changeDirection() = This method gets the current direction and performs an action based on it
*
* Dependences:
* 1. becker.jar
*/

// Import Statements
import becker.robots.*;

public class PlanterRobot extends RobotSE {

    // Constructor
    public PlanterRobot(City city, int street, int avenue, Direction direction) {
        super(city, street, avenue, direction, 100);
    } // Constructor

    // Services

    // This method plants user defined number of rows
    public void plantField(int rows) {

        this.move(); // Moving it into position

        // For loop to iterate rows number of times
        for (int i = 0; i < rows; i++) {
            this.plantOneRow();
            this.changeDirection();
        } // for loop

    } // plantField Method

    // This method plants 1 row
    private void plantOneRow() {

        // For loop to repeat the steps i times
        for (int i = 0; i < 4; i++) {
            this.plant();
            this.move();
        } // for loop
        this.plant();

    } // plantOneRow Method

    // This method plants a thing object in an intersection if it can
    private void plant() {

        // If the intersection is empty it will plant
        if (!this.canPickThing()) {
            this.putThing();
        }

    } // plant Method

    // This method gets the current direction and performs an action based on it
    private void changeDirection() {

        // If the robot's current direction is west then the following will occur
        if (this.getDirection() == Direction.WEST) {
            this.turnLeft();
            this.move();
            this.turnLeft();
        }
        // If it is not facing west then it is facing east
        else {
            this.turnRight();
            this.move();
            this.turnRight();
        }

    } // changeDirection Method

} // PlanterRobot Class
