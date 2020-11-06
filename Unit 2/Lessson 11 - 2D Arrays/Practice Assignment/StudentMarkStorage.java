
/*
* Last Modified: November 6, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the solution to Question 1
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
import javax.swing.JOptionPane;

public class StudentMarkStorage {

    /**
     * This method prompts the user for the 4 courses
     * 
     * @return String array
     */
    private static String[] promptUser() {
        String[] courseName = new String[4]; // String array of 4 elements
        // Loop to populate the array with data
        for (int i = 0; i < courseName.length; i++) {
            courseName[i] = JOptionPane.showInputDialog(null, "Please enter course #" + (i + 1)); // Prompting user for
                                                                                                  // data
        } // for loop
        return courseName; // Returing String array
    } // promptUser Method

    /**
     * This method prompts the user for marks
     * 
     * @param courseNames
     * @return 2d array with marks
     */
    private static int[][] promptForMarks(String[] courseNames) {
        int[][] marks = new int[4][4]; // Creating a 4 by 4 array
        // Loop to traverse through the rows
        for (int i = 0; i < marks.length; i++) {
            JOptionPane.showMessageDialog(null, "Please enter the mark for " + courseNames[i]);
            // Loop to traverse through the columns
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Mark #" + (j + 1))); // Getting input
                                                                                                       // from user
            } // for loop
        } // for loop
        return marks; // Returning 2d array
    } // promptForMarks Method

    /**
     * This method calculates the user's average per course
     * 
     * @param array
     * @return array with averages per course
     */
    private static int[] calculateAvg(int[][] array) {
        int[] sum = new int[array[0].length]; // Creating a sum array
        int[] avg = new int[array[0].length]; // Creating an avg array
        // Loop to traverse through the array's rows
        for (int i = 0; i < array.length; i++) {
            // Loop to traverse through the array's columns
            for (int j = 0; j < array[i].length; j++) {
                sum[i] = sum[i] + array[i][j]; // Getting the sum per column
            } // for loop
        } // for loop

        // Loop to traverse the sum array
        for (int i = 0; i < sum.length; i++) {
            avg[i] = (int) sum[i] / sum.length; // Calculating the average
        } // for loop

        return avg; // Returing the average array
    } // calculateAvg Method

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        String[] courseNames = promptUser(); // Getting the courses
        int[][] marks = promptForMarks(courseNames); // Getting the marks per course
        int[] avg = calculateAvg(marks); // Getting the average per course

        // Loop to go through the rows
        for (int i = 0; i < marks.length; i++) {
            System.out.println(courseNames[i] + "\tAverage - " + avg[i]); // Outoutting the course name + avg
            // Loop to go through the columns
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println(marks[i][j]); // Outputting the marks per course
            } // for loop
        } // for loop

    } // main Method

} // StudentMarkStorage Class
