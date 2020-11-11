/** Lab 14 **/

import javax.swing.*;
import java.awt.*;

public class TablePanel extends JPanel {
  private Diner diner1, diner2, diner3, diner4, diner5, diner6;
  // These hold the dimensions for our window and rectangles
  private final int WINDOW_WIDTH = 500, WINDOW_HEIGHT = 500;
  private final int RECT_WIDTH = 80, RECT_HEIGHT = 300, RECT_X = (WINDOW_WIDTH / 2) - (RECT_WIDTH / 2), RECT_Y = 100;
  
  public TablePanel() {
    
    // Diner(x:int, y:int, name:String, seatNum: int, colour:Color)
    // Draw our diners relative to the dimensions of our rectangle
    diner1 = new Diner(RECT_X, RECT_Y - 85, "Caleb", 1, Color.cyan);
    diner2 = new Diner(RECT_X + RECT_WIDTH + 5, RECT_Y, "Georgia", 2, Color.white);
    diner3 = new Diner(RECT_X + RECT_WIDTH + 5, RECT_Y + RECT_HEIGHT - 80, "Maala", 3, Color.green);
    diner4 = new Diner(RECT_X, RECT_Y + RECT_HEIGHT + 5, "Bic", 4, Color.magenta);
    diner5 = new Diner(RECT_X - 85, RECT_Y + RECT_HEIGHT - 80, "Kings", 5, Color.lightGray);
    diner6 = new Diner(RECT_X - 85, RECT_Y, "Lorde", 6, Color.pink);
    
    // Set our window height and width
    setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
    setBackground(Color.yellow);
  }
  
  // Draw our diners and rectangle
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    diner1.draw(g);
    diner2.draw(g);
    diner3.draw(g);
    diner4.draw(g);
    diner5.draw(g);
    diner6.draw(g);
    
    g.drawRect(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
    g.fillRect(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
  }
}