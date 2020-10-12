/*
* Date: October 1, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class tests the TreeIcon class Objects
*
* Method List: 
* 1. void main (String[] args)  = This method runs the entire program
*
*/

// Import Statements
import javax.swing.JOptionPane;
import becker.robots.*;

public class TreeIconTest {

    // This method runs the entire program
    public static void main(String[] args) {

        // Instantiating Objects
        City myCity = new City();
        Robot myRobot = new Robot(myCity, 1, 1, Direction.EAST);
        new TreeIcon(myCity, 1, 2);
        new TreeIcon(myCity, 1, 3);

        // Loop to move the robot
        for (int i = myRobot.getAvenue(); i < 6; i++) {
            myRobot.move();
        } // for loop

        // Letting the user now the test has been completed
        JOptionPane.showMessageDialog(null, "Test - Complete");

    } // main Method

} // TreeIconTest Class
