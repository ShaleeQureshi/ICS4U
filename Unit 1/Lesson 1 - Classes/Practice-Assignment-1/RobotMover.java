
/*
* Date: September 25, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: Creates a program that will make a robot move an object from point A -> B
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

public class RobotMover {

    public static void main(String[] args) {

        // Instantiating Objects
        City myCity = new City(); // The City
        Robot myRobotOne = new Robot(myCity, 1, 0, Direction.EAST); // The Robot
        new Thing(myCity, 1, 2); // The Thing (Not Instantiating a variable for the object as it is not needed)

        // Movement for myRobotOne
        myRobotOne.move();
        myRobotOne.move();
        myRobotOne.pickThing(); // Picking up the object
        myRobotOne.move();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotOne.move();
        myRobotOne.putThing(); // Dropping the object
        myRobotOne.move();

        // Alerting the user
        JOptionPane.showMessageDialog(null, "The object has been placed on Second Street and Third Avenue!");

    } // main Method

} // RobotMover Class
