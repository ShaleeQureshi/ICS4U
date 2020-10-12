/*
* Date: October 9, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This contains the services for the MazeWalker question (#1)
*
* Constructor List:
* 1. MazeWalker(MazeCity city, int street, int avenue, Direction direction)
*
* Method List: 
* 1. void followRightWall() = As long as the MazeWalker cannot pick up a Thing it will try to find its way around the maze
* 2. void changeDirection(Direction currentDirection) = This method changes the direction that the robot is in
*
* Dependences:
* 1. becker.jar
*/

// Import Statements
import becker.robots.*;

public class MazeWalker extends RobotSE {

    // Constructor
    public MazeWalker(MazeCity city, int street, int avenue, Direction direction) {
        super(city, street, avenue, direction);
    } // Constructor

    // Services

    // This method causes the MazeWalker to continue pathing until it can pick up a
    // thing (reaches end of maze)
    public void followRightWall() {

        // As long as the MazeWalker cannot pick up a Thing it will try to find its way
        // around the maze
        // (If it can pick up a Thing it means it has reached the end of the maze)
        while (!this.canPickThing()) {
            // If the front of the MazeWalker is clear the following will occur
            if (this.frontIsClear()) {
                this.move(); // Moving it forward 1 intersection
                this.turnRight(); // Turning it right
            }
            // If the front of the robot is not clear then the following will occur
            else {
                this.changeDirection(this.getDirection()); // Calling changeDirection Method (passing in the current
                                                           // direction)
            }
        } // while loop

    } // followRightWall Class

    // This method changes the direction that the robot is in
    private void changeDirection(Direction currentDirection) {

        // If the robot's current direction is NORTH then the following will occur
        if (currentDirection == Direction.NORTH) {
            this.turnLeft();
        }
        // If the robot's current direction is SOUTH then the following will occur
        else if (currentDirection == Direction.SOUTH) {
            this.turnLeft();
        }
        // If the robot's current direction is WEST then the following will occur
        else if (currentDirection == Direction.WEST) {
            this.turnLeft();
        }
        // If the robot's current direction is EAST then the following will occur
        else {
            this.turnLeft();
        }

    } // changeDirection Method

}// MazeWalker Class