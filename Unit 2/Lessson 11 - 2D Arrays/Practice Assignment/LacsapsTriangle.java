
/*
* Last Modified: November 9, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the solution to Question 3
*
* Method List:
* 1. public static void main(String[] args) = This method runs the entire program
*
*/
// Import Statements
import javax.swing.JOptionPane;

public class LacsapsTriangle {

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        int value = 0; // Value represents the row number

        // Try-Catch block to catch a NumberFormatException
        try {
            // Prompting user for row number
            value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter row number"));
        } catch (NumberFormatException error) {
            System.err.println(error.getMessage());
            System.exit(1);
        }

        // Instantiating a 2D array with the row number value
        int[][] array = new int[value][value];
        // Loop to traverse/manipulate the array
        for (int i = 0; i < array.length; i++) {
            array[i][0] = i + 1; // Initializing the initial row value
            // Loop to iterate through the columns
            for (int j = 1; j <= i - 1; j++) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j]; // Calculating the value
            } // for loop
            array[i][i] = i + 1;
        } // for loop

        // Printing the array

        // Loop to traverse the array (rows)
        for (int i = 0; i < array.length; i++) {
            // Loop to traverse the array (columns)
            for (int j = 0; j < array[i].length; j++) {
                // If the current index value is greater than 0 the following will occur
                if (array[i][j] > 0) {
                    System.out.print(array[i][j] + " "); // Printing it
                }
            } // for loop
            System.out.println(); // Printing the next iteration on a new line
        } // for loop

    } // main Method

} // LacsapsTriangle Class
