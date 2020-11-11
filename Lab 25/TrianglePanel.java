// Lab 25
import java.awt.*;
import javax.swing.*;
import java.util.Random;

class TrianglePanel extends JPanel {
  private JPanel controlPanel = new JPanel();
  private final int WIDTH = 600, HEIGHT = 600;
  private Triangle[] triangles = new Triangle[10];
  
  public TrianglePanel() {
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setBackground(Color.white);
    
    Random rand = new Random();
    int i = 0;
    // Create triangles with a random number of points
    for (char c = 'A'; c < 'A'+3; c++, i++)
      triangles[i] = new Triangle(rand.nextInt(WIDTH/30) * 30, rand.nextInt(WIDTH/30) * 30, 
                                  rand.nextInt(WIDTH/30) * 30, rand.nextInt(WIDTH/30) * 30, 
                                  rand.nextInt(WIDTH/30) * 30, rand.nextInt(WIDTH/30) * 30,
                                  Character.toString(c));
  }
   
  public void paintComponent(Graphics g) {
    // Draw our horizontal lines
    for (int i = 0; i <= HEIGHT; i += 30) {
      g.drawString(Integer.toString(i/30), i, 12);
      g.drawLine(i, 0, i, HEIGHT); 
    }
    // Draw our vertical lines
    for (int i = 0; i <= WIDTH; i += 30) {
      g.drawString(Integer.toString(i/30), 0, i);      
      g.drawLine(0, i, WIDTH, i);
    }
    // Display our triangles
    for (Triangle t : triangles)
      if (t != null) t.display(g);
  }
  
  public static void main(String[] args) {
    JFrame f = new JFrame("Triangles");
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    f.getContentPane().add(new TrianglePanel());
    f.pack();
    f.setVisible(true);
  }  
}