/*
* Date: September 29, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class creates a SoccerPlayer object to test it
*
* Method List: 
* 1. void main(String[] args) = This method runs the entire program
*/

// Import Statements
import becker.robots.*;
import javax.swing.JOptionPane;

public class SoccerPlayerTest {

    public static void main(String[] args) {

        final String filePath = "./SoccerField.txt"; // File-path to the city data

        // Instantiating Objects
        City city = new City(filePath);
        SoccerPlayer player1 = new SoccerPlayer(city, 4, 2, Direction.EAST);
        SoccerPlayer player2 = new SoccerPlayer(city, 4, 8, Direction.WEST);

        // Moving player2
        player2.advanceLeft();
        player2.advanceRight();
        player2.advance(1);
        player2.advanceLeft(1);
        player2.advanceRight(1);
        player2.advance();

        // Letting the user know player1 is now moving
        JOptionPane.showMessageDialog(null, "Player 1 is now moving!\n Press ok to continue.");

        // Moving player1
        player1.advance();
        player1.advanceLeft();
        player1.advanceRight();
        player1.advance();
        player1.advanceLeft(1);
        player1.advanceRight(1);
        player1.advance(2);

        // Letting the user know the test is complete
        JOptionPane.showMessageDialog(null, "Test - Complete");

    } // main Method

} // SoccerPlayerTest
