/*
* Date: September 28, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: Creates a GUI that is an exact replica of the one in the problem
*
* Method List: 
* 1. main(final String[] args) = Main Method
*/

// Import Statements
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Plagiarism {

    public static void main(String[] args) {

        // Instantiating Objects
        JFrame myFrame = new JFrame("Plagiarism by Shalee Qureshi");
        JPanel myPanel = new JPanel();
        JTextField txtFirstName = new JTextField(10);
        JTextField txtLastName = new JTextField(10);
        JLabel lblFirstName = new JLabel("First Name");
        JLabel lblLastName = new JLabel("Last Name");
        JLabel lblGender = new JLabel("Gender");
        JLabel lblDesc = new JLabel("Description");
        JCheckBox checkBoxMale = new JCheckBox("Male");
        JCheckBox checkBoxFemale = new JCheckBox("Female");
        JTextArea txtDesc = new JTextArea(10, 50);
        JButton btnSave = new JButton("Save");
        JButton btnLoad = new JButton("Load");
        JButton btnQuit = new JButton("Quit");

        // Adding the JComponents to the JPanel
        myPanel.add(lblFirstName);
        myPanel.add(txtFirstName);
        myPanel.add(lblLastName);
        myPanel.add(txtLastName);
        myPanel.add(lblGender);
        myPanel.add(checkBoxMale);
        myPanel.add(checkBoxFemale);
        myPanel.add(lblDesc);
        myPanel.add(txtDesc);
        myPanel.add(btnSave);
        myPanel.add(btnLoad);
        myPanel.add(btnQuit);

        myFrame.setContentPane(myPanel); // Adding the JPanel to the JFrame
        myFrame.pack();
        myFrame.setSize(400, 300);
        myFrame.setLocationRelativeTo(null); // This allows the JFrame to open in the middle of the screen
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Making the program end if the user exits the JFrame
        myFrame.setVisible(true); // Making the JFrame Visible

    } // main Method

} // Plagiarism Class
