import javax.swing.JOptionPane;

/*
* Last Modified: November 6, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the solution to Question 3
*
* Method List:
* 1. public static void main(String[] args) = This method runs the entire program
*
* Helper Methods List:
* 1. private static String[] promptUser() = This method prompts the user for the 4 courses
* 2. private static int[][] promptForMarks(String[] courseNames) = This method prompts the user for marks
* 3. private static int[] calculateAvg(int[][] array) = This method calculates the user's average per course
*
*
*/
// Import Statements

public class LacsapsTriangle {

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Prompting user for row number
        int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter row number"));

        // Instantiating a 2D array with the row number value
        int[][] array = new int[value][value];

        // Loop to traverse/manipulate the array
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            array[i][j] = i + 1;
            if (i == 1) {
                array[i][j] = 2;
            }
            if (i > 1) {
                for (j = 0; j < array[i].length; j++) {
                    j++;
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    System.out.print(array[i][j]);
                }
            }
            System.out.println();
        }

    } // main Method

} // LacsapsTriangle Class
