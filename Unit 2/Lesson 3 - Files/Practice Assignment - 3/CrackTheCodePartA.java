
/*
* Date: October 21, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class has the solution to Part A of question 2
*
* Method List:
* 1. static String encrypter(String data, int n) = This method encrypts the given data
* 2. static void main(String[] args) = This method runs the entire program
*
*/
// Import Statements
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CrackTheCodePartA {

    /**
     * This method encrypts the given data
     * 
     * @param data
     * @param n
     * @return the encrypted data
     */
    private static String encrypter(String data, int n) {

        byte[] encryptedData = new byte[data.getBytes().length]; // Creating a new byte array for the changed data
        char[] chArray = data.toCharArray(); // Making a char array

        // Loop to change the data
        for (int i = 0; i < data.getBytes().length; i++) {
            // If the character is a letter the following will occur
            if (Character.isLetter(chArray[i])) {
                encryptedData[i] = (byte) (data.getBytes()[i] + n); // Adding n to its ascii value
            }
            // If the data is not in the alphabet the following will occur
            else {
                encryptedData[i] = (byte) data.getBytes()[i];
            }
        } // for loop

        String returnData = new String(encryptedData); // Converting the data from a byte[] to a String
        return returnData; // Returning the data

    } // encrypter Method

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Prompting user for a constant
        int n = Prompt.askInt("Please enter an integer number");

        // Prompting user for a file
        File file = Prompt.getInputFile("Please enter the filename");

        // Initializing the Scanner
        Scanner input = Prompt.getInputScanner(file);

        // Reading from the given file
        String fileData = Prompt.readFile(input);

        // Passing the data from the file along with the constant to the encrypter
        // method to change the values
        String changedData = encrypter(fileData, n);

        PrintWriter output = Prompt.getPrintWriter(new File("Encrypted" + file.getName())); // Outputting the data to a
                                                                                            // new file
        output.println(changedData); // Outputting the data
        output.close(); // Closing the output stream

        // Outputting the file that the new data is in
        System.out.println("Data Secured in " + "Encrypted" + file.getName());

    } // main Method

} // CrackTheCodePartA Class
