/*
* Date: October 6, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class creates a graphical icon
*
* Constructor List:
* 1. VaultIcon()
*
* Method List:
* 1. paintIcon(Graphics g) = This method creates the graphical components
*
* Dependences:
* 1. becker.jar
*/

// Import Statements
import becker.robots.icons.Icon;
import java.awt.*;

public class VaultIcon extends Icon {

    // Constructor
    public VaultIcon() {
        super();
    } // Constructor

    // This method creates the graphical components
    public void paintIcon(Graphics g) {

        // Drawing the rectangle
        g.drawRect(0, 0, 20, 100);

        // Filling the rectangle with colours
        g.setColor(Color.RED);
        g.fillRect(0, 0, 20, 20);
        g.setColor(Color.WHITE);
        g.fillRect(0, 20, 20, 20);
        g.setColor(Color.RED);
        g.fillRect(0, 40, 20, 20);
        g.setColor(Color.WHITE);
        g.fillRect(0, 60, 20, 20);
        g.setColor(Color.RED);
        g.fillRect(0, 80, 20, 20);

    } // paintIcon Method

}// end of class