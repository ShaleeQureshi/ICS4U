/*
* Date: October 16, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class runs the solution to the first question 
*
* Constructor List:
* 1. WavingStickFigure
*
* Method List: 
* 1. void paintComponent(Graphics g) = This method creates the graphical components
* 2. void waveArm(int waveNum) = This method moves the figure's arm waveNum times
* 3. void main(String[] args) = This method runs the entire program
*
*/

// Import Statements
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public class WavingStickFigure extends JComponent {

    private int pos = 0; // Arm Position

    // Constructor
    public WavingStickFigure() {
        super();
        this.setPreferredSize(new Dimension(300, 300));
    } // Constructor

    // This method creates the graphical components
    public void paintComponent(Graphics g) {

        // Set Scale
        Graphics2D g2 = (Graphics2D) g;
        g2.scale(this.getWidth() / 10, this.getHeight() / 10);
        g2.setStroke(new BasicStroke(1.0F / this.getHeight()));

        // Draw figure
        g2.drawOval(4, 1, 2, 2);
        g2.drawLine(5, 3, 5, 6);
        g2.drawLine(2, 4, 5, 4);
        g2.drawLine(5, 6, 3, 9);
        g2.drawLine(5, 6, 7, 9);
        g2.drawLine(3, 9, 2, 9);
        g2.drawLine(7, 9, 8, 9);

        // Draw the arm in the various positions
        if (this.pos == 1) {
            g2.drawLine(5, 4, 8, 3);
        } else if (this.pos == 0) {
            g2.drawLine(5, 4, 8, 4);
        } else {
            g2.drawLine(5, 4, 8, 5);
        }

    } // paintComponent Method

    // This method moves the figure's arm waveNum times
    public void waveArm(int waveNum) {

        boolean armPos = true; // Determines if the arm is up or down

        // Move the figure's arm waveNum times
        for (int i = 0; i < waveNum * 2; i++) {

            // Change the arm position
            if (armPos) {
                this.pos = 1;
            } else {
                this.pos = -1;
            }
            this.repaint(); // Repaint the screen

            // Slowing down the Thread
            try {
                Thread.sleep(1000);
            } catch (Exception error) {
                System.out.println(error);
            }
            pos = 0;
            this.repaint(); // Repaint the screen

            // Slowing down the Thread
            try {
                Thread.sleep(1000);
            } catch (Exception error) {
                System.out.println(error);
            }
            armPos = !armPos;

        } // for loop

    } // waveArm

    // This method runs the entire program
    public static void main(String[] args) {

        // Instantiating Objects
        JFrame frame = new JFrame();
        JPanel jpanel = new JPanel();
        WavingStickFigure myFigure = new WavingStickFigure();

        jpanel.add(myFigure);
        frame.setContentPane(jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);

        int waveNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of waves")); // Asking user for
                                                                                                    // waveNum

        frame.setVisible(true);
        myFigure.waveArm(waveNum);

    } // main Method

} // WavingStickFigure Class