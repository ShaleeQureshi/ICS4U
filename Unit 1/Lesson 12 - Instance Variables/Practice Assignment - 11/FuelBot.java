/*
* Date: October 15, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class runs the solution to the second problem (FuelBot)
*
* Constructor List:
* 1. FuelBot(City city, int street, int avenue, Direction direction, int fuel)
*
* Method List: 
* 1. void move() = This method overrides the superclass move method
* 2. void refuel() = This method will add 1 unit to the fuel tank whenever it picks up a Thing
* 3. void main(String[] args) = This method runs the entire program
*
*/

// Import Statements
import becker.robots.*;
import javax.swing.JOptionPane;

public class FuelBot extends Robot {

    // Declaring variables
    private int fuelTank = 0; // Initial value of the fuel tank

    /**
     * Default Constructor creating a Robot
     * 
     * @param city
     * @param street
     * @param avenue
     * @param direction
     */
    public FuelBot(City city, int street, int avenue, Direction direction, int fuel) {
        super(city, street, avenue, direction);
        this.fuelTank = fuel; // Updating the value with user specified value
    } // Constructor

    /**
     * This method overrides the superclass move method
     */
    @Override
    public void move() {
        if (this.fuelTank == 0) {
            JOptionPane.showMessageDialog(null, "You are out of fuel!");
        } else {
            super.move(); // Calling the superclass move method
            this.fuelTank--;
        }
    } // move Method

    /**
     * This method will add 1 unit to the fuel tank whenever it picks up a Thing
     */
    public void refuel() {
        super.pickThing();
        this.fuelTank++;
    } // refuel Method

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Instantiating Objects
        City city = new City();
        FuelBot robot = new FuelBot(city, 1, 0, Direction.EAST, 5);
        new Thing(city, 1, 4);

        // Moving the robot
        /**
         * What will happen: It will move 4 times, refuel then move again, attempt to
         * move again until an error message is shown
         */
        robot.move();
        robot.move();
        robot.move();
        robot.move();
        robot.refuel();
        robot.move();
        robot.move();
        robot.move();

    } // main Method

} // FuelBot Class
