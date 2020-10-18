/*
* Date: October 17, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: Creates a program that allows the user to input their name and the cost of a number of items and it calculates the tax + total cost of those items
*
* Method List: 
* 1. static double getValue(Scanner input, String prompt) = This method will ensure only a double value is inputted
* 2. static int getInt(Scanner input, String prompt) = This method ensures only an integer value is entered
* 3. main(final String[] args) = This method runs the entire program
*
*/

// Import Statements
import java.util.Scanner;

public class BillCalculator {

    /**
     * This method will ensure only a double value is inputted
     * 
     * @param prompt
     * @return
     */
    private static double getValue(Scanner input, String prompt) {

        // Loop to ensure the valid input is entered
        while (true) {
            System.out.println(prompt); // Prompting user

            // If a double is entered the following will occur
            if (input.hasNextDouble()) {
                double answer = input.nextDouble(); // Getting the value
                input.nextLine();
                return answer; // Returning it
            }
            // If an invalid input is entered the following will occur
            else {
                String value = input.nextLine();
                System.out.println("Error:" + value + " is not a double value!");
            }
        } // while loop

    } // getValue Method

    /**
     * This method ensures only an integer value is entered
     * 
     * @param prompt
     * @return
     */
    public static int getInt(Scanner input, String prompt) {

        // Loop to ensure the valid input is entered
        while (true) {
            System.out.println(prompt); // Prompting user

            // If an integer is entered the following will occur
            if (input.hasNextInt()) {
                int answer = input.nextInt(); // Getting the value
                input.nextLine();
                return answer; // Returning it
            }
            // If an invalid input is entered the following will occur
            else {
                String value = input.nextLine();
                System.out.println("Error:" + value + " is not an integer.");
            }
        } // while loop

    } // getInt Method

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Initializing my Scanner
        Scanner input = new Scanner(System.in);

        // Declaring Variables
        String items[]; // To store a number of item names
        double itemCost[]; // To store a number of item costs
        double subtotal = 0;
        double tax = 0;
        double total = 0;

        // Prompting user
        int numItems = getInt(input, "Enter the number of items you wish to check out!");

        // Initializing Array Sizes
        items = new String[numItems];
        itemCost = new double[numItems];

        // Looping through the number of items
        for (int i = 0; i < numItems; i++) {
            System.out.println("Enter the name for item " + (i + 1));
            items[i] = input.nextLine();
            itemCost[i] = getValue(input, "Enter the cost for item " + (i + 1));
        } // for loop

        // Adding up all of the costs
        for (int i = 0; i < numItems; i++) {
            subtotal = subtotal + itemCost[i];
        } // for loop

        // Calculating the tax
        tax = subtotal * 0.13;

        // Calculating the finalCost
        total = tax + subtotal;

        // Outputting the data in a well formatted receipt
        System.out.println("----------------------------------");
        System.out.println("Items:\t\tCost:");

        // Looping through the arrays
        for (int i = 0; i < numItems; i++) {
            System.out.println("----------------------------------");
            System.out.println(items[i] + "\t\t$" + itemCost[i]);
        } // for loop

        // Outputting the subtotal, tax, and total
        System.out.println("----------------------------------");
        System.out.println("\tSubTotal: $" + subtotal);
        System.out.println("\tTax: $" + tax);
        System.out.println("\tTotal: $" + total);
        System.out.println("----------------------------------");
        System.out.println("Thank you for shopping with us!");

    } // main Method

} // BillCalculator Class
