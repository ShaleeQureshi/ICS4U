/*
* Last Modified: October 27, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the solution to question 2 -> Simple Math
*
* Method List:
* 1. static void main(String[] args) = This method runs the entire program
*
*/
public class SimpleMath {

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        int arraySize = Prompt.getInt("Please enter the size of the array"); // Prompting user for array size
        int[] array = new int[arraySize]; // Instantiating an array with the given size

        // Loop to populate the array
        for (int i = 0; i < array.length; i++) {
            array[i] = Prompt.getInt("Please enter a number for spot #" + (i + 1));
        } // for loop

        // Creating an Instance of ArrayStats
        ArrayStats myStats = new ArrayStats(array);

        // Outputting data regarding my array
        System.out.println("The max value in the array is " + myStats.getMax());
        System.out.println("The min value in the array is " + myStats.getMin());
        System.out.println("The sum of the array is " + myStats.getSum());

    } // main Method

} // SimpleMath Class
