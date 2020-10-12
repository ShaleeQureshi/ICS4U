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
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Q2static {

    // This method runs the entire program
    public static void main(String[] args) {

        // Instantiating Objects
        JFrame frame = new JFrame("Shahrukh Qureshi");
        JPanel panel = new JPanel();

        // ImageIcon objects cannot be added to JPanel unless it is on a JLabel
        JLabel lblPic = new JLabel(new ImageIcon("./4-leaf-clover.png"));

        // Adding the label to the JPanel
        panel.add(lblPic);

        // Adding the JPanel to the JFrame
        frame.setContentPane(panel);

        // Adjusting the JFrame properties
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    } // main Method

} // Q2static Class
