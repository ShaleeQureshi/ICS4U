/*
* Date: October 17, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: Creates a program that allows the user to input an integer and it will output the last digit of that number
*
* Method List: 
* 1. static int getInt(Scanner input, String prompt) = This method ensures only an integer value is entered
* 2. main(final String[] args) = This method runs the entire program
*
*/

// Import Statements
import java.util.Scanner;

public class LastDigit {

    /**
     * This method ensures only an integer value is entered
     * 
     * @param prompt
     * @return
     */
    public static int getInt(Scanner input, String prompt) {

        // Loop to ensure the valid input is entered
        while (true) {
            System.out.println(prompt); // Prompting user

            // If an integer is entered the following will occur
            if (input.hasNextInt()) {
                int answer = input.nextInt(); // Getting the value
                input.nextLine();
                return answer; // Returning it
            }
            // If an invalid input is entered the following will occur
            else {
                String value = input.nextLine();
                System.out.println("Error:" + value + " is not an integer.");
            }
        } // while loop

    } // getInt Method

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Initializing my Scanner
        Scanner input = new Scanner(System.in);

        // Prompting user for an integer
        int value = getInt(input, "Please enter an integer");

        // Outputting the last digit of the number
        System.out.println("The last digit of the number entered is: "
                + Integer.toString(value).substring(Integer.toString(value).length() - 1));

    } // main Method

} // LastDigit Class
