/*
* Last Modified: November 12, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class has the solution to question 1 
*
* Method List:
* 1. public static void main(String[] args) = This method runs the entire program
*
* Helper Methods List:
* 1. private static int power(int base, int n) = This method determines the power of base raised to exponent n
*
*/
public class Powers {

    /**
     * This method determines the power of base raised to exponent n
     * 
     * @param base
     * @param n
     * @return the value
     */
    private static int power(int base, int n) {
        // If the exponent is less than or equal to 1
        if (n <= 1) {
            return base;
        } else {
            return base * power(base, n - 1);
        }
    } // power Method

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {
        int value = power(2, 2);
        System.out.println(value);
    } // main Method

} // Powers Class