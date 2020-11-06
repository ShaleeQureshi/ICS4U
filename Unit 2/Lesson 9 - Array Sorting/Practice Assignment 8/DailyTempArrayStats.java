/*
* Last Modified: October 27, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the services for question 3 -> Daily Temperatures
*
* Constructor List:
* 1. DailyTempArrayStats(int[] userArray)
*
* Method List:
* 1. public int getTempDataPoints() = This method determines the number of data points in the set
* 2. public int getMax() = This method determines the max number in the array
* 3. public int getHighNum() = This method determines the number of times that the highest temperature value occurs
* 4. public int getMin() = This method determines the min number in the array
* 5. public int getSum() = This method determines the sum of the array
* 6. public int getAverage() = This method determines the average temperature in the array
* 7. public int[] getUserArray() = This method returns the array passed into this class
*
*/
public class DailyTempArrayStats {

    // Instance Variable
    private int[] array;

    /**
     * This is the Constructor
     * 
     * @param userArray
     */
    public DailyTempArrayStats(int[] userArray) {
        this.array = new int[userArray.length]; // Making them the same length

        // Transfering data between the 2 arrays
        for (int i = 0; i < userArray.length; i++) {
            this.array[i] = userArray[i];
        } // for loop

    } // Constructor

    /**
     * This method determines the number of data points in the set
     * 
     * @return the first index in the array
     */
    public int getTempDataPoints() {
        return this.array[0];
    } // getTempDataPoints

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
     * This method determines the number of times that the highest temperature value
     * occurs
     * 
     * @return the number of times the highest temp value occurs
     */
    public int getHighNum() {

        int times = 0;

        // Loop to iterate through the array
        for (int i = 0; i < this.array.length; i++) {
            if (this.getMax() == this.array[i]) {
                times++;
            }
        } // for loop

        return times;

    } // getHighNum Method

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

    /**
     * This method determines the average temperature in the array
     * 
     * @return the average temperature of the array
     */
    public int getAverage() {

        return (this.getSum() / this.array.length);

    } // getAverage Method

    /**
     * This method returns the array passed into this class
     * 
     * @return array
     */
    public int[] getUserArray() {
        return this.array;
    } // getUserArray Method

} // DailyTempArrayStats Class
