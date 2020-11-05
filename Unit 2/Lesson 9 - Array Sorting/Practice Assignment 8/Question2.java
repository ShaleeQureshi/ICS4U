import java.util.concurrent.TimeUnit;

/*
* Last Modified: November 5, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the solution to Question 2
*
* Method List:
* 1. public static int[] bubbleSortAscending(int[] a) = This method sorts an array in Ascending order using BubbleSort
* 2. public static int[] bubbleSortDecending(int[] a) = This method sorts an array in Decending order using BubbleSort
* 3. public static int[] selectionSortAscending(int[] a) = This method sorts an array in Ascending order using SelectionSort
* 4. public static int[] selectionSortDecending(int[] a) = This method sorts an array in Decending order using SelectionSort
* 5. public static int[] insertionSortAscending(int[] a) = This method sorts an array in Ascending order using InsertionSort
* 6. public static int[] insertionSortDecending(int[] a) = This method sorts an array in Decending order using InsertionSort
*
* Helper Methods List:
* 1. private static String testAscending(int[] a) = This method tests the Ascending Algorithms
* 2. private static String testDecending(int[] a) = This method tests the Decending Algorithms
*
*
* Main Method can be founs at the bottom of the file to test the Algorithms
*
*/

public class Question2 {

    /**
     * This helper method creates an array with 10000 random elements
     * 
     * @return
     */
    private static int[] createArray(int size) {
        int[] array = new int[size];
        // Loop to iterate through the array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * size); // Adding random values to the array
        } // for loop
        return array;
    } // createArray Method

    private static void printArray(int[] array) {
        // Loop to iterate through the array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        } // for loop
    } // printArray Method

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Starting Sequence");

        // Testing BubbleSort
        int[] array1 = createArray(100000); // Creating an array with size 100000
        long start = System.currentTimeMillis();
        SortingMethods.bubbleSortAscending(array1);
        // printArray(SortingMethods.bubbleSortAscending(array));
        System.out.println("Time for BubbleSort: " + ((System.currentTimeMillis() - start) / 1000.0));

        // Testing SelectionSort
        int[] array2 = createArray(100000); // Creating an array with size 100000
        long start2 = System.currentTimeMillis();
        SortingMethods.selectionSortAscending(array2);
        // printArray(SortingMethods.selectionSortAscending(array));
        System.out.println("Time for SelectionSort: " + ((System.currentTimeMillis() - start2) / 1000.0));

        // Testing InsertionSort
        int[] array3 = createArray(100000); // Creating an array with size 100000
        long start3 = System.currentTimeMillis();
        SortingMethods.insertionSortAscending(array3);
        // printArray(SortingMethods.insertionSortAscending(array));
        System.out.println("Time for InsertionSort: " + ((System.currentTimeMillis() - start3) / 1000.0));

    } // main Method

} // Question2 Class
