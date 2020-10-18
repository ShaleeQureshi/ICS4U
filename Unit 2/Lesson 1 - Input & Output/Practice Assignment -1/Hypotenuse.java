/*
* Date: October 17, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: Creates a program that calculates the hypotenuse given the base and height
*
* Method List: 
* 1. static double getValue(Scanner input, String prompt) = This method will ensure only a double value is inputted
* 2. main(final String[] args) = This method runs the entire program
*
*/

// Import Statements
import java.util.Scanner;

public class Hypotenuse {

    /**
     * This method will ensure only a double value is inputted
     * 
     * @param prompt
     * @return
     */
    private static double getValue(Scanner input, String prompt) {

        // Loop to ensure the valid input is entered
        while (true) {
            System.out.println(prompt); // Prompting user

            // If a double is entered the following will occur
            if (input.hasNextDouble()) {
                double answer = input.nextDouble(); // Getting the value
                input.nextLine();
                return answer; // Returning it
            }
            // If an invalid input is entered the following will occur
            else {
                String value = input.nextLine();
                System.out.println("Error:" + value + " is not a double value!");
            }
        } // while loop

    } // getValue Method

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Initializing my Scanner
        Scanner input = new Scanner(System.in);

        // Prompting user
        double base = getValue(input, "Please enter the base of the triangle");
        double height = getValue(input, "Please enter the height of the triangle");

        // Outputting the answer
        System.out.println("The Hypotenuse of the triangle is roughly"
                + Math.round((Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)))));

    } // main Method

} // Hypotenuse Class