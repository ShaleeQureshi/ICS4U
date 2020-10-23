
/*
* Date: October 20, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains various services to help with Input/Output Operations
*
* Method List: 
* 1. static File getInputFile(String fileName) = This method ensures that the specified file in prompt is readable
* 2. static Scanner getInputScanner(String prompt) = This method opens a specified file using Scanner
* 3. static PrintWriter getPrintWriter(String prompt) = This method prompts user for a fileName
* 4. static String readFile(Scanner userScanner) = This method reads from a file
* 5. static int askNum (String prompt) = This method prompts the user for an integer
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
            String getFile = askString(prompt);
            file = new File(getFile); // Passing the fileName to the File Constructor
            // If the file is readable the following will occur
            if (file.canRead()) {
                return file; // Returning the file
            } else {
                System.out.println(getFile = " is not readable!");
            }
        }

    } // getInputFile Method

    /**
     * This method opens a specified file using Scanner
     * 
     * @param prompt
     * @return returns the Scanner Object
     */
    public static Scanner getInputScanner(File userFile) {

        // Try-Catch Statement to handle possible errors
        try {
            return new Scanner(userFile); // Returning the Scanner Object with a File
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
    public static PrintWriter getPrintWriter(File userFile) {

        // Try-Catch Statement to handle possible errors
        try {
            return new PrintWriter(userFile); // Returning the PrintWriter Object
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
        }
        userScanner.close();
        return data;

    } // readFile Method

    /**
     * This method prompts the user for an integer
     * 
     * @return the integer value entered
     */
    public static int askInt(String prompt) {

        input = new Scanner(System.in);

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
        }

    } // askInt Method

    public static String askString(String prompt) {

        input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();

    } // askString Method

    /**
     * This method tests each service in this class
     * 
     * @param args
     */
    public static void main(String[] args) {

        String testFile = "TestFile.txt"; // Test File for File manipulation tests

        // Testing static File getInputFile(String prompt)
        if (getInputFile(testFile) != null) {
            System.out.println("getInputFile Test Successful");
        } else {
            System.out.println("getInputFile Test Failed");
        }
        // Testing static Scanner getInputScanner(String prompt)
        if (getInputScanner(getInputFile(testFile)) != null) {
            System.out.println("getInputScanner Test Successful");
        } else {
            System.out.println("getInputScanner Test Failed");
        }
        // Testing static PrintWriter getPrintWriter(String prompt)
        if (getPrintWriter(new File(testFile)) != null) {
            System.out.println("getPrintWriter Test Successful");
        } else {
            System.out.println("getPrintWriter Test Failed");
        }

    } // main Method

} // Prompt Class