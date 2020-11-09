
/*
* Last Modified: November 9, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class has the solution to question 1 using an ArrayList
*
* Method List:
* 1. public static void main(String[] args) = This method runs the entire program
*
* Helper Methods List:
* 1. private static int promptInt() = This method prompts the user for a number
* 2. private static boolean continuePrompt() = This method will check to see if the user wants to continue entering data
* 3. private static int largestNum(ArrayList<Integer> listInt) = This method returns the largest number in a dataset 
* 4. private static double average(ArrayList<Integer> listInt) = This method determines the average of the numbers in a dataset
*
*/
// Import Statements
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LargestNumberArrayList {

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<Integer>(); // Instantiating an ArrayList

        while (true) {
            intList.add(promptInt());
            boolean val = continuePrompt();
            if (!val) {
                continue;
            } else {
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Thank you for using this program!");
        // Outputting the data
        System.out.println("Largest Number: " + largestNum(intList));
        System.out.println("Average: " + average(intList));

    } // main Method

    // Helper Methods

    /**
     * This method prompts the user for a number
     * 
     * @return the number entered
     */
    private static int promptInt() {
        int prompt = 0;
        try {
            prompt = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number"));
            return prompt;
        } catch (NumberFormatException error) {
            System.err.println(error.getMessage());
            System.exit(1);
        }
        return prompt; // Return Statement

    } // promptInt Method

    /**
     * This method will check to see if the user wants to continue entering data
     * 
     * @param data
     * @return
     */
    private static boolean continuePrompt() {
        String continueAsking = JOptionPane.showInputDialog(null, "Would you like to continue (Y/N) ?");
        return continueAsking.contains("N") || continueAsking.contains("n");
    } // continuePrompt Method

    /**
     * This method returns the largest number in a dataset
     * 
     * @param listInt
     * @return largest number in a dataset
     */
    private static int largestNum(ArrayList<Integer> listInt) {
        int val = 0;
        for (Integer currentValue : listInt) {
            if (val < currentValue) {
                val = currentValue;
            }
        } // for loop
        return val;

    } // largestNum Method

    /**
     * This method determines the average of the numbers in a dataset
     * 
     * @param listInt
     * @return the average
     */
    private static double average(ArrayList<Integer> listInt) {
        int sum = 0;
        for (Integer currentValue : listInt) {
            sum = sum + currentValue;
        } // for loop
        return 1.0 * sum / listInt.size();

    } // average Method

} // LargestNumberArrayList Class