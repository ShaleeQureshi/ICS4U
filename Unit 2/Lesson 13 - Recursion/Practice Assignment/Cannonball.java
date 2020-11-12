/*
* Last Modified: November 12, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class has the solution to question 2
*
* Method List:
* 1. public static void main(String[] args) = This method runs the entire program
*
* Helper Methods List:
* 1. public static int cannonball(int levels) = This method determines the number of cannonballs in levels row
*
*/
public class Cannonball {

    /**
     * This method determines the number of cannonballs in levels row
     * 
     * @param levels
     * @return number of cannonballs
     */
    public static int cannonball(int levels) {
        // If the level is 0 then there are 0 levels
        if (levels == 0) {
            return 0;
        } else {
            return levels * levels + (cannonball(levels - 1));
        }
    } // cannonball Method

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {
        int val = cannonball(3);
        System.out.println(val);
    } // main Method

} // Cannonball Class
