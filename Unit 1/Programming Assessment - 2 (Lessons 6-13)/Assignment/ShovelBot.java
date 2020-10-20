/*
* Date: October 19, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This contains the services for the assignment
*
* Dependences:
* 1. becker.jar
*/

// Import Statements
import becker.robots.*;

public class ShovelBot extends RobotSE implements Runnable {

     private int snowcount = 0; // Instance Variable

     /**
      * 
      * @param city
      * @param street
      * @param avenue
      * @param direction
      */
     public ShovelBot(City city, int street, int avenue, Direction direction) {
          super(city, street, avenue, direction);
     }

     @Override
     public void run() {
          this.clearSnow();
     }

     public void clearSnow() {
          this.canPick();
          // While the front is clear and its street is less than 9 the following will
          // occur
          while (this.frontIsClear() && this.getStreet() < 9) {
               this.clearDriveway();
          }
          this.turnRight();
          this.clearSnow(); // Recalling this method

     }

     // Check east of current location for a driveway
     private boolean checkForDriveWay() {

          this.turnLeft(); // turn east

          // If front is clear there is a driveway
          if (this.frontIsClear()) {
               this.canPick();
               // Driveway detected
               this.move();
               return true;
          } else {
               // No driveway
               this.turnRight();
               return false;
          }
     }// end of checkForDriveWay()

     /**
      * This method clears the driveway
      */
     private void clearDriveway() {
          // If there is no driveway the following will occur
          if (!this.checkForDriveWay()) {
               this.canPick();
               this.move();
          }
          this.checkForDriveWay();

     }

     private void canPick() {
          // If this can pick something up the following will occur
          if (this.canPickThing()) {
               this.pickThing();
               this.snowcount++; // Adding 1 to the count
          }
     }

     public void basmalaMove() {
          while (this.getStreet() < 6) {
               this.move();
          }
     }

     public int getSnowCount() {
          return this.snowcount;
     }

}// end of Class
