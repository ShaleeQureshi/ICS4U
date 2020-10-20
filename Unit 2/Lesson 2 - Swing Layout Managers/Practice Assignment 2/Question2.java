/*
* Date: October 19, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the solution to question 2 from the Practice Assignment by creating a Hangman GUI with BorderLayout and BoxLayout
*
* Method List: 
* 1. main(final String[] args) = This method runs the entire program
*
*/

// Import Statements
import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Question2 {

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Instantiating Objects
        JFrame frame = new JFrame("Created by Shahrukh Qureshi");
        BorderLayout borderLayout = new BorderLayout();
        JPanel panelContents = new JPanel(borderLayout);
        JPanel panelLetterButtons = new JPanel();
        JPanel panelBottomButtons = new JPanel();
        BoxLayout layoutLetterButtons = new BoxLayout(panelLetterButtons, BoxLayout.X_AXIS);
        BoxLayout layoutBottomButtons = new BoxLayout(panelBottomButtons, BoxLayout.X_AXIS);

        final String phrase = "HANGMAN"; // The phrase in the Textbox

        // Initializing the JComponents

        // JButtons
        JButton btnH = new JButton("H");
        JButton btnA = new JButton("A");
        JButton btnN = new JButton("N");
        JButton btnG = new JButton("G");
        JButton btnM = new JButton("M");
        JButton btnA2 = new JButton("A");
        JButton btnAN2 = new JButton("N");
        JButton btnNewGame = new JButton("New Game");
        JButton btnExit = new JButton("Exit");

        // Adding the JButtons that represent the phrase to the paneletterButtons
        // component
        panelLetterButtons.add(btnH);
        panelLetterButtons.add(btnA);
        panelLetterButtons.add(btnN);
        panelLetterButtons.add(btnG);
        panelLetterButtons.add(btnM);
        panelLetterButtons.add(btnA2);
        panelLetterButtons.add(btnAN2);
        panelLetterButtons.setLayout(layoutLetterButtons);

        // Adding the JButtons to the panelBottomButtons
        panelBottomButtons.add(btnNewGame);
        panelBottomButtons.add(btnExit);
        panelBottomButtons.setLayout(layoutBottomButtons);

        // JTextField
        JTextField textField = new JTextField(phrase);
        textField.setEditable(false); // Making it so the user cannot alter the phrase

        // ImageIcon that is within a JLabel
        JLabel hImageIcon = new JLabel(new ImageIcon("./hangman.png"));

        // Adding the JComponents to the JPanel
        panelContents.add(panelLetterButtons, BorderLayout.NORTH);
        panelContents.add(textField, BorderLayout.WEST);
        panelContents.add(panelBottomButtons, BorderLayout.SOUTH);
        panelContents.add((JLabel) hImageIcon, BorderLayout.CENTER);

        // Adding the Main JPanel to the JFrame
        frame.setContentPane(panelContents);

        // Adjusting the JFrame
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); // Making it visible

    } // main Method

} // Question2 Class
