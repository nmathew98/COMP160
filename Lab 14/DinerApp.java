/** Lab 14 **/

import javax.swing.*;
import java.awt.*;

public class DinerApp {
  public static void main(String[] args) {
    // Set our JFrame up
    JFrame f = new JFrame("Diner Listing");
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
    f.getContentPane().add(new TablePanel());
    
    f.pack();
    f.setVisible(true);
  }
}