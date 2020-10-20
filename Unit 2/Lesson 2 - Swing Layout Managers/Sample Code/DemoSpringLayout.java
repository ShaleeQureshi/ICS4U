
import java.awt.*;
import javax.swing.*;


public class DemoSpringLayout extends JPanel
{  private JButton b1 = new JButton("One");
   private JTextArea a1 = new JTextArea("Two");
   private JButton b2 = new JButton("Three");

   public DemoSpringLayout()
   {  super();
      this.layoutView();
   }

   private void layoutView()
   {  SpringLayout layout = new SpringLayout();
   
   	this.setLayout(layout);
      this.add(this.b1);
      this.add(this.a1);
      this.add(this.b2);
      
      // Add constraints
      // contrain west side of b1 to be 5 pixels from west side of the panel
      // constrain north side of b1 to be 5 pixels from north side of the panel
      layout.putConstraint(SpringLayout.WEST, b1, 5, SpringLayout.WEST, this);
      layout.putConstraint(SpringLayout.NORTH, b1, 5, SpringLayout.NORTH, this);
      
      // constrain b2 to be below b1
      layout.putConstraint(SpringLayout.WEST, b2, 5, SpringLayout.WEST, this);
      layout.putConstraint(SpringLayout.NORTH, b2, 10, SpringLayout.SOUTH, b1);
      
      // Let the textarea grow as large as requested
      a1.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
      
      // constrain a1 to be east of the buttons and spread vertically to fill 
      // the entire height of the panel
      layout.putConstraint(SpringLayout.WEST, a1, 5, SpringLayout.EAST, b2);
      layout.putConstraint(SpringLayout.NORTH, a1, 5, SpringLayout.NORTH, this);
      
      // Note the order of this and a1 are switched.  Don't know why it matters; 
      // but it does.
      layout.putConstraint(SpringLayout.SOUTH, this, 5, SpringLayout.SOUTH, a1);
      layout.putConstraint(SpringLayout.EAST, this, 5, SpringLayout.EAST, a1);
      
   }
   
}
