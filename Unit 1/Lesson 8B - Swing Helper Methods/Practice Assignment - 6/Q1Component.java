/*
* Date: October 8, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class creates 1 smiley face
*
* Method List: 
* 1. void paintComponent(Graphics g) = This method paints the graphical components
* 2. void paintFace(Graphics g) = This method paints a happy face
*
*/

// Import Statements
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JComponent;
import java.awt.Color;

public class Q1Component extends JComponent {

    // Serializable identifier for Serializable classes
    private static final long serialVersionUID = -1980367980442594024L;

    // Constructor
    public Q1Component() {

        super();
        this.setPreferredSize(new Dimension(300, 300));

    } // Q1Component Constructor

    // This method paints the graphical components
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        paintFace(g);

    } // paintComponent Method

    // This method paints a happy face
    private void paintFace(Graphics g) {

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

    } // paintFace Method

} // Q1Component Public Class
