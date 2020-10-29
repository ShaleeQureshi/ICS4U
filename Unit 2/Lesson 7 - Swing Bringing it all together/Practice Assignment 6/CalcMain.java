
/*
* Last Modified: October 29, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class runs the entire Calculator Program
*
* Method List:
* 1. public static void main(String[] args) = This method runs the entire program
*
*/
// Import Statements
import javax.swing.JFrame;

public class CalcMain {

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Instantiating Objects
        CalcModel model = new CalcModel();
        CalcView view = new CalcView(model);
        JFrame frame = new JFrame("Calculator by Shahrukh (Shalee) Qureshi");

        // Adjusting the JFrame
        frame.setSize(300, 150);
        frame.setResizable(false);
        frame.setContentPane(view);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    } // main Method

} // CalcMain Class
