/*
* Date: October 9, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class runs the SteepleChaser program
*
* Method List: 
* 1. main(final String[] args) = Main Method
*
* Dependences:
* 1. becker.jar
*/

// Import Statements
import javax.swing.JOptionPane;

import becker.robots.*;

public class MainSteepleChaser {

    // This method runs the entire program
    public static void main(String[] args) {

        // Instantiating Objects
        City city = new City("./steeplechase - Copy.txt");
        SteepleChaser steepleChaser = new SteepleChaser(city, 5, 0, Direction.EAST);
        steepleChaser.runRace();

        // Letting the user know the program is finished
        JOptionPane.showMessageDialog(null, "Program Complete!");
        System.exit(0); // Termianting the program

    } // main Method

} // MainSteepleChaser Class
