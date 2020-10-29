/*
* Date: October 19, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the solution to question 1 a) from the Practice Assignment by creating a ColorChooser GUI with BorderLayout and BoxLayout
*
* Method List: 
* 1. main(final String[] args) = This method runs the entire program
*
*/

// Import Statements
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import java.awt.BorderLayout;

public class Question1A {

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Instantiating Objects
        JFrame frame = new JFrame("Created by Shahrukh Qureshi");
        BorderLayout layoutContents = new BorderLayout();
        JPanel panelContents = new JPanel();
        JPanel panelCheckBoxes = new JPanel();
        JPanel panelSliders = new JPanel();
        BoxLayout checkBoxLayout = new BoxLayout(panelCheckBoxes, BoxLayout.Y_AXIS);
        BoxLayout sliderBoxLayout = new BoxLayout(panelSliders, BoxLayout.Y_AXIS);

        // Adding CheckBoxes
        JCheckBox box1 = new JCheckBox("Red");
        JCheckBox box2 = new JCheckBox("Green");
        JCheckBox box3 = new JCheckBox("Blue");
        // Adding the CheckBoxes to the panelCheckBoxes component
        panelCheckBoxes.add(box1);
        panelCheckBoxes.add(box2);
        panelCheckBoxes.add(box3);
        panelCheckBoxes.setLayout(checkBoxLayout); // Setting its layout

        // Adding Sliders
        JSlider slider1 = new JSlider();
        JSlider slider2 = new JSlider();
        JSlider slider3 = new JSlider();
        // Adding the sliders to the panelSliders Component
        panelSliders.add(slider1);
        panelSliders.add(slider2);
        panelSliders.add(slider3);
        panelSliders.setLayout(sliderBoxLayout); // Setting its layout

        // Adding the 2 panels to the main panel (panelContents)
        panelContents.add(panelCheckBoxes, BorderLayout.WEST);
        panelContents.add(panelSliders, BorderLayout.CENTER);

        // Adjusting the JFrame
        frame.setContentPane(panelContents);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    } // main Method

} // Question1A Class