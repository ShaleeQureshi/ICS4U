/*
* Date: October 8, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class runs the entire program
*
* Method List: 
* 1. void main(String[] args) = This method runs the entire program
*
*/

// Import Statements
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Q1static {

    // This method runs the entire program
    public static void main(String[] args) {

        // Instantiating Objects
        JFrame frame = new JFrame("Shahrukh Qureshi");
        JPanel panel = new JPanel();

        // Creating SmileyFaces
        Q1Component face1 = new Q1Component();
        Q1Component face2 = new Q1Component();

        // Adding the faces to the JPanel
        panel.add(face1);
        panel.add(face2);

        // Adding the JPanel to the JFrame
        frame.setContentPane(panel);

        // Adjusting the JFrame properties
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    } // main Method

} // Q1static Class
