
/*
* Last Modified: October 29, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class creates the View for the Dodging Game
*
* Constructor List:
* 1. CalcView(CalcModel model)
*
* Method List:
* 1. private void layoutView() = This method creates the initial layout for the Calculator
* 2. private void initializeControllers() = This method initializes the controllers
* 3. public void update() = This method updates the UI
*
*/
// Import Statements
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DodgeComponent extends JComponent {

    private final int WIDTH = 600;
    private final int HEIGHT = 600;
    private ImageIcon imageBG, imageUser;

    /**
     * This is the DodgeComponent Constructor
     */
    public DodgeComponent() {
        super();
        this.setPreferredSize(new Dimension(this.WIDTH, this.HEIGHT));
        this.imageBG = new ImageIcon("./assets/images/gym.jpg");
        this.imageUser = new ImageIcon("./assets/images/user.png");
    } // DodgeComponent Constructor

    /**
     * This method creates the graphical components
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.scale(this.WIDTH / 6, this.HEIGHT / 6);

        g2.drawImage(this.imageBG.getImage(), 0, 0, 6, 6, null);
        g2.drawImage(this.imageUser.getImage(), 1, 5, 1, 1, null);
    } // paintComponent Method

    // Helper Methods

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new DodgeComponent());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

} // DodgeComponent Class
