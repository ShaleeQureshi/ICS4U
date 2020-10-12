/*
* Date: September 28, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: Creates a GUI that contains a JButton and JTextArea
*
* Method List: 
* 1. actionPerformed(ActionEvent e) = Allows for actions to occur based on events
* 2. main(final String[] args) = Main Method
*/

// Import Statements
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleGUI implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JButton btnRemove, btnReset;
    private JTextArea txtArea;
    private final String text = "It is not the responsibility of knights errant to discover whether the afflicted, the enchained and the oppressed whom they encounter on the road are reduced to these circumstances and suffer this distress for their vices, or for their virtues: the knight's sole responsibility is to succour them as people in need, having eyes only for their sufferings, not for their misdeeds.";

    // Void Constructor
    public SimpleGUI() {

        // Instantiating Objects
        frame = new JFrame("Simple GUI by Shalee Qureshi");
        panel = new JPanel();
        panel.setBackground(Color.GREEN); // Setting panel's background color

        // JButtons
        btnRemove = new JButton("Remove Text");
        btnReset = new JButton("Reset Text");
        // Adding actionlistener to the JButtons
        btnRemove.addActionListener(this);
        btnReset.addActionListener(this);

        // JTextArea
        txtArea = new JTextArea(text);
        txtArea.setLineWrap(true); // Adding linewrap to the JTextArea

        // Setting the location for each component (x, y, width, height)

        // JButtons
        btnRemove.setBounds(0, 0, 100, 50);
        panel.add(btnRemove); // Adding the button to the panel
        btnReset.setBounds(0, 60, 100, 50);
        panel.add(btnReset);

        // JTextArea
        txtArea.setBounds(120, 70, 200, 100);
        panel.add(txtArea); // Adding the textarea to the panel

        // Finalizing JFrame
        frame.setContentPane(panel); // Adding the panel to the frame
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Ensures the frame is in the center of the user's screen
        frame.setVisible(true); // Making the frame visible

    } // Constructor

    // This method allows for specific actions to occur on events
    @Override
    public void actionPerformed(ActionEvent e) {
        // If the user presses the remove button the following will occur
        if (e.getSource() == btnRemove) {
            JOptionPane.showMessageDialog(null, "Your textarea is now cleared!");
            txtArea.setText("");
        }
        // Since the only other option is the reset button the following will occur
        else {
            // If the original text is already present in the textarea the following will
            // occur
            if (txtArea.getText().equals(text)) {
                JOptionPane.showMessageDialog(null, "The original text is already in the textarea!");
            }
            // If the original text is not present in the textarea the following will occur
            else {
                JOptionPane.showMessageDialog(null, "The original text has been added back!");
                txtArea.setText(text);
            }
        }

    } // actionPerformed Method

    public static void main(String[] args) {
        new SimpleGUI(); // Calling the SimpleGUI constructor to run the program
    } // main Method

} // SimpleGUI Class