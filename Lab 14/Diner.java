/** Lab 14 **/

import javax.swing.*;
import java.awt.*;

public class Diner {
  private int x, y, seatNum;
  private String name;
  private Color colour;
  // Our circle shall have a diameter of 80
  private final int DIAMETER = 80;
  
  public Diner(int x, int y, String name, int seatNum, Color colour) {
    this.x = x;
    this.y = y;
    this.seatNum = seatNum;
    this.name = name;
    this.colour = colour;
  }
  
  public Diner () {}
  public void draw(Graphics g) {
    // First draw our circle
    g.setColor(colour);
    g.drawOval(x, y, DIAMETER, DIAMETER);
    g.fillOval(x, y, DIAMETER, DIAMETER);
    
    // Now we draw our seat number relative to the diameter of the circle
    g.setColor(Color.black);
    g.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
    // Center our text
    int seatNumX = x + (DIAMETER / 2) - (g.getFontMetrics().stringWidth(Integer.toString(seatNum)) / 2);
    int seatNumY = y + (DIAMETER / 2) - (g.getFontMetrics().getHeight() / 2);
    g.drawString(Integer.toString(seatNum), seatNumX, seatNumY);
    
    // Next we draw the name of our diner relative to the diameter of the circle
    g.setFont(new Font("Helvetica Neue", Font.BOLD, 18));
    // Center our text
    int nameX = x + (DIAMETER / 2) - (g.getFontMetrics().stringWidth(name) / 2);
    int nameY = y + (DIAMETER / 2) + (g.getFontMetrics().getHeight() / 2);
    g.drawString(name, nameX, nameY);
  }
}