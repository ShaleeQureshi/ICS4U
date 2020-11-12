/*
* Last Modified: November 12, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class has the solution to question 3
*
* Method List:
* 1. public static void main(String[] args) = This method runs the entire program
*
* Helper Methods List:
* 1. private static int determineSequence(int n) = This method determines the fibonacii sequence of numbers
*
*/
public class Fibonacii {

    /**
     * This method determines the fibonacii sequence of numbers
     * 
     * @param n
     * @return the nth number in the sequence
     */
    private static int determineSequence(int n) {

        // If the value is 1 or 2 (base case)
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return determineSequence(n - 1) + determineSequence(n - 2);
        }
    } // determineSequence Method

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {
        int val = determineSequence(7);
        System.out.println(val);
    } // main Method

} // Fibonacii Class
