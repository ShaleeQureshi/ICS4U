/*
* Date: October 1, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class extends the wall class to create a lake graphic for the wall
*
* Class List:
* 1. public class Lake
* 2. local class LakeIcon
*
* Method List: 
* LakeIcon Class Methods
* 1. void paintIcon(Graphics g) = This method creates the graphical components
*
* Constructor List for class Lake:
* 1. Lake()
*
* Constructor List for local class LakeIcon
* 1. LakeIcon()
*
*/

// Import Statements
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Wall;
import becker.robots.icons.Icon;
import java.awt.Graphics;
import java.awt.Color;

public class Lake extends Wall {

    // Constructor
    public Lake(City city, int street, int avenue, Direction direction) {
        super(city, street, avenue, direction);
        LakeIcon lakeIcon = new LakeIcon();
        this.setIcon(lakeIcon);
    } // Constructor

} // Lake Public Class

class LakeIcon extends Icon {

    // Constructor
    public LakeIcon() {
        super();
    } // Constructor

    // This method paints the graphical components
    public void paintIcon(Graphics g) {

        g.setColor(Color.BLUE);
        g.fillOval(0, 0, 100, 100);

    } // paintIcon Method

} // LakeIcon Local Class