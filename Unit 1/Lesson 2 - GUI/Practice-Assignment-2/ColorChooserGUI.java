/*
* Date: September 28, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: Creates a GUI that contains a JColorChooser
*
* Method List: 
* 1. main(final String[] args) = Main Method
*/

// Import Statements
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChooserGUI {

    public static void main(String[] args) {

        // Instantiating Objects
        JFrame myFrame = new JFrame("ColorChooserGUI by Shalee Qureshi");
        JPanel myPanel = new JPanel();
        JColorChooser myColorChooser = new JColorChooser();

        myPanel.add(myColorChooser); // Adding the JColorChooser to the JPanel
        myFrame.setContentPane(myPanel); // Adding the JPanel to the JFrame
        myFrame.pack();
        myFrame.setLocationRelativeTo(null); // This allows the JFrame to open in the middle of the screen
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Making the program end if the user exits the JFrame
        myFrame.setVisible(true); // Making the JFrame Visible

    } // main Method

} // ColorChooser Class
