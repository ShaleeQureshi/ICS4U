
/*
* Last Modified: October 26, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains various services to help with Input/Output Operations
*
* Direct User I/O Operation Methods: 
* 1. static int getInt(String prompt) = This method prompts the user for an Integer
* 2. static int getInt(String prompt, int lowVal, int highVal) = This method prompts the user for an integer that must be within a certain range
* 3. static String getString(String prompt) = This method prompts the user for a String
*
* File I/O Operation Methods:
* 1. static File getInputFile(String fileName) = This method ensures that the specified file in prompt is readable
* 2. static Scanner getInputScanner(String prompt) = This method opens a specified file using Scanner
* 3. static PrintWriter getPrintWriter(String prompt) = This method prompts user for a fileName
* 4. static String readFile(Scanner userScanner) = This method reads from a file
*
*/
// Import Statements
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Prompt {

    // Variables
    private static Scanner input = null;
    private static File file = null;

    /**
     * This method ensures that the specified file in prompt is readable
     * 
     * @param prompt
     * @return A File Object if it is readable
     */
    public static File getInputFile(String prompt) {

        while (true) {
            String getFile = getString(prompt);
            file = new File(getFile); // Passing the fileName to the File Constructor
            // If the file is readable the following will occur
            if (file.canRead()) {
                return file; // Returning the file
            } else {
                System.out.println(file.getName() + " is not readable!");
            }
        } // while loop

    } // getInputFile Method

    /**
     * This method opens a specified file using Scanner
     * 
     * @param prompt
     * @return returns the Scanner Object
     */
    public static Scanner getInputScanner(File fileName) {

        // Try-Catch Statement to handle possible errors
        try {
            return new Scanner(fileName); // Returning the Scanner Object with a File
        }
        // If there is an error the following will occur
        catch (FileNotFoundException error) {
            System.out.println(error.getMessage()); // Outputting the error message
            System.out.println("in " + System.getProperty("user.dir")); // Alerting the user
            System.exit(1); // Exiting the program with an error code
        }

        return null;

    } // getInputScanner Method

    /**
     * This method prompts user for a fileName
     * 
     * @param prompt
     * @return the PrintWriter Object
     */
    public static PrintWriter getPrintWriter(String fileName) {

        // Try-Catch Statement to handle possible errors
        try {
            return new PrintWriter(new File(fileName)); // Returning the PrintWriter Object
        }
        // If there is an error the following will occur
        catch (FileNotFoundException error) {
            System.out.println(error.getMessage()); // Outputting the error message
            System.out.println("in " + System.getProperty("user.dir")); // Alerting the user
            System.exit(1); // Exiting the program with an error code
        }

        return null;

    } // getPrintWriter Method

    /**
     * This method reads from a file
     * 
     * @param data
     * @return the Data in the file as a String
     */
    public static String readFile(Scanner userScanner) {

        String data = "";

        while (userScanner.hasNextLine()) {
            data = userScanner.nextLine();
        } // while loop
        userScanner.close();
        return data;

    } // readFile Method

    /**
     * This method prompts the user for an integer
     * 
     * @param prompt
     * @return
     */
    public static int getInt(String prompt) {

        input = new Scanner(System.in); // Initializing Scanner Object

        while (true) {
            System.out.println(prompt); // Prompting User
            if (input.hasNextInt()) {
                // Integer inputted, return result
                int answer = input.nextInt();
                input.nextLine();
                return answer;
            } else {
                // Invalid data type entered
                String userInput = input.nextLine();
                System.out.println("Error:" + userInput + " is not an integer.");
            }
        } // while loop

    } // getInt Method

    /**
     * This method prompts the user for an integer that must be within a certain
     * range
     * 
     * @param prompt
     * @param lowVal
     * @param highVal
     * @return the integer value entered that is within a certain range
     */
    public static int getInt(String prompt, int lowVal, int highVal) {

        input = new Scanner(System.in); // Initializing Scanner Object

        while (true) {
            System.out.println(prompt); // Prompting User
            if (input.hasNextInt()) {
                int answer = input.nextInt(); // Storing the integer value
                input.nextLine();
                // If the int value is within the given range the following will occur
                if (answer > lowVal && answer < highVal) {
                    return answer; // Returning the value
                }
                // If the int value is not within the given range the following will occur
                else {
                    System.out
                            .println("Error: " + answer + " is not within the range of " + lowVal + " and " + highVal);
                }
            } else {
                // Invalid data type entered
                String userInput = input.nextLine();
                System.out.println("Error: " + userInput + " is not an integer.");
            }
        } // while loop

    } // getInt Method

    /**
     * This method prompts the user for a String
     * 
     * @param prompt
     * @return the String value entered
     */
    public static String getString(String prompt) {

        input = new Scanner(System.in); // Initializing Scanner Object
        System.out.println(prompt); // Prompting User
        return input.nextLine(); // Returning User Input

    } // getString Method

} // Prompt Class