/*
* Date: October 19, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the solution to question 1 b) from the Practice Assignment by creating a GUI with BorderLayout and BoxLayout
*
* Method List: 
* 1. main(final String[] args) = This method runs the entire program
*
*/

// Import Statements
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

public class Question1B {

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Instantiating Objects
        JFrame frame = new JFrame("Created by Shahrukh Qureshi");
        BorderLayout layoutContents = new BorderLayout();
        JPanel panelContents = new JPanel(layoutContents);
        JPanel panelRadioButtons = new JPanel();
        JPanel panelButtons = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panelRadioButtons, BoxLayout.Y_AXIS);
        BoxLayout boxLayout2 = new BoxLayout(panelButtons, BoxLayout.X_AXIS);

        // Adding components to the panelRadioButtons component
        JRadioButton btnCanada = new JRadioButton("Canada");
        JRadioButton btnChina = new JRadioButton("China");
        JRadioButton btnGB = new JRadioButton("Great Britain");
        JRadioButton btnIndia = new JRadioButton("India");
        JRadioButton btnMexico = new JRadioButton("Mexico");
        JRadioButton btnUS = new JRadioButton("United States");
        JRadioButton btnZimbabwe = new JRadioButton("Zimbabwe");
        panelRadioButtons.add(btnCanada);
        panelRadioButtons.add(btnChina);
        panelRadioButtons.add(btnGB);
        panelRadioButtons.add(btnIndia);
        panelRadioButtons.add(btnMexico);
        panelRadioButtons.add(btnUS);
        panelRadioButtons.add(btnZimbabwe);
        panelRadioButtons.setLayout(boxLayout);

        // Adding components to the panelButtons component
        JButton btnSave = new JButton("Save");
        JButton btnLoad = new JButton("Load");
        JButton btnDiscard = new JButton("Discard");
        panelButtons.add(btnSave);
        panelButtons.add(btnLoad);
        panelButtons.add(btnDiscard);
        panelButtons.setLayout(boxLayout2);

        // Setting up the main JPanel (panelContents)
        panelContents.add(panelRadioButtons, BorderLayout.WEST);
        panelContents.add(new JTextArea(10, 5), BorderLayout.CENTER);
        panelContents.add(panelButtons, BorderLayout.SOUTH);

        // Adjusting the JFrame
        frame.setContentPane(panelContents);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); // Making it visible

    } // main Method

} // Question1B Class
