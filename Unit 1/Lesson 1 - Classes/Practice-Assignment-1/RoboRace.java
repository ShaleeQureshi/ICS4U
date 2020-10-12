
/*
* Date: September 25, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: Creates a program that has two robots begin at certain positions and end at certain positions
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

public class RoboRace {

    public static void main(String[] args) {

        // Instantiating Objects
        City myCity = new City(); // The City
        Robot myRobotOne = new Robot(myCity, 0, 1, Direction.EAST); // The Robot
        Robot myRobotTwo = new Robot(myCity, 0, 2, Direction.WEST); // The Robot
        // (Not Instantiating a variable for the object as it is not needed)
        // Walls
        new Wall(myCity, 0, 2, Direction.WEST);
        new Wall(myCity, 1, 2, Direction.WEST);
        new Wall(myCity, 2, 2, Direction.WEST);
        new Wall(myCity, 3, 2, Direction.WEST);
        new Wall(myCity, 3, 2, Direction.SOUTH);

        // Moving the robots to the end point (they are mixed up as the question wanted
        // them to approach the end point around the same time and this was the fasted
        // way to do that)
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotTwo.turnLeft();
        myRobotTwo.move();
        myRobotTwo.move();
        myRobotOne.move();
        myRobotOne.move();
        myRobotOne.move();
        myRobotOne.move();
        myRobotOne.turnLeft();
        myRobotOne.move();
        myRobotTwo.move();
        myRobotTwo.turnLeft();
        myRobotTwo.move();
        myRobotTwo.turnLeft();
        myRobotTwo.turnLeft();
        myRobotTwo.turnLeft();
        myRobotTwo.move();
        myRobotTwo.turnLeft();
        myRobotTwo.turnLeft();
        myRobotTwo.turnLeft();
        myRobotTwo.move();

        JOptionPane.showMessageDialog(null, "You have arrived at your destination"); // Alerting the user

    } // main Method

} // RoboRace Class
