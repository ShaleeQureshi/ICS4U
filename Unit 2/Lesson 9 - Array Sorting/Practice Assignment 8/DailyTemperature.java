
/*
* Last Modified: October 27, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the solution to question 3 -> Daily Temperatures
*
* Method List:
* 1. static void main(String[] args) = This method runs the entire program
*
*/
// Import Statements
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DailyTemperature {

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        String fileName = Prompt.getString("Please enter a file");

        try {
            FileReader fileR = new FileReader(fileName);
            BufferedReader read = new BufferedReader(fileR);

            int[] dataSize = new int[11];
            System.out.println(dataSize.length);

            for (int i = 0; i < dataSize.length; i++) {
                dataSize[i] = Integer.parseInt(read.readLine());
            } // for loop

            fileR.close();
            read.close();

            DailyTempArrayStats stats = new DailyTempArrayStats(dataSize);

            System.out.println(stats.getMax());
            System.out.println(stats.getMin());
            System.out.println(stats.getAverage());
            System.out.println(stats.getHighNum());
            System.out.println(stats.getSum());
            System.out.println(stats.getTempDataPoints());

            System.out.println("Sorted Data");
            dataSize = SortingMethods.insertionSortAscending(dataSize); // Sorting the data
            int[] copyArray = stats.getUserArray();
            // Loop to output the data from the arrays
            for (int i = 0; i < dataSize.length; i++) {
                System.out.println("Old Data: " + copyArray[i] + "\tNew Data: " + dataSize[i]);
            } // for loop

        } catch (FileNotFoundException error) {
            System.out.println(error.getMessage());
            System.exit(1);
        } catch (IOException error) {
            System.out.println(error.getMessage());
            System.exit(1);
        }

    } // main Method

} // DailyTemperature Class
