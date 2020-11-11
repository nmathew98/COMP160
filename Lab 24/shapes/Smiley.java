package shapes;
import java.awt.*;

class Smiley extends Shape {
  public Smiley() {
    height = width = 30;
    x = randomRange(0, 400 - width);
    y = randomRange(0, 400 - height);
  }
  
  public void display(Graphics g) {
    g.setColor(Color.yellow);
    g.fillOval(x, y, width, height);
    g.setColor(Color.black);
    g.drawOval(x, y, width, height);
    g.drawOval(x + 7, y + 8, 4, 4);
    g.drawOval(x + 20, y + 8, 4, 4);
    
    // Smile on the way up, frown on the way down
    if (moveY < 0) g.drawArc(x + 8, y + 10, 15, 13, 190, 160);
    else g.drawArc(x + 8, y + 16, 15, 13, 10, 157);
  }
  
  public void move() {
    // If we are at the boundaries of our panel, invert the value of how much we move by
    moveX = x > 400 - width || x < 0 ? -moveX : moveX;
    moveY = y > 400 - width || y < 0 ? -moveY : moveY;
    
    // If our shape is wider than 15 pixels, move vertically
    x = width > 15 ? x : x + moveX;
    y = width > 15 ? y + moveY : y;
  }
}