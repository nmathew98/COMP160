import javax.swing.*;
import java.awt.*;
/**
 * Snowman.java       From: Lewis, DePasquale & Chase page 971 (page 835 2nd edition)
 * 
 * Demonstrates basic drawing methods and the use of color.
 * 
 */
public class Snowman extends JPanel{
  
  
  /** constructor method, sets up the Snowman panel */
  public Snowman(){
    setPreferredSize(new Dimension(300,220));
    setBackground(Color.cyan);
  }
  
  /**  Draws a snowman.*/
  public void paintComponent (Graphics page)
  {
    super.paintComponent(page);
    final int MID = 70; // so that the snowman is to the left
    final int TOP = 50;
    page.setColor (Color.cyan);
    page.fillRect(0,0,300,220);  //background;
    
    page.setColor (Color.blue);
    page.fillRect (0, 175, 300, 50);  // ground
    
    page.setColor (Color.yellow);
    page.fillOval (250, -40, 80, 80);  // sun
    
    page.setColor (Color.white);
    page.fillOval (MID -20, TOP, 40, 40);      // head
    page.fillOval (MID - 35, TOP + 35, 70, 50);   // upper torso
    page.fillOval (MID - 50, TOP + 80, 100, 60);  // lower torso
    
    page.setColor (Color.black);
    page.fillOval (MID - 10, TOP + 10, 5, 5);   // left eye
    page.fillOval (MID + 5, TOP + 10, 5, 5);    // right eye
    
    page.drawArc (MID - 10, TOP + 20, 20, 10, 360, 180);   // smile
    
    page.drawLine (MID - 25, TOP + 60, MID - 50, TOP + 40);  // left arm
    page.drawLine (MID + 25, TOP + 60, MID + 55, TOP + 60);  // right arm
    
    page.drawLine (MID - 20, TOP + 5, MID + 20, TOP + 5);  // brim of hat
    page.fillRect (MID - 15, TOP - 20, 30, 25);        // top of hat
    
    page.setColor(Color.red);
    page.fillOval(MID - 5, TOP + 40, 10, 10); // Two red buttons
    page.fillOval(MID - 5, TOP + 65, 10, 10);
    
    page.setColor(Color.black);
    page.drawString("Naveen Mathew", 2, 13); // Draw a string
  }
}