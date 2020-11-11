/** Lab 18 **/
import javax.swing.*;
import java.awt.*;

public class TrafficLightPanelApp {
  public static void main(String[] args) {
    // Create our window and show it
    JFrame f = new JFrame("Traffic Light Panel");
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
    f.getContentPane().add(new TrafficLightPanel());
    
    f.pack();
    f.setVisible(true);
  }
}