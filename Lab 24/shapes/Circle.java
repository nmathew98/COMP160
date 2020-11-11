package shapes;
import java.awt.*;

class Circle extends Shape {
  public void display(Graphics g) {
    g.setColor(colour);
    g.fillOval(x, y, width, height);
  }
}