
/*
* Last Modified: October 27, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class manipulates the data in a text file
*
* Method List:
* 1. static void main(String[] args) = This method runs the entire program
* 2. static String encodeMsg(String message, int codeOffset) = This method changes the data
* 3. static Scanner getScanner(String prompt) = This method creates a Scanner Object
*/
// Import Statements
import java.util.*;
import java.io.*;
import javax.swing.*;

public class FileEncoder {

     /**
      * This method runs the entire program
      * 
      * @param args
      */
     public static void main(String[] args) {

          JFileChooser jfc = new JFileChooser(); // JFileChooser to let the user select a file
          jfc.setCurrentDirectory(new File(System.getProperty("user.dir"))); // This ensures the dialog opens the user's
                                                                             // current directory
          int option = jfc.showOpenDialog(null); // Opening up the JFileChooser with no component

          // If the user selected a file the following will occur
          if (option == JFileChooser.APPROVE_OPTION) {

               Scanner input = getScanner(jfc.getSelectedFile().getPath()); // Creting a Scanner Object with the current
                                                                            // file's path

               input.useDelimiter("\\s+"); // Ensuring we can read spaces

               String newFile = Prompt.getString("Please enter an output file (.txt)"); // Prompting user for a new file

               int offSet = Prompt.getInt("Please enter an Integer between -10 and 10", -11, 11); // Prompting user for
                                                                                                  // an offset between
                                                                                                  // -10 and 10
                                                                                                  // (inclusive)

               PrintWriter output = Prompt.getPrintWriter(newFile); // Instantiating a PrintWriter Object to output to a
                                                                    // user specified file

               String data = ""; // Represents the current data in the file
               String newMessage = ""; // Represents the newMessage

               // While there is some information in the current file the following will occur
               while (input.hasNext()) {
                    data = input.nextLine(); // Reading from the file
                    newMessage = encodeMsg(data, offSet); // Converting it to a new message based on the offset
                    System.out.println(newMessage);
                    output.println(newMessage); // Writing it to the file
               } // while loop
               output.close(); // Closing the file
               input.close(); // Closing the scanner
          }
          // If the user did not specify a file
          else {
               System.out.println("No File was selected");
          }

     }// end of main

     /**
      * This method encodes the new file
      * 
      * @param message
      * @param codeOffset
      * @return
      */
     public static String encodeMsg(String message, int codeOffset) {

          byte[] newData = new byte[message.getBytes().length]; // Creating a new byte array
          char[] array = message.toCharArray(); // Creating a char array

          // As long as there is data to iterate over this loop will run
          for (int i = 0; i < message.getBytes().length; i++) {
               // If the current character is uppercase the following will occur
               if (Character.isUpperCase(array[i])) {
                    // Adding it to the byte array (making it lowercase if it was uppercase) and
                    // changing its ascii value based on the offset
                    newData[i] = (byte) (Character.toLowerCase(array[i]) + codeOffset);
               }
               // If the current character is lowercase the following will occur
               else {
                    // Adding it to the byte array (making it uppercase if it was lowercase) and
                    // changing its ascii value based on the offset
                    newData[i] = (byte) (Character.toUpperCase(array[i]) + codeOffset);
               }
          } // for loop

          String returnData = new String(newData); // Converting the byte array to a String
          return returnData; // Returing the String

     } // end of encodeMsg

     /**
      * This method creates a Scanner Object
      * 
      * @param prompt
      * @return
      */
     public static Scanner getScanner(String prompt) {

          File file = new File(prompt);

          try {
               return new Scanner(file); // Returning the Scanner Object
          } catch (FileNotFoundException error) {
               System.out.println(error.getMessage());
               System.out.println("in " + System.getProperty("user.dir"));
               System.exit(1);
          }
          return null;

     } // end of getScanner

}// end of class
