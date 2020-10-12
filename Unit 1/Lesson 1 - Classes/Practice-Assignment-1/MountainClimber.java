
/*
* Date: September 25, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: Creates a program that will make a robot move an object from point A -> B around a mountain
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

public class MountainClimber {

    public static void main(String[] args) {

        // Instantiating Objects
        City myCity = new City(); // The City
        Robot myRobotOne = new Robot(myCity, 3, 0, Direction.EAST); // The Robot
        // (Not Instantiating a variable for the object as it is not needed)
        new Thing(myCity, 3, 1); // The Thing
        // Walls
        new Wall(myCity, 3, 2, Direction.WEST);
        new Wall(myCity, 3, 2, Direction.NORTH);
        new Wall(myCity, 2, 3, Direction.WEST);
        new Wall(myCity, 1, 3, Direction.WEST);
        new Wall(myCity, 1, 3, Direction.NORTH);
        new Wall(myCity, 1, 3, Direction.EAST);
        new Wall(myCity, 2, 4, Direction.NORTH);
        new Wall(myCity, 2, 4, Direction.EAST);
        new Wall(myCity, 3, 4, Direction.EAST);

        // Movement for myRobotOne
        myRobotOne.move();
        myRobotOne.pickThing(); // Picking up the object
        myRobotOne.turnLeft();
        myRobotOne.move();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotOne.move();
        myRobotOne.turnLeft();
        myRobotOne.move();
        myRobotOne.move();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotOne.move();
        myRobotOne.putThing(); // Dropping the object
        myRobotOne.move();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotOne.move();
        myRobotOne.turnLeft();
        myRobotOne.move();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotOne.move();
        myRobotOne.move();
        myRobotOne.move();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotOne.move();
        myRobotOne.move();
        myRobotOne.move();
        myRobotOne.move();
        myRobotOne.move();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotOne.move();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();
        myRobotOne.turnLeft();

        // Alerting the user
        JOptionPane.showMessageDialog(null, "The object has been placed on Street 0 and Avenue 3!");

    } // main Method

} // MountainClimber Class
