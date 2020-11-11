/**
 * TriangleApp.java
 * Lab 8, Part 1, COMP160  2018
 * Displays information about triangles
 */
import java.text.DecimalFormat;

public class TriangleApp {
  public static void main(String[] args) {
    // Setup a few stuff
    DecimalFormat twoPoint = new DecimalFormat(".##");
    
    Triangle a = new Triangle(0, 3, 3, 4, 1, 9, "A");
    Triangle b = new Triangle(4, 2, 9, 4, 6, 7, "B");
    Triangle c = new Triangle(0, 5, 3, 0, 3, 4, "C");
    Triangle d = new Triangle();
    int x = 3;
    int y = 4;
    
    // Print out details about the triangles
    System.out.println("Triangle " + a.getName() + "'s perimeter is " + twoPoint.format(a.getPerimeter()) + " units");
    System.out.println("Triangle " + b.getName() + "'s perimeter is " + twoPoint.format(b.getPerimeter()) + " units");
    System.out.println("Triangle " + c.getName() + "'s perimeter is " + twoPoint.format(c.getPerimeter()) + " units");    
    System.out.println("Hypotenuse of a triangle with two legs of length " + x + " units and " + y + " units: " + d.calcHypotenuse(3, 4));
  }
}