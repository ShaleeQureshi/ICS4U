import becker.robots.*;

public class Test {
    public static void main(String[] args) {

        int count = 0; // Initializing it to 0

        // For loop starting at -10 and running until its not < 10
        for (int idx = -10; idx < 10; idx = idx + 3) {
            // If idx is an even number or if its less than 0 the following will occur
            if (idx % 2 == 0 || idx < 0) {
                System.out.println(idx); // Output idx
                count++; // Add 1 to count
            }
        } // for loop
        System.out.println("Count = " + count); // Output the count
    }
}