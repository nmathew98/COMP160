package shapes;
import java.awt.*;

class Oval extends Shape {
  public Oval() {
    height = 4 * width;
    y = randomRange(0, 400 - height);
  }
  
  public void display(Graphics g) {
    g.setColor(colour);
    g.fillOval(x, y, width, height);
  }
}