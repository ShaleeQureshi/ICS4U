/*
* Date: September 30, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: Tests the SmileyFace JComponent
*
* Method List: 
* 1. void main(String[] args) = This method runs the entire program
*
* Constructor List:
* 1. SmileyFaceTest() 
*
* SuperClass List:
* 1. JFrame
*/

// Import Statements
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SmileyFaceTest extends JFrame {

    // Serializable identifier for Serializable classes
    private static final long serialVersionUID = 3531260903762299466L;

    // Constructor
    public SmileyFaceTest() {

        super("SmileyFaceTest by Shalee Qureshi");

        // Instantiating objects
        JPanel panel = new JPanel();
        SmileyFace face = new SmileyFace();
        JButton btnSmiley = new JButton("Smile");

        // Add JComponents to the JPanel
        panel.add(face);
        panel.add(btnSmiley);

        // Initializing JFrame
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
        setSize(300, 400);
        setVisible(true);

    } // Constructor

    // main Method
    public static void main(String[] args) {
        new SmileyFaceTest(); // Calling the constructor in this class to run the program
    } // main Method

} // SmileyFaceTest Class
