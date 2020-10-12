/*
* Date: October 1, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class extends the Icon superclass and creates a custom car icon
*
* Method List: 
* 1. void paintIcon(Graphics g) = This method creates the graphical components
*
* Constructor List:
* 1. CarIcon()
*/

// Import Statements
import becker.robots.icons.Icon;
import java.awt.Color;
import java.awt.Graphics;

public class CarIcon extends Icon {

    // Constructor
    public CarIcon() {
        super();
    } // Constructor

    // This method creates the graphical components
    public void paintIcon(Graphics g) {

        // Box (car body)
        g.setColor(Color.BLACK);
        g.fillRect(30, 10, 30, 90);
        g.fillRect(10, 30, 20, 40);

        // Oval (car wheels)
        g.setColor(Color.BLACK);
        g.fillOval(50, 20, 20, 20);
        g.fillOval(50, 70, 20, 20);

    } // paintIcon Method

} // CarIcon Class