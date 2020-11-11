// Lab 21
import java.awt.*;
import javax.swing.*;
import java.util.Random;

class Shape {
  private int x, y, width, height;
  private Color colour;
  
  public Shape() {
    width = height = randomRange(10, 30);
    x = randomRange(0, 400 - width);
    y = randomRange(0, 400 - height);
    colour = new Color(randomRange(0, 255), randomRange(0, 255), randomRange(0, 255));
  }

  // Returns a random number between lo and hi
  public int randomRange(int lo, int hi) {
    return ((new Random()).nextInt(hi) + lo);
  }
  
  // Draws a circle
  public void display(Graphics g) {
    g.setColor(colour);
    g.fillOval(x, y, width, height);
  }
}