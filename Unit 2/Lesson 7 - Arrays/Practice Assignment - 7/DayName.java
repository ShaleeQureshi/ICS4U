
/*
* Last Modified: October 26, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the solution to question 1 -> What Day is it?
*
* Direct User I/O Operation Methods: 
* 1. static void main(String[] args) = This method runs the entire program
*
*/
// Import Statements
public class DayName {

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Instantiating Array
        String[] daysOfTheWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        while (true) {
            int day = Prompt.getInt("Enter a number from 1-7"); // Prompting user for an integer number

            // If the user enters a number from 1-7 (inclusively) the following will occur
            if (day - 1 >= 0 && day <= 7) {
                System.out.println(daysOfTheWeek[day - 1]); // Outputting the dat
            }
            // If the user enters a number greater than 7 the following will occur
            else if (day > 7) {
                System.out.println("Sorry! " + day + " is too large!");
            }
            // If the user enters a negative number the following will occur
            else {
                System.out.println("Sorry, there are no days that have that number!");
                System.exit(0);
            }

        } // while loop

    } // main Method

} // DayName Class