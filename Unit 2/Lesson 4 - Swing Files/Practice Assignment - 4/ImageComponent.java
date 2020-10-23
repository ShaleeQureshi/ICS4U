
/*
* Date: October 21, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class creates an ImageComponent 
*
* Constructor List:
* 1. ImageComponent(String fileName)
*
* Method List:
* 1. void paintComponent(Graphics g) = This method creates the Graphical Components
*
*/
// Import Statements
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class ImageComponent extends JComponent {

    /**
     * Unique Identifier for Serializable Classes
     */
    private static final long serialVersionUID = 443381609288782143L;

    // Instance Variable
    private ImageIcon image; // Stores Image

    /**
     * This is the Constructor
     * 
     * @param fileName
     */
    public ImageComponent(String fileName) {

        super();
        this.image = new ImageIcon(fileName);
        this.setPreferredSize(new Dimension(500, 500));

    } // Constructor

    /**
     * This method creates the Graphical Components
     * 
     * @param g
     */
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        // Using Graphics2D to scale the images
        Graphics2D g2 = (Graphics2D) g;
        g2.scale(this.getWidth() / 5, this.getHeight() / 5);
        g2.drawImage(this.image.getImage(), 0, 0, 5, 5, null);

    } // paintComponent Method

} // ImageComponent Class