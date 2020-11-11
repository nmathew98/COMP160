package shapes;
import java.awt.*;

class Square extends Shape {
  public void display(Graphics g) {
    g.setColor(colour);
    g.fillRect(x, y, width, height);
  }
}