
//import java.io.*;
import java.util.Scanner;

public class Prompt {
    private static final Scanner in = new Scanner(System.in);

    //
    // Reads console input and checks if it is the correct type (int)
    //
    public static int getInt(String prompt) {
        //
        // Loop until a valid entry is received
        //
        while (true) {
            //
            // Get input
            //
            System.out.println(prompt);

            //
            // Check if it is an integer
            //
            if (Prompt.in.hasNextInt()) {
                // Integer inputted, return result
                int answer = Prompt.in.nextInt();
                Prompt.in.nextLine();
                return answer;
            } else {
                // Invalid data type entered
                String input = Prompt.in.nextLine();
                System.out.println("Error:" + input + " is not an integer.");
            }
        }
    } // getInt Method

    /**
     * This method returns an integer that is within a certain range
     * 
     * @param prompt
     * @param low
     * @param high
     * @return
     */
    public static int getIntInRange(String prompt, int low, int high) {

        while (true) {
            System.out.println(prompt); // Prompting user
            if (Prompt.in.hasNextInt()) {
                int answer = Prompt.in.nextInt(); // Getting integer answer

                // If the answer is not within the range the following will occur
                if (answer < low || answer > high) {
                    System.out.println("Error! " + answer + " is not between " + low + " and " + high); // Output error
                                                                                                        // message
                }
                // If it is within the range the following will occur
                else {
                    Prompt.in.nextLine();
                    return answer;
                }
            } else {
                // Invalid data type entered
                String input = Prompt.in.nextLine();
                System.out.println("Error:" + input + " is not an integer.");
            }
        } // while loop

    } // getIntInRange Method

    /**
     * This method returns a float value that is within a certain range
     * 
     * @param prompt
     * @param low
     * @param high
     * @return
     */
    public static float getFloatInRange(String prompt, float low, float high) {

        while (true) {
            System.out.println(prompt); // Prompting user
            if (Prompt.in.hasNextFloat()) {
                float answer = Prompt.in.nextFloat(); // Getting float answer

                // If the answer is not within the range the following will occur
                if (answer < low || answer > high) {
                    System.out.println("Error! " + answer + " is not between " + low + " and " + high); // Output error
                                                                                                        // message
                }
                // If it is within the range the following will occur
                else {
                    Prompt.in.nextLine();
                    return answer;
                }
            } else {
                // Invalid data type entered
                String input = Prompt.in.nextLine();
                System.out.println("Error:" + input + " is not a floating point number!.");
            }
        } // while loop

    } // getFloatInRange Method

    /**
     * This method returns a double value that is within a certain range
     * 
     * @param prompt
     * @param low
     * @param high
     * @return
     */
    public static double getDoubleInRange(String prompt, double low, double high) {

        while (true) {
            System.out.println(prompt); // Prompting user
            if (Prompt.in.hasNextDouble()) {
                double answer = Prompt.in.nextDouble(); // Getting float answer

                // If the answer is not within the range the following will occur
                if (answer < low || answer > high) {
                    System.out.println("Error! " + answer + " is not between " + low + " and " + high); // Output error
                                                                                                        // message
                }
                // If it is within the range the following will occur
                else {
                    Prompt.in.nextLine();
                    return answer;
                }
            } else {
                // Invalid data type entered
                String input = Prompt.in.nextLine();
                System.out.println("Error:" + input + " is not a double!.");
            }
        } // while loop

    } // getDoubleInRange Method

    public static void main(String[] args) {

        // int testIntInput = 0;

        // testIntInput = Prompt.getInt("Enter an integer");
        // System.out.printf("%d was input %n", testIntInput);

        // Testing the getIntInRange Method
        int testInt = Prompt.getIntInRange("Enter an Integer between 1-10", 1, 10);
        System.out.println("Input was " + testInt);

        // Testing the getFloatInRange Method
        float testFloat = Prompt.getFloatInRange("Enter a float between 1.5 and 3.5", 1.5F, 3.5F);
        System.out.println("Input was " + testFloat);

        // Testing the getDoubleInRange Method
        double testDouble = Prompt.getDoubleInRange("Enter a double between 1.5 and 5.5", 1.5, 5.5);
        System.out.println("Input was " + testDouble);

    }
}