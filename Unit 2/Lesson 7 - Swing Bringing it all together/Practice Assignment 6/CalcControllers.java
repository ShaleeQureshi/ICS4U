
/*
* Last Modified: October 29, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class creates the Controllers for the Calculator
*
* Constructor List:
* 1. CalcControllers(CalcModel model, JTextField fieldNum1, JTextField fieldNum2)
*
* Method List:
* 1. public void actionPerformed(ActionEvent e) = This method controls the events
*
*/
// Import Statements
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class CalcControllers implements ActionListener {

    // Instance Variables
    private JTextField textFieldNum1;
    private JTextField textFieldNum2;
    private CalcModel calcModel;

    /**
     * This is the CalcControllers Constructor
     * 
     * @param model
     * @param fieldNum1
     * @param fieldNum2
     */
    public CalcControllers(CalcModel model, JTextField fieldNum1, JTextField fieldNum2) {
        this.calcModel = model;
        this.textFieldNum1 = fieldNum1;
        this.textFieldNum2 = fieldNum2;
    } // CalcControllers Constructor

    @Override
    /**
     * This method controls the events
     * 
     * @param e
     */
    public void actionPerformed(ActionEvent e) {

        // Getting the first number
        try {
            calcModel.setNum1(Double.parseDouble(this.textFieldNum1.getText())); // Setting the first number
        } catch (NumberFormatException error) {
            this.textFieldNum1.setText("Error");
        }

        // Getting the second number
        try {
            calcModel.setNum2(Double.parseDouble(this.textFieldNum2.getText())); // Setting the second number
        } catch (NumberFormatException error) {
            this.textFieldNum2.setText("Error");
        }

        // Perform the calculation
        if (!(this.textFieldNum1.getText().equals("Error") || this.textFieldNum2.getText().equals("Error"))) {
            calcModel.performOperations(e.getActionCommand()); // Passing in the operation
        }

    } // actionPerformed Method

} // CalcControllers Class
