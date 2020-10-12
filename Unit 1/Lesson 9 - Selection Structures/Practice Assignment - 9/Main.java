/*
* Date: October 9, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class runs the entire program
*
* Method List: 
* 1. main(final String[] args) = Main Method
*
* Dependences:
* 1. becker.jar
*/

// Import Statements
import becker.robots.*;
import javax.swing.JOptionPane;

public class Main {

    // This method runs the entire program
    public static void main(String[] args) {

        // Instantiating Objects
        City city = new City("./Field - Copy.txt"); // City from defined layout
        PlanterRobot robot = new PlanterRobot(city, 1, 0, Direction.EAST);

        // Invoking the public method to begin planting
        robot.plantField(6);

        // Letting the user know it is finished
        JOptionPane.showMessageDialog(null, "Planting Completed!");

    } // main Method

} // Main CLass