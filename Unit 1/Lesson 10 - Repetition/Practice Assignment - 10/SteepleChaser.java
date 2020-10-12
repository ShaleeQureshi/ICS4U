/*
* Date: October 9, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This contains the services for the SteepleChaser question (#2)
*
* Constructor List:
* 1. SteepleChaser(MazeCity city, int street, int avenue, Direction direction)
*
* Method List: 
* 1. void runRace() = This method runs the race until the finish line is crossed (flasher)
* 2. void raceStride() = This method moves the SteepleChaser one intersection forward, jumping over any barrier to do so
* 3. void jumpBarrier() = This method jumps a barrer of any height
*
* Dependences:
* 1. becker.jar
*/

// Import Statements
import becker.robots.*;

public class SteepleChaser extends RobotSE {

    // Constructor
    public SteepleChaser(City city, int street, int avenue, Direction direction) {
        super(city, street, avenue, direction);
    } // Constructor

    // Services

    // This method runs the race until the finish line is crossed (flasher)
    public void runRace() {

        this.raceStride();

    } // runRace Method

    // This method moves the SteepleChaser one intersection forward, jumping over
    // any barrier to do so
    private void raceStride() {

        if (!(this.getAvenue() == 12 && this.getStreet() == 5)) {
            if (this.frontIsClear()) {
                this.move();
                this.turnRight();
                this.runRace();
            } else {
                this.jumpBarrier();
                this.runRace();
            }
        }

    } // raceStride Method

    // This method jumps a barrer of any height
    private void jumpBarrier() {

        if (!(this.getAvenue() == 12 && this.getStreet() == 5)) {
            this.turnLeft();
            if (this.frontIsClear()) {
                this.move();
                this.turnRight();
                this.raceStride();
            } else {
                this.jumpBarrier();
            }
        }
    } // jumpBarrier Method

}
// SteepleChaser Class
