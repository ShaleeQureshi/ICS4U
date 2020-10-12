/*
* Date: October 7, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class has the services to create the bowling alley
*
* Constructor List:
* 1. PinSetter(City city, int street, int avenue, Direction direction) 
*
* Method List: 
* 1. void setPins() = This is the only method that is called from other classes and it sets up the bowling alley by calling other services
* 2. void bottomDiagonal(int col) = This method creates the bottom diagonal portion of the bowling alley
* 3. void putInRow(int col) = This method puts the objects in the final row
* 4. void topDiagonal(int col) = This method puts the objects in the top diagonal row
* 5. void lastPin() = This method puts the remainder object in its position
* 6. void returnToStart() = This method returns the robot to the starting position
*
* Dependences:
* 1. becker.jar
*/

// Import Statements
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

public class PinSetter extends RobotSE {

    // Constructor
    public PinSetter(City city, int street, int avenue, Direction direction) {
        super(city, street, avenue, direction, 10); // super
    } // Constructor

    // This is the only method that is called from other classes and it sets up the
    // bowling alley by calling other services
    public void setPins() {
        int col = 3; // Defining a constant value for each service
        // Calling various services from super/sub class to setup the bowling alley
        this.move();
        this.move();
        this.putThing();
        this.bottomDiagonal(col);
        this.turnLeft();
        this.putInRow(col);
        this.turnLeft();
        this.topDiagonal(col);
        this.lastPin();
        this.returnToStart();
    } // setPins Method

    // This method creates the bottom diagonal portion of the bowling alley
    private void bottomDiagonal(int col) {
        // Loop to prevent code repitition
        for (int i = 0; i < col; i++) {
            this.turnRight();
            this.move();
            this.turnLeft();
            this.move();
            this.putThing();
        } // for loop

    } // bottomDiagonal Method

    // This method puts the objects in the final row
    private void putInRow(int col) {
        // Loop to prevent code repitition
        for (int i = 0; i < col; i++) {
            this.move();
            this.move();
            this.putThing();
        } // for loop

    } // putInRow Method

    // This method puts the objects in the top diagonal row
    private void topDiagonal(int col) {
        // Loop to prevent code repitition
        for (int i = 0; i < col - 2; i++) {
            this.move();
            this.turnLeft();
            this.move();
            this.putThing();
            this.putInRow(1);
            this.turnAround();
            this.move();
            this.move();
        } // for loop

    } // topDiagonal Method

    // This method puts the remainder object in its position
    private void lastPin() {
        this.turnLeft();
        this.move();
        this.turnLeft();
        this.move();
        this.putThing();
    } // lastPin Method

    // This method returns the robot to the starting position
    private void returnToStart() {
        this.turnRight();
        this.move();
        this.move();
        this.move();
        this.turnLeft();
        this.move();
        this.turnLeft();
    } // returnToStart Method

} // PinSetter Class
