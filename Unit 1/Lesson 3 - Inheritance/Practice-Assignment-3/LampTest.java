/*
* Date: September 29, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class creates a Lamp object to test it
*
* Method List: 
* 1. void main(String[] args) = This method runs the entire program
*/

// Import Statements
import becker.robots.*;
import javax.swing.JOptionPane;

public class LampTest {

    public static void main(String[] args) {

        // Instantiating Objects
        City myCity = new City();
        Robot myRobot = new Robot(myCity, 2, 2, Direction.EAST);
        Lamp lamp1 = new Lamp(myCity, 2, 4);
        Lamp lamp2 = new Lamp(myCity, 3, 1);

        // Loop to move the robot to second street and fifth avenue
        for (int i = myRobot.getAvenue(); i < 5; i++) {
            if (i == 4) {
                lamp1.turnOn(); // If its fourth avenue the lamp will turn on
            }
            myRobot.move(); // Moving the robot
        } // for loop

        lamp1.turnOff(); // Turning off the lamp

        // Making the robot turn right then move forward then turn right again
        myRobot.turnLeft();
        myRobot.turnLeft();
        myRobot.turnLeft();
        myRobot.move();
        myRobot.turnLeft();
        myRobot.turnLeft();
        myRobot.turnLeft();

        // Loop to move the robot to third street and zero avenue
        for (int i = myRobot.getAvenue(); i > 0; i--) {
            if (i == 1) {
                lamp2.turnOn(); // If it is first avenue the lamp will turm on
            }
            myRobot.move(); // Moving the robot
        } // for loop

        lamp2.turnOff(); // Turning off the lamp

        // Letting the user know the test is done
        JOptionPane.showMessageDialog(null, "Test - Complete");

    } // main Method

} // LampTest Class
