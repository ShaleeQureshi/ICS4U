
/*
* Last Modified: October 29, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class creates the View for the Calculator
*
* Constructor List:
* 1. ArrayStats(int[] userArray)
*
* Method List:
* 1. private void layoutView() = This method creates the initial layout for the Calculator
*
*/
// Import Statements
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcView extends JPanel {

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

    public CalcView() {
        this.layoutView();
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

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        CalcView panel = new CalcView();
        frame.setSize(300, 150);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

} // CalcView Class