/*
* Date: October 1, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class tests the CarIcon object
*
* Method List: 
* 1. void main (String[] args)  = This method runs the entire program
*
*/

// Import Statements
import javax.swing.JOptionPane;

import becker.robots.*;

public class CarIconTest {

    // This method runs the entire program
    public static void main(String[] args) {

        // Instantiating Objects
        City myCity = new City();
        Robot myRobot = new Robot(myCity, 1, 1, Direction.EAST);
        CarIcon carIcon = new CarIcon();

        // Moving the robot
        myRobot.setIcon(carIcon);
        myRobot.move();
        myRobot.turnLeft();

        // Letting the user know the test is complete
        JOptionPane.showMessageDialog(null, "Test - Complete");

    } // main Method

}
