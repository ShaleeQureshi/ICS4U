import becker.robots.Robot;

/*
* Date: September 29, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class extends the Robot class to allow a robot to play soccer
*
* Method List: 
* 1. void turnRight(Robot robot) = This method allows the Robot to turn right
* 2. void advance() = This method moves the player forward 1 intersection
* 3. void advanceLeft() = This method moves the player diagonally to the left 1 intersection
* 4. void advanceRight() = This method moves the player digaonally to the right one intersection
* 5. void advance(int distance) = This method allows the player to move forward a specific amount of intersections
* 6. void advanceLeft(int distance) = This method allows the player to move diagonally left a specific amount of intersections
* 7. void advanceRight(int distance) = This method allows the player to move diagonally right a specific amount of intersections
*
* Constructor List:
* 1. SoccerPlayer(City city, int street, int avenue, Direction direction)
*/

// Import Statements
import becker.robots.*;

public class SoccerPlayer extends Robot {

    // Constructor
    public SoccerPlayer(City city, int street, int avenue, Direction direction) {
        super(city, street, avenue, direction);
    } // Constructor

    // This method allows the Robot to turn right
    private void turnRight(Robot robot) {
        robot.turnLeft();
        robot.turnLeft();
        robot.turnLeft();
    } // turnRight Method

    // This method moves the player forward 1 intersection
    public void advance() {
        this.pickThing();
        this.move();
        this.putThing();
    } // advance Method

    // This method moves the player diagonally to the left 1 intersection
    public void advanceLeft() {
        this.pickThing();
        this.move();
        this.turnLeft();
        this.move();
        this.turnRight(this);
        this.putThing();
    } // advanceLeft Method

    // This method moves the player digaonally to the right one intersection
    public void advanceRight() {
        this.pickThing();
        this.move();
        this.turnRight(this);
        this.move();
        this.turnLeft();
        this.putThing();
    } // advanceRight Method

    // This method allows the player to move forward a specific amount of
    // intersections
    public void advance(int distance) {

        // Loop to move the player distance intersections forward
        for (int i = 0; i < distance; i++) {
            this.pickThing();
            this.move();
            this.putThing();
        } // for loop

    } // advance Method

    // This method allows the player to move diagonally left a specific amount of
    // intersections
    public void advanceLeft(int distance) {

        // Loop to move the player distance intersections diagonally left
        for (int i = 0; i < distance; i++) {
            this.pickThing();
            this.move();
            this.turnLeft();
            this.move();
            this.turnRight(this);
            this.putThing();
        } // for loop

    } // advanceLeft Method

    // This method allows the player to move diagonally right a specific amount of
    // intersections
    public void advanceRight(int distance) {

        // Loop to move the player distance intersections diagonally right
        for (int i = 0; i < distance; i++) {
            this.pickThing();
            this.move();
            this.turnRight(this);
            this.move();
            this.turnLeft();
            this.putThing();
        } // for loop

    } // advanceRight Method

} // SoccerPlayer Class
