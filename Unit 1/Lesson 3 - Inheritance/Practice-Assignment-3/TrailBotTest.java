/*
* Date: September 29, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class creates a TrailBot object to test it
*
* Method List: 
* 1. void main(String[] args) = This method runs the entire program
*/

// Import Statements
import becker.robots.*;
import javax.swing.JOptionPane;

public class TrailBotTest {

    public static void main(String[] args) {

        // Instantiating Objects
        City myCity = new City();
        TrailBot testRobot = new TrailBot(myCity, 1, 1, Direction.EAST);

        // Testing movements
        // Loop will execute until the Robot reaches the sixth avenue
        for (int i = testRobot.getAvenue(); i < 6; i++) {
            testRobot.trailMove();
        } // for loop

        testRobot.threeTurn(); // Turning the robot 3 times

        // Loop will execute until the Robot reaches the sixth street
        for (int i = testRobot.getStreet(); i < 6; i++) {
            testRobot.trailMove();
        } // for loop

        testRobot.threeTurn(); // Turning the robot 3 times

        // Loop will execute until the Robot reaches the first avenue
        for (int i = testRobot.getAvenue(); i > 1; i--) {
            testRobot.trailMove();
        } // for loop

        testRobot.threeTurn(); // Turning the robot 3 times

        // Loop will execute until the Robot reaches the first street
        for (int i = testRobot.getStreet(); i > 1; i--) {
            testRobot.trailMove();
        } // for loop

        // Letting user know the testing is completed
        JOptionPane.showMessageDialog(null, "Test - Complete");

    } // main Method

} // TrailBotTest Class
