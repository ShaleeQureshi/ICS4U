/*
* Last Modified: November 5, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the solution to Question 2
*
* Method List:
* 1. public static void main(String[] args) = This method runs the entire program
*
* Helper Methods List:
* 1. private static int[] createArray(int n) = This helper method creates an array with n random elements
*
*
*/

public class Question2 {

    /**
     * This helper method creates an array with n random elements
     * 
     * @param n
     * @return the array with randomized elements
     */
    private static int[] createArray(int n) {
        int[] array = new int[n];
        // Loop to iterate through the array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * n); // Adding random values to the array
        } // for loop
        return array;
    } // createArray Method

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
