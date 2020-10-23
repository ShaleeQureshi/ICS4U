/*
* Date: October 23, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class has the solution to question 1
*
* Method List:
* 1. static void main(String[] args) = This method runs the entire program
*
*/
public class DataTypesConversion {

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Prompting user for a Binary number
        String binaryNum = Prompt.askString("Please enter the Binary Number");

        String word = ""; // The word (this value will store the final converted value)

        // Declaring a String array to hold the broken up 8 bits (8 digits)
        String[] binaryBits = new String[binaryNum.length() / 8];

        // Populating the String array with data
        for (int i = 0; i < binaryBits.length; i++) {
            binaryBits[i] = binaryNum.substring(i * 8, i * 8 + 8); // Adding every 8 sets of digits to the array
        } // for loop

        // Loop to convert each binary bit to a decimal value then to an ascii and then
        // to concatenate it to a String
        for (int i = 0; i < binaryBits.length; i++) {
            word = word + (char) Integer.parseInt(binaryBits[i], 2);
        } // for loop

        System.out.println(word); // Outputting the word

    } // main Method

} // DataTypesConversion Class