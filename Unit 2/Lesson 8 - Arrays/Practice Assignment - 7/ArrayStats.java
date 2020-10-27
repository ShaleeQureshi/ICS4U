/*
* Last Modified: October 27, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the services for question 2 -> Simple Math
*
* Constructor List:
* 1. ArrayStats(int[] userArray)
*
* Method List:
* 1. public int getMax() = This method determines the max number in the array
* 2. public int getMin() = This method determines the min number in the array
* 3. public int getSum() = This method determines the sum of the array
*
*/

public class ArrayStats {

    // Instance Variable
    private int[] array;

    /**
     * This is the Constructor
     * 
     * @param userArray
     */
    public ArrayStats(int[] userArray) {
        this.array = new int[userArray.length]; // Making them the same length

        // Transfering data between the 2 arrays
        for (int i = 0; i < userArray.length; i++) {
            this.array[i] = userArray[i];
        } // for loop

    } // Constructor

    /**
     * This method determines the max number in the array
     * 
     * @return the max number
     */
    public int getMax() {

        int maxVal = 0;

        // Loop to iterate through the array
        for (int i = 0; i < this.array.length; i++) {
            if (maxVal < this.array[i]) {
                maxVal = this.array[i];
            }
        } // for loop

        return maxVal; // Returing the maxVal

    } // getMax Method

    /**
     * This method determines the min number in the array
     * 
     * @return the min number
     */
    public int getMin() {

        int minVal = this.array[0];

        // loop to iterate through the array
        for (int i = 0; i < this.array.length; i++) {
            if (minVal > this.array[i]) {
                minVal = this.array[i];
            }
        } // for loop

        return minVal; // Returing the minVal

    } // getMin Method

    /**
     * This method determines the sum of the array
     * 
     * @return the sum
     */
    public int getSum() {

        int sum = 0;

        // Loop to iterate through the array
        for (int i = 0; i < this.array.length; i++) {
            sum += this.array[i];
        } // for loop

        return sum; // Returing the sum

    } // getSum Method

} // ArrayStats Class
