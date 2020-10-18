/*
* Date: October 17, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: Creates a program that calculate the volume of a cube with user inputted dimension values
*
* Method List: 
* 1. static double getValue(Scanner input, String prompt) = This method will ensure only a double value is inputted
* 2. main(final String[] args) = This method runs the entire program
*
*/

// Import Statements
import java.util.Scanner;

public class VolumeCalculator {

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

        // Prompting user for each dimension
        double length = getValue(input, "Please enter the length of the cube!");
        double width = getValue(input, "Please enter the width of the cube!");
        double height = getValue(input, "Please enter the height of the cube!");

        // Outputting the volume
        System.out.println("The Volume of the Cube is: " + (length * width * height) + " units³");

    } // main Method

} // VolumeCalculator Class
