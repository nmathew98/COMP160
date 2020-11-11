import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 Pie.java
 Support class provided for Part 2, Lab5, COMP160 2018 
 */
public class Pie extends JPanel {
  /** constructor method, sets up the Pie panel */
  public Pie() {
    setPreferredSize(new Dimension(360,350));
    setBackground(Color.white);
  }
    
  /** all drawing code goes in the paint method, which is called automatically */
  public void paintComponent (Graphics page) {
    super.paintComponent(page);
      
    // Declare and initialize the width, height and origins of the circle
    final int WIDTH, HEIGHT, ORIGIN_X, ORIGIN_Y;
    WIDTH = HEIGHT = 350;
    ORIGIN_X = ORIGIN_Y = 0;
    // Declare and initalize the x and y coordinates of the first arc of the circle since it needs to be at an offset
    int firstArcX, firstArcY;
    firstArcX = 8;
    firstArcY = -3;
      
    // Draw a white circle
    page.setColor(Color.white);
    page.fillOval(0, 0, WIDTH, HEIGHT);
      
    // Setup some variables
    // We start at origin and intialize x, y, i and startAngle at 0
    int x = 0, y = 0, i = 0, startAngle = 0;
    // Arc angle is constant
    final int ARC_ANGLE = 45;

    // Loop and draw the other 7 arcs changing the color on each iteration
    while (i != 7) {
      // Generate and set some random colors
      colorRandomizer(page);

      // Only to draw the first arc since it needs to be at an offset
      if (startAngle == 0) {
        System.out.println("Drawing arc with angle 45 degrees starting from " + startAngle + " degrees");
        page.drawArc(firstArcX, firstArcY, WIDTH, HEIGHT, startAngle, ARC_ANGLE);
        page.fillArc(firstArcX, firstArcY, WIDTH, HEIGHT, startAngle, ARC_ANGLE);
        startAngle += 45;
      }
        
      // Draw and fill our arcs starting at origin
      System.out.println("Drawing arc with angle 45 degrees starting from " + startAngle + " degrees");
      page.drawArc(ORIGIN_X, ORIGIN_Y, WIDTH, HEIGHT, startAngle, ARC_ANGLE);
      page.fillArc(ORIGIN_X, ORIGIN_Y, WIDTH, HEIGHT, startAngle, ARC_ANGLE);
        
      // Increase the start by 45 degrees
      startAngle += 45;

      // Increment i
      ++i;
    }
  }
  
  public static void colorRandomizer(Graphics page) {
    // Declare and intialize a color variable
    Random randomizer = new Random();
    Color randomColor = new Color(0, 0, 0);
    
    // Use the randomizer to create a random hue for our color
    float hue = randomizer.nextFloat() * randomizer.nextFloat();
    float saturation = 0.9f;
    float luminance = 1.0f;
    
    // We are using the HSB color model to make a random color
    randomColor = Color.getHSBColor(hue, saturation, luminance);
    
    // Set the color and print out its R, G, B values
    page.setColor(randomColor);
    System.out.println(randomColor);
  }
}
