
import becker.robots.*;

public class SnowMain {
   public static void main(String[] args) throws InterruptedException {
      City c = new City("SnowCity.txt");

      // Create Shovel Bot objects
      ShovelBot jeeven = new ShovelBot(c, 0, 2, Direction.SOUTH);
      ShovelBot basmala = new ShovelBot(c, 0, 2, Direction.SOUTH);

      // Creating the Threads
      Thread jeevan2 = new Thread(jeeven);
      Thread basmala2 = new Thread(basmala);

      // Insert Code here
      basmala.basmalaMove();

      jeevan2.start();
      basmala2.start();

   }// end of main
}// end of class