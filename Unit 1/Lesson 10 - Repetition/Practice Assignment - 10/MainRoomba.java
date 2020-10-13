/*
* Date: October 9, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class runs the Roomba program
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

public class MainRoomba {

    // This method runs the entire program
    public static void main(String[] args) {

        // Instantiating Objects
        City city = new City("./DirtyRoom.txt");
        Roomba myRoomba = new Roomba(city, 0, 0, Direction.EAST);
        Thing things[];

        // Adding new things (random amount between 1-3 + randomly placed)
        things = new Thing[(int) (Math.random() * 3) + 1];

        // Loop to add things in random locations
        for (int i = 0; i < things.length; i++) {
            int street = (int) (Math.random() * 3) + 1;
            int avenue = (int) (Math.random() * 3) + 1;
            things[i] = new Thing(city, street, avenue);
        } // for loop

        myRoomba.cleanUp(); // Calling the only public method

        // Letting the user know the room is clean
        JOptionPane.showMessageDialog(null, "The room has been cleaned!");

    } // main Method

} // MainRoomba Class
