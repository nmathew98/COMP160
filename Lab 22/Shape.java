// Lab 21
package shapes;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

class Shape {
  private int x, y, width, height, count, moveX = 1, moveY = 1;
  private Color colour;
  
  public Shape() {
    width = height = randomRange(10, 30);
    x = randomRange(0, 400 - width);
    y = randomRange(0, 400 - height);
    colour = new Color(randomRange(0, 255), randomRange(0, 255), randomRange(0, 255));
    
    // If our shape starts at the bottom half of our panel, move upwards
    moveY = y <= 200 ? moveY : -moveY;
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
  
  public void move() {
    // If we are at the boundaries of our panel, invert the value of how much we move by
    moveX = x > 400 - width || x < 0 ? -moveX : moveX;
    moveY = y > 400 - width || y < 0 ? -moveY : moveY;
    
    // If our shape is wider than 15 pixels, move vertically
    x = width > 15 ? x : x + moveX;
    y = width > 15 ? y + moveY : y;
    
    // Disco lights but don't change it up too quickly
    count++;
    colour = count % 10 == 0 ? Color.getHSBColor(0.6f - (new Random()).nextFloat(), 1.0f, 1.0f) : colour;
  }
}