/*
* Date: October 7, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class creates the ThreadMain Object and a new Runnable Thread
*
* Constructor List:
* 1. ThreadMain(City city, int street, int avenue, Direction direction)
*
* Method List: 
* 1. void run() = This method initializes the thread
* 2. void movement() = This method performs the movement for the various robots
*
* Dependences:
* 1. becker.jar
*/

// Import Statements
import becker.robots.*;

public class ThreadMain extends RobotSE implements Runnable {

    // Constructor
    public ThreadMain(City city, int street, int avenue, Direction direction) {
        super(city, street, avenue, direction);
    } // Constructor

    // This method initializes the thread
    @Override
    public void run() {
        this.movement();
    } // run Method

    // This method performs the movement for the various robots
    private void movement() {

        this.move();
        this.move();
        this.turnAround();
        this.turnLeft();
        this.turnRight();
        this.move();
        this.setSpeed(this.getSpeed() * 100);
        this.move();
        this.turnAround();
        this.move();
        this.move();
        this.setSpeed(this.getSpeed() / 100);

    } // movement Method

} // ThreadMain Class
