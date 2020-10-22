
/*
* Date: October 21, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class has the solution to question 1
*
* Method List:
* 1. static void main(String[] args) = This method runs the entire program
*
*/
// Import Statements
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Question1 {

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Instantiating Objects
        JFileChooser fc = new JFileChooser();
        fc.setMultiSelectionEnabled(true); // Allowing multi-select
        fc.setCurrentDirectory(new File(System.getProperty("user.dir"))); // Making it start in the current directory
        JTextField txtField = new JTextField("Some text", 10);

        int option = fc.showOpenDialog(null); // Opening the JFileChooser

        // If the user selects a file(s) the following will occur
        if (option == JFileChooser.APPROVE_OPTION) {

            // Creating an array of objects depending on the amount of files selected
            File[] files = fc.getSelectedFiles();
            ImageComponent[] images = new ImageComponent[files.length];
            JFrame[] frames = new JFrame[files.length];
            JPanel[] panels = new JPanel[files.length];

            // Loop to initialize the objects
            for (int i = 0; i < files.length; i++) {
                images[i] = new ImageComponent(files[i].getPath());
                frames[i] = new JFrame(files[i].getName());
                panels[i] = new JPanel();
                panels[i].add(images[i]);
                panels[i].add(txtField);
                frames[i].setContentPane(panels[i]);
                frames[i].setSize(500, 600);
                frames[i].setLocationRelativeTo(null);
                frames[i].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frames[i].setVisible(true);
            } // for loop

        }
        // If the user did not select an option the following will occur
        else {
            System.out.println("No file selected");
        }

    } // main Method

} // Question1 Class
