/*
* Date: October 1, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class extends the Icon superclass and creates a custom tree icon
*
* Class List:
* 1. public class TreeIcon
* 2. local class TreeIconObject
*
* Method List: 
* TreeIconObject Class Methods
* 1. void paintIcon(Graphics g) = This method creates the graphical components
*
* Constructor List for class TreeIcon:
* 1. TreeIcon()
*
* Constructor List for local class TreeIconObject
* 1. TreeIconObject()
*/

// Import Statements
import becker.robots.City;
import becker.robots.Thing;
import becker.robots.icons.Icon;
import java.awt.Graphics;
import java.awt.Color;

public class TreeIcon extends Thing {

    // Constructor
    public TreeIcon(City city, int street, int avenue) {
        super(city, street, avenue);
        TreeIconObject treeIconObject = new TreeIconObject();
        this.setIcon(treeIconObject);
        this.setCanBeCarried(false);
    } // Constructor

} // Tree Class

class TreeIconObject extends Icon {

    // Constructor
    public TreeIconObject() {
        super();
    } // Constructor

    // This method creates the graphical components
    public void paintIcon(Graphics g) {

        // Bottom
        g.setColor(Color.BLACK);
        g.fillOval(50, 70, 20, 20);

        // Trunk
        g.setColor(new Color(165, 42, 42));
        g.fillRect(30, 10, 30, 90);

        // Bush
        g.setColor(Color.GREEN);
        g.fillOval(20, 0, 50, 50);

    } // paintIcon Method

} // TreeIconObject Local Class