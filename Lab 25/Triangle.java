import java.awt.Graphics;
import java.awt.Color;

public class Triangle {
  private float p1x, p1y, p2x, p2y, p3x, p3y;
  private String name;
  
  /** Constructor for Triangle
    * @param pt1x X-coordinate for first point
    * @param pt1y Y-coordinate for first point
    * @param pt2x X-coordinate for second point
    * @param pt2y Y-coordinate for second point
    * @param pt3x X-coordinate for third point
    * @param pt3y Y-coordinate for third point
    * @param nameIn Name of the triangle
    */
  public Triangle(float pt1x, float pt1y, float pt2x, float pt2y, float pt3x, float pt3y, String nameIn) {
    p1x = pt1x;
    p1y = pt1y;
    p2x = pt2x;
    p2y = pt2y;
    p3x = pt3x;
    p3y = pt3y;
    name = nameIn;
  }
  
  /** Constructor for Triangle
    */
  public Triangle() {
    p1x = p1y = p2x = p2y = p3x = p3y = 0;
    name = "";
  }
  
  /** Returns with the name of the triangle
    * @return string The name of the triangle
    */
  private String getName() {
    return name;
  }
  
  /** Draws our triangle 
    */
  public void display(Graphics g) {
    g.setColor(Color.red);
    // Draw our lines
    g.drawLine(Math.round(p1x), Math.round(p1y), Math.round(p2x), Math.round(p2y));
    g.drawLine(Math.round(p2x), Math.round(p2y), Math.round(p3x), Math.round(p3y));
    g.drawLine(Math.round(p1x), Math.round(p1y), Math.round(p3x), Math.round(p3y));
    g.setColor(Color.black);
    // Display triangle name
    g.drawString(name, Math.round(p1x), Math.round(p1y));
  }
  
}
  