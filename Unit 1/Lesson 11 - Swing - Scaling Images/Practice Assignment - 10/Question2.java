/*
* Date: October 13, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class runs the solution to the second problem
*
* Constructor List:
* 1. Question2()
*
* Method List: 
* 1. void paintComponent(Graphics g) = This method creates the graphical components
* 2. main(final String[] args) = This method runs the entire program
*
*/

// Import Statements
import javax.swing.JComponent;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Question2 extends JComponent {

    // Constructor
    public Question2() {
        super();
        Dimension prefSize = new Dimension(90, 180);
        this.setPreferredSize(prefSize);
    } // Constructor

    // This method creates the graphical components
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g; // Casting the Graphics Object to a 2D Graphics Object
        g2.scale(this.getWidth() / 6, this.getHeight() / 9); // Adjusting the scale
        g2.setStroke(new BasicStroke(1.0F / this.getWidth()));

        // Loop to draw a line repeatedly
        for (int i = 0; i < 10; i++) {
            g2.drawLine(1, 1, 10, i); // Drawing the lines
        } // for loop

    } // paintComponent Method

    // This method runs the entire program
    public static void main(String[] args) {

        // Instantiating Objects
        JFrame jframe = new JFrame();
        JPanel jpanel = new JPanel();

        jpanel.add(new Question2()); // Adding the Question2 JComponent to the JPanel

        jframe.setContentPane(jpanel); // Adding the JPanel to the JFrame

        // Altering JFrame settings
        jframe.setLocationRelativeTo(null);
        jframe.pack();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true); // Making the JFrame visible

    } // main Method

} // Question2 Class
