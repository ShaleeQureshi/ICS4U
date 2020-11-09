
/*
* Last Modified: November 9, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class has the solution to question 1 using a HashSet
*
* Constructor List:
* 1. public PrimeNumbers()
*
* Method List:
* 1. public static void main(String[] args) = This method runs the entire program
* 2. public boolean checkifPrime(int value) = This method checks to see if the value passed in is a prime number
* 3. public int promptInt() = This method prompts the user for an integer
*
* Helper Methods List:
* 1. private void populateSetWithPrimes() = This method populates the HashSet with prime numbers
* 2. private boolean isPrimeVal(int val) = This method checks to see if the current number is a prime value
*
*/
// Import Statements
import java.util.HashSet;
import javax.swing.JOptionPane;

public class PrimeNumbers {

    // Instance Variable
    private HashSet<Integer> set;

    /**
     * Constructor
     */
    public PrimeNumbers() {
        this.set = new HashSet<Integer>();
        this.populateSetWithPrimes();
    } // Constructor

    /**
     * This method checks to see if the value passed in is a prime number
     * 
     * @param value
     * @return whether the number is a prime number of not
     */
    public boolean checkifPrime(int value) {
        return this.set.contains(value);
    } // checkifPrime Method

    /**
     * This method prompts the user for an integer
     * 
     * @return the integer
     */
    public int promptInt() {
        int val = 0;
        try {
            val = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an Integer"));
            return val;
        } catch (NumberFormatException error) {
            System.err.println(error.getMessage());
            System.exit(1);
        }
        return val;
    } // promptInt Method

    // Helper Methods

    /**
     * This method populates the HashSet with prime numbers
     */
    private void populateSetWithPrimes() {

        for (int i = 2; i <= 10000; i++) {
            if (isPrimeVal(i)) {
                this.set.add(i);
            }
        }
    } // populateSetWithPrimes Method

    /**
     * This method checks to see if the current number is a prime value
     * 
     * @param val
     * @return whether the value is a prime number or not
     */
    private boolean isPrimeVal(int val) {
        for (Integer index : this.set) {
            if (val % index == 0) {
                return false;
            }
        }
        return true;
    } // isPrimeVal Method

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {
        PrimeNumbers pNum = new PrimeNumbers();
        int val = pNum.promptInt();
        if (pNum.checkifPrime(val)) {
            JOptionPane.showMessageDialog(null, val + " is a prime number!");
        } else {
            JOptionPane.showMessageDialog(null, val + " is not a prime number!");

        }
    } // main Method

} // PrimeNumbers Class
