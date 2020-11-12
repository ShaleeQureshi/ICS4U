import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Test {

    public static ArrayList<Integer> AbubbleSortAscending(HashSet<Integer> a) {
        ArrayList<Integer> array = new ArrayList<Integer>(a);
        int arrayLength = array.size() - 1; // Placeholder value for the array's length - 1
        boolean continueLoop; // Flag

        // Loop to continue while the array is unsorted
        do {
            continueLoop = false; // Setting the Flag to false

            // Loop to traverse the array
            for (int j = 0; j < arrayLength; j++) {
                // If the current index is smaller than the adjacent index the following will
                // occur
                if (array.get(j) > array.get(j + 1)) {
                    int temp = array.get(j); // Creating a temp variable
                    // Swapping the current index with its adjacent index
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                    continueLoop = true; // Setting the Flag to true
                }
            } // for loop

            arrayLength--; // Subtracting 1 from the loop counter to narrow in on the array

        } while (continueLoop); // While the Flag is true we keep traversing the array

        return array;

    } // bubbleSortAscending Method

    public static void main(String[] args) {
        HashSet<Integer> intList = new HashSet<Integer>(); // Instantiating an HashSet
        intList.add(9);
        intList.add(3);
        intList.add(23);
        intList.add(1);
        intList.add(0);
        intList.add(90);
        intList.add(-1231290);
        intList.add(91231230);
        intList.add(91230);
        System.out.println("Unsorted");
        for (Integer integer : intList) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println("Sorted");
        ArrayList<Integer> newArray = AbubbleSortAscending(intList);
        for (Integer integer : newArray) {
            System.out.print(integer + " ");
        }

    }
}
