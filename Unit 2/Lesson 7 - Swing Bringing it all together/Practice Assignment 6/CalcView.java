
/*
* Last Modified: October 29, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class creates the View for the Calculator
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
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcView extends JPanel {

    /**
     * For serializable classes
     */
    private static final long serialVersionUID = -7552490454311912434L;

    // Instance Variables
    private JLabel lblInput1 = new JLabel("Num 1");
    private JLabel lblInput2 = new JLabel("Num 2");
    private JLabel lblResult = new JLabel("Answer: ");
    private JTextField txtInput1 = new JTextField(5);
    private JTextField txtInput2 = new JTextField(5);
    private JButton btnPlus = new JButton("+");
    private JButton btnMinus = new JButton("-");
    private JButton btnDivide = new JButton("÷");
    private JButton btnMultiply = new JButton("x");
    private CalcModel calcModel;

    /**
     * This is the CalcModel Constructor
     * 
     * @param model
     */
    public CalcView(CalcModel model) {
        super();
        this.calcModel = model;
        this.calcModel.setGUI(this);
        this.layoutView();
        this.initializeControllers();
    } // CalcView Constructor

    /**
     * This method creates the initial layout for the Calculator
     */
    private void layoutView() {

        // JPanels
        JPanel panelTxt = new JPanel();
        JPanel panelBtns = new JPanel();

        // Layouts
        BorderLayout mainLayout = new BorderLayout();
        this.setLayout(mainLayout); // Setting this JPanel's layout

        // panelTxt
        panelTxt.add(this.lblInput1);
        panelTxt.add(this.txtInput1);
        panelTxt.add(this.lblInput2);
        panelTxt.add(this.txtInput2);

        // panelBtns
        panelBtns.add(this.btnPlus);
        panelBtns.add(this.btnMinus);
        panelBtns.add(this.btnDivide);
        panelBtns.add(this.btnMultiply);

        this.add(panelTxt, BorderLayout.NORTH);
        this.add(panelBtns, BorderLayout.CENTER);
        this.add(lblResult, BorderLayout.SOUTH);

    } // layout Method

    /**
     * This method initializes the controllers
     */
    private void initializeControllers() {

        // Controller for btnPlus
        CalcControllers btnPlusController = new CalcControllers(this.calcModel, this.txtInput1, this.txtInput2);
        this.btnPlus.addActionListener(btnPlusController);

        // Controller for btnMinus
        CalcControllers btnMinusController = new CalcControllers(this.calcModel, this.txtInput1, this.txtInput2);
        this.btnMinus.addActionListener(btnMinusController);

        // Controller for btnDivide
        CalcControllers btnDivideController = new CalcControllers(this.calcModel, this.txtInput1, this.txtInput2);
        this.btnDivide.addActionListener(btnDivideController);

        // Controller for btnMultiply
        CalcControllers btnMultiplyController = new CalcControllers(this.calcModel, this.txtInput1, this.txtInput2);
        this.btnMultiply.addActionListener(btnMultiplyController);

    } // initializeControllers Method

    /**
     * This method updates the UI
     */
    public void update() {
        double val = this.calcModel.getAnswer();
        // If the value is an integer (e.g. 1.0 is the same as 1) the following will
        // occur
        if ((int) val == val) {
            this.lblResult.setText("Answer: " + (int) val); // Outputting the int value
        }
        // If the value is not an int (floating point) the following will occur
        else {
            this.lblResult.setText("Answer: " + val); // Outputting the floating point value
        }
    } // update Method

} // CalcView Class