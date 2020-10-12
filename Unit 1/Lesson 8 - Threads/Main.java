/*
* Date: October 7, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class runs the entire program
*
* Method List: 
* 1. void main(String[] args) = This method runs the entire program
*
* Dependences:
* 1. becker.jar
*/

// Import Statements
import becker.robots.City;
import becker.robots.Direction;

public class Main {

    // This method runs the entire program
    public static void main(String[] args) {

        // Instantiating Objects
        City city = new City();
        ThreadMain threads[] = new ThreadMain[4]; // Array of ThreadMain Objects
        Thread newThreads[] = new Thread[4]; // Array of Threads

        // Initializing Array of ThreadMain Objects
        threads[0] = new ThreadMain(city, 3, 3, Direction.NORTH);
        threads[1] = new ThreadMain(city, 3, 4, Direction.EAST);
        threads[2] = new ThreadMain(city, 4, 4, Direction.SOUTH);
        threads[3] = new ThreadMain(city, 4, 3, Direction.WEST);

        // Loop to initialize the Thread Objects with the ThreadMain Objects
        for (int i = 0; i < threads.length; i++) {

            newThreads[i] = new Thread(threads[i]); // Initializing the threads
            newThreads[i].start(); // Starting the threads

        } // for loop

    } // main Method

} // Main Class