/*
* Date: October 1, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class extends the wall class to create a building that the robot cannot pickup or go through
*
* Class List:
* 1. public class BuildingIcon
* 2. local class BuildingIconObject
*
* Method List: 
* BuildingIconObject Class Methods
* 1. void paintIcon(Graphics g) = This method creates the graphical components
*
* Constructor List for class BuildingIcon:
* 1. BuildingIcon()
*
* Constructor List for local class BuildingIconObject
* 1. BuildingIconObject()
*
*/

// Import Statements
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Wall;
import becker.robots.icons.Icon;
import java.awt.Graphics;
import java.awt.Color;

public class BuildingIcon extends Wall {

    // Constructor
    public BuildingIcon(City city, int street, int avenue, Direction direction) {

        super(city, street, avenue, direction);
        BuildingIconObject buildingIconObject = new BuildingIconObject();
        this.setIcon(buildingIconObject);

    } // Constructor

} // BuildingIcon Public Class

class BuildingIconObject extends Icon {

    // Constructor
    public BuildingIconObject() {
        super();
    } // Constructor

    // This method creates the graphical components
    public void paintIcon(Graphics g) {

        // Building
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 50, 100);

    } // paintComponent Method

} // BuildingIconObject Local Class
