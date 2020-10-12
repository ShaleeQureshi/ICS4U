/*
* Date: October 6, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class sets the Icon for the Vault (wall)
*
* Constructor List:
* 1. Vault(City city, int street, int avenue, Direction direction)
*
* Dependences:
* 1. becker.jar
*/

// Import Statements
import becker.robots.*;

public class Vault extends Wall {

    // Constructor
    public Vault(City city, int street, int avenue, Direction direction) {
        super(city, street, avenue, direction);
        VaultIcon icon = new VaultIcon(); // Instantiating an object for the icon
        this.setIcon(icon); // Setting this icon to the vault icon
    } // Constructor

}// end of class