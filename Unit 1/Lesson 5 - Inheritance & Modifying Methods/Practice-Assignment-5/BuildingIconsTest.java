/*
* Date: October 1, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class tests the BuildingIcon class Objects
*
* Method List: 
* 1. void main (String[] args)  = This method runs the entire program
*
*/

// Import Statements
import becker.robots.*;

public class BuildingIconsTest {

    // This method runs the entire program
    public static void main(String[] args) {

        // Instantiating Objects
        City myCity = new City();
        Robot myRobot = new Robot(myCity, 1, 1, Direction.EAST);
        new BuildingIcon(myCity, 1, 2, Direction.EAST);
        new BuildingIcon(myCity, 1, 5, Direction.EAST);

        // Robot turing right
        myRobot.turnLeft();
        myRobot.turnLeft();
        myRobot.turnLeft();

        // Loop to move the robot down to 6th street
        for (int i = myRobot.getStreet(); i < 6; i++) {
            myRobot.move();
        } // for loop

        myRobot.turnLeft();

        // Loop to move the robot down to 6th avenue
        for (int i = myRobot.getAvenue(); i < 6; i++) {
            myRobot.move();
        } // for loop

        myRobot.turnLeft();

        // Loop to move the robot back to 1st street
        for (int i = myRobot.getStreet(); i > 1; i--) {
            myRobot.move();
        } // for loop

        myRobot.turnLeft();

        // Loop to move the robot back to 1st avenue (will crash into building)
        for (int i = myRobot.getAvenue(); i > 1; i--) {
            myRobot.move();
        } // for loop

    } // main Method

} // BuildingIconsTest Class
