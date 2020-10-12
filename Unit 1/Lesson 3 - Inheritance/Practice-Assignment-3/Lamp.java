/*
* Date: September 29, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class extends the Thing class and creates a lamp that can turn on and off
*
* Method List: 
* 1. void turnOn() = This method turns the lamp on
* 2. void turnOff() = This method turns the lamp off
*
* Constructor List:
* 1. Lamp(City city, int street, int avenue)
*/

// Import Statements
import becker.robots.*;
import becker.robots.icons.CircleIcon;
import java.awt.*;

public class Lamp extends Thing {

    // Private variables to represent the 2 states of the lamp
    private CircleIcon lampOn = new CircleIcon(new Color(168, 151, 50), 0.7);
    private CircleIcon lampOff = new CircleIcon(new Color(28, 24, 10), 0.5);

    public Lamp(City city, int street, int avenue) {
        super(city, street, avenue);
        lampOn.setTransparency(0.1);
        this.setIcon(lampOff);
    } // Constructor

    // This method turns the lamp on
    public void turnOn() {
        this.setIcon(lampOn);
    } // turnOn Method

    // This method turns the lamp off
    public void turnOff() {
        this.setIcon(lampOff);
    } // turnOff Method

} // Lamp Class
