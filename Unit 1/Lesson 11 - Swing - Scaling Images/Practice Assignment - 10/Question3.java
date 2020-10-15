/*
* Date: October 13, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class runs the solution to the third problem
*
* Constructor List:
* 1. Question3()
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

public class Question3 extends JComponent {

    // Constructor
    public Question3() {
        super();
        Dimension prefSize = new Dimension(250, 250);
        this.setPreferredSize(prefSize);
    } // Constructor

    // This method creates the graphical components
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g; // Casting the Graphics Object to a 2D Graphics Object
        g2.scale(this.getWidth() / 10, this.getHeight() / 10); // Adjusting the scale
        g2.setStroke(new BasicStroke(1.0F / this.getWidth()));

        // Loop to draw an oval repeatedly
        for (int i = 0; i < 5; i++) {

            // If the value of i is even the following will occur
            if (i % 2 == 0) {
                g.setColor(Color.GREEN); // Setting the color to Green
            }
            // If the value of i is odd the following will occur
            else {
                g.setColor(Color.RED); // Setting the color to Red
            }

            // Filling the oval
            g2.fillOval(i, i, 10 - i * 2, 10 - i * 2);

        } // for loop

    } // paintComponent Method

    // This method runs the entire program
    public static void main(String[] args) {

        // Instantiating Objects
        JFrame jframe = new JFrame();
        JPanel jpanel = new JPanel();

        jpanel.add(new Question3()); // Adding the Question3 JComponent to the JPanel

        jframe.setContentPane(jpanel); // Adding the JPanel to the JFrame

        // Altering JFrame settings
        jframe.setLocationRelativeTo(null);
        jframe.pack();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true); // Making the JFrame visible

    } // main Method

} // Question3 Class
