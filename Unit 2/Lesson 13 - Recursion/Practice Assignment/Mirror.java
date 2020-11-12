
/*
* Last Modified: November 12, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class has the solution to question 4
*
* Method List:
* 1. public static void main(String[] args) = This method runs the entire program
*
* Helper Methods List:
* 1. private static String reverse(String s) = This method reverses the string
*
*/
import javax.swing.JOptionPane;

public class Mirror {

    /**
     * This method reverses the string
     * 
     * @param s
     * @return reversed string
     */
    private static String reverse(String s) {

        // If the length is 0 then we have reached the end of the String
        if (s.length() == 0) {
            return "";
        } else {
            return reverse(s.substring(1)).concat(s.substring(0, 1));
        }

    } // reverse Method

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Please enter a String");
        JOptionPane.showMessageDialog(null, reverse(input));
    } // main Method

}
