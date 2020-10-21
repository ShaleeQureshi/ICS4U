
/*
* Date: October 21, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class has the solution to Part C of question 2
*
* Method List:
* 1. static String encrypter(String keyword, String data) = This method encrypts the given data
* 2. private static byte getByte(byte letter1, byte letter2, int ascii) = This method will determine which ascii value to replace the current value with
* 3. static void main(String[] args) = This method runs the entire program
*
*/
// Import Statements
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CrackTheCodePartC {

    /**
     * This method encrypts the given data
     * 
     * @param data
     * @return encrypted data
     */
    private static String encrypter(String keyword, String data) {

        int ASCII_VALUE_OF_A = 65; // Declaring a constant (Ascii value of A)

        data = data.toUpperCase();
        byte[] encryptedData = new byte[data.getBytes().length]; // Creating a new byte array for the changed data
        char[] chArray = data.toCharArray(); // Making a char array

        // Loop to change the data
        for (int i = 0; i < data.getBytes().length; i++) {

            // If the character is a letter the following will occur
            if (Character.isLetter(chArray[i]) && chArray[i] != ' ') {
                System.out.println(keyword.getBytes()[i] - ASCII_VALUE_OF_A);
                // encryptedData[i] = (byte) (data.getBytes()[i] + (keyword.getBytes()[i] -
                // ASCII_VALUE_OF_A - 1));
                encryptedData[i] = getByte(data.getBytes()[i], keyword.getBytes()[i], ASCII_VALUE_OF_A - 1);
            }
            // If the character is not a letter the following will occur
            else {
                encryptedData[i] = (byte) (data.getBytes()[i]);
            }

        } // for loop

        String returnString = new String(encryptedData);
        return returnString;

    } // encrypter Method

    /**
     * This method will determine which ascii value to replace the current value
     * with
     * 
     * @param letter1
     * @param letter2
     * @param ascii
     * @return the new ascii value
     */
    private static byte getByte(byte letter1, byte letter2, int ascii) {

        // If the current combination is greater than 90 (no longer a capital letter)
        // the following will occur
        if (letter1 + (letter2 - ascii) > 90) {
            int val = letter1 + (letter2 - ascii) - 90;
            return (byte) (ascii + val);
        } else {
            return (byte) (letter1 + (letter2 - ascii));
        }
    } // getByte Method

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Prompting user for a constant
        String keyword = Prompt.askString("Please enter a keyword");

        // Prompting user for a file
        File file = Prompt.getInputFile("Please enter the filename");

        // Initializing the Scanner
        Scanner input = Prompt.getInputScanner(file);

        // Reading from the given file
        String fileData = Prompt.readFile(input);

        String changedData = encrypter(keyword, fileData);

        PrintWriter output = Prompt.getPrintWriter(new File("EncryptedPartC" + file.getName())); // Outputting the data
                                                                                                 // to a new file
        output.println(changedData); // Outputting the data
        output.close(); // Closing the output stream

        // Outputting the file that the new data is in
        System.out.println("Data Secured in " + "EncryptedPartC" + file.getName());

    } // main Method

} // CrackTheCodePartC Class
