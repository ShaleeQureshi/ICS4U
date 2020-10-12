/*
* Date: October 7, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class runs the entire program
*
* Method List: 
* 1. void main(String[] args) = This method runs the entire program
*
* Dependences:
* 1. becker.jar
*/

// Import Statements
import becker.robots.*;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // Instantiating Objects
        City city = new City();
        PinSetter pinSet = new PinSetter(city, 3, 0, Direction.EAST);
        pinSet.setPins(); // Calling the public method in the PinSetter Class

        // Letting the user know the task is complete
        JOptionPane.showMessageDialog(null, "Bowling Alley has been setup!");

    } // main Method

} // Main Class