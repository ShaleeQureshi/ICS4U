/*
* Date: September 30, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: Creates a smiley face JComponent
*
* Method List: 
* 1. void paintComponent(Graphics g) = This method paints the graphics on the JFrame
*
* Constructor List:
* 1. SmileyFace()
*
* SuperClass List:
* 1. JComponent
*/

// Import Statements
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class SmileyFace extends JComponent {

    // Serializable identifier for Serializable classes
    private static final long serialVersionUID = -6063795731719347846L;

    // Constructor
    public SmileyFace() {
        super();
        this.setPreferredSize(new Dimension(300, 300)); // Setting the dimensions
    } // Constructor

    // This method paints the graphics on the JFrame
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Head
        g.setColor(Color.CYAN);
        g.fillOval(20, 20, 250, 250);
        g.setColor(Color.BLACK);
        g.drawOval(20, 20, 250, 250);

        // Eyes
        g.setColor(Color.BLUE);
        g.fillOval(60, 70, 50, 50);
        g.fillOval(200, 70, 50, 50);

        // Mouth (smile)
        g.drawArc(70, 110, 160, 150, 180, 180);
    }

} // SmileyFace Class