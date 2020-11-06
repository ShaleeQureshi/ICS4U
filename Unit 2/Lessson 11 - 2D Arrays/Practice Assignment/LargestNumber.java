/*
* Last Modified: November 6, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the solution to Question 1
*
* Method List:
* 1. public static void main(String[] args) = This method runs the entire program
*
* Helper Methods List:
* 1. private static int returnVal(int[][] array) = This method determines the largest value in a 2D int array
*
*
*/
public class LargestNumber {

    /**
     * This method determines the largest value in a 2D int array
     * 
     * @param array
     * @return largst value
     */
    private static int returnVal(int[][] array) {

        int num = 0; // Stores the largest value

        // Loop to traverse the rows of the 2D Array
        for (int i = 0; i < array.length; i++) {
            // Loop to traverse the columns in the 2D Array
            for (int j = 0; j < array[i].length; j++) {
                if (num < array[i][j]) {
                    num = array[i][j];
                }
            } // for loop

        } // for loop

        return num; // Returing the largest value

    } // returnVal Method

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Instantiating a 2D array
        int[][] array = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9102131 }, { 10002 } };
        int val = returnVal(array); // Getting the largest value in the array
        System.out.println(val); // Outputting the value

    } // main Method

} // LargestNumber Class