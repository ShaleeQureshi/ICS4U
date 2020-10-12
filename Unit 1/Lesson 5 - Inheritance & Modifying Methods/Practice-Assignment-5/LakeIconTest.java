/*
* Date: October 1, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class tests the Lake Class object
*
* Method List: 
* 1. void main (String[] args)  = This method runs the entire program
*
*/

// Import Statements
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import javax.swing.JOptionPane;

public class LakeIconTest {

    // This method runs the entire program
    public static void main(String[] args) {

        // Instantiating Objects
        City myCity = new City();
        Robot robot = new Robot(myCity, 1, 1, Direction.EAST);
        new Lake(myCity, 1, 2, Direction.WEST);

        // Moving the robot forward
        robot.move();
        robot.pickThing();

        // Letting the user know the test is complete
        JOptionPane.showMessageDialog(null, "Test - Complete");

    } // main Method

} // LakeIconTest Class
