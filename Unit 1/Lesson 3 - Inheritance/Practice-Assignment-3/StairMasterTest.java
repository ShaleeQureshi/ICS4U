/*
* Date: September 29, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class create a StairMaster object to test it
*
* Method List: 
* 1. void main(String[] args) = This method runs the entire program
*/

// Import Statements
import becker.robots.*;
import javax.swing.JOptionPane;

public class StairMasterTest {

    public static void main(String[] args) {

        final String filePath = "./StairCity.txt"; // File-path to the city data

        // Instantiating Objects
        City myCity = new City(filePath);
        StairMaster robotPickUp = new StairMaster(myCity, 5, 1, Direction.EAST);
        StairMaster robotDrop = new StairMaster(myCity, 5, 11, Direction.EAST);

        // robotPickUp moving up the stairs
        robotPickUp.move();
        robotPickUp.pickThing(); // Picking up the thing
        robotPickUp.stepUp();
        robotPickUp.pickThing(); // Picking up the thing
        robotPickUp.stepUp();
        robotPickUp.pickThing(); // Picking up the thing
        robotPickUp.stepUp();
        robotPickUp.pickThing(); // Picking up the thing

        // robotPickUp moving down the stairs
        robotPickUp.stepDown();
        robotPickUp.pickThing(); // Picking up the thing
        robotPickUp.stepDown();
        robotPickUp.pickThing(); // Picking up the thing
        robotPickUp.stepDown();
        robotPickUp.pickThing(); // Picking up the thing

        // robotPickUp moving to robotDrop
        robotPickUp.move();
        robotPickUp.move();
        robotPickUp.move();

        // Storing the total number of things on a variable
        final int totalThings = robotPickUp.countThingsInBackpack();

        // Loop for robotPickUp to drop things and for robotDrop to pick them up
        for (int i = 0; i < totalThings; i++) {
            robotPickUp.putThing(); // robotPickUp dropping the things
            robotDrop.pickThing(); // robotPickThing picking them up
        } // for loop

        // robotDrop moving up the mountain
        robotDrop.move();
        robotDrop.putThing(); // Dropping the thing
        robotDrop.stepUp();
        robotDrop.putThing(); // Dropping the thing
        robotDrop.stepUp();
        robotDrop.putThing(); // Dropping the thing
        robotDrop.stepUp();
        robotDrop.putThing(); // Dropping the thing

        // robotPickUp moving down the stairs
        robotDrop.stepDown();
        robotDrop.putThing(); // Dropping the thing
        robotDrop.stepDown();
        robotDrop.putThing(); // Dropping the thing
        robotDrop.stepDown();
        robotDrop.putThing(); // Dropping the thing
        robotDrop.move();

        // Letting user know the testing is completed
        JOptionPane.showMessageDialog(null, "Test - Complete");

    } // main Method

} // StairMasterTest Class
