/*
* Date: October 9, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class runs the MazeWalker program
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

public class MainMazeWalker {

    // This method runs the entire program
    public static void main(String[] args) {

        // Making the maze randomly sized (between 2-10 streets/avenues)
        int streetNum = (int) (Math.random() * 10) + 2;
        int avenueNum = (int) (Math.random() * 10) + 2;

        // Instantiating Objects
        MazeCity mazeCity = new MazeCity(streetNum, avenueNum);
        new Thing(mazeCity, streetNum - 1, avenueNum - 1); // Making the object (end of maze) placed at the very bottom
                                                           // left of the maze

        MazeWalker myWalker = new MazeWalker(mazeCity, 0, 0, Direction.EAST);

        myWalker.followRightWall(); // Calling the only public method to begin the movement

        // Letting the user know the MazeWalker has reached the end of the maze
        JOptionPane.showMessageDialog(null, "The MazeWalker has finished the Maze!");

    } // main Method

} // MainMazeWalker Class
