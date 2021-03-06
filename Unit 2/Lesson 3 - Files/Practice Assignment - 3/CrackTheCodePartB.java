
/*
* Date: October 21, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class has the solution to Part B of question 2
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

public class CrackTheCodePartB {

    /**
     * This method encrypts the given data
     * 
     * @param data
     * @param n
     * @return the encrypted data
     */
    private static String encrypter(String data, int n) {

        data = data.toUpperCase();
        String finalWord = ""; // Represents the word that will be created
        char[] chArray = data.toCharArray(); // Making a char array

        // Loop to add unique characters to the finalWord String
        for (int i = 0; i < data.length(); i++) {

            // If the character is a letter the following will occur
            if (Character.isLetter(chArray[i])) {
                // Ensuring the string only has distinct characters
                if (!finalWord.contains(String.valueOf(chArray[i]))) {
                    finalWord += chArray[i];
                }
            }
            // If the character is not a letter the following will occur
            else {
                finalWord += chArray[i];
            }
        } // for loop

        char[] chArray2 = finalWord.toCharArray(); // New Char array
        byte[] encryptedData = new byte[finalWord.getBytes().length]; // Creating a new byte array for the changed data

        // Loop to encrypt the finalWord String
        for (int i = 0; i < finalWord.getBytes().length; i++) {
            // If the character is a letter the following will occur
            if (Character.isLetter(chArray2[i])) {
                encryptedData[i] = (byte) (finalWord.getBytes()[i] + n); // Adding n to its ascii value
            }
            // If the data is not in the alphabet the following will occur
            else {
                encryptedData[i] = (byte) finalWord.getBytes()[i];
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

        // Prompting user for a keyword
        String keyword = Prompt.askString("Please enter a keyword");

        String finalString = encrypter(keyword + fileData, n);
        PrintWriter output = Prompt.getPrintWriter(new File("EncryptedPartB.txt")); // Outputting the data to a new file
        output.print(finalString); // Outputting the data
        output.close(); // Closing the output stream

        // Outputting the file that the new data is in
        System.out.println("Data Secured in EncryptedPartB.txt");

    } // main Method

} // CrackTheCodePartB Class