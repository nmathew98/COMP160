// Lab 21
package shapes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ShapePanel extends JPanel {
  private Shape[] shapes = new Shape[20];
  private DrawingPanel drawPanel =  new DrawingPanel();
  private JPanel controlPanel = new JPanel();
  private JTextField showNum = new JTextField(2);
  private JLabel countLabel = new JLabel("Count:");
  private JButton[] buttons = { new JButton("Circle"), new JButton("Square"), new JButton("Oval"), new JButton("Smiley"), new JButton("Swirl"), new JButton("Start"), new JButton("Stop") };
  private int count;
  private Timer timer;
  private final int DELAY = 10;
  
  public ShapePanel() {
    controlPanel.setPreferredSize(new Dimension(100, 400));
    ButtonListener buttonListener = new ButtonListener();
    timer = new Timer(DELAY, buttonListener);
    
    for (JButton button : buttons) {
      button.addActionListener(buttonListener);
      controlPanel.add(button);
    }
    controlPanel.add(countLabel);
    controlPanel.add(showNum);

    add(controlPanel);
    add(drawPanel);    
    
  }
   
  public static void main(String[] args) {
    JFrame f = new JFrame("Shape Panel");
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    f.getContentPane().add(new ShapePanel());
    f.pack();
    f.setVisible(true);
  }
  
  private class DrawingPanel extends JPanel {
    public DrawingPanel() {
      setPreferredSize(new Dimension(400, 400));
      setBackground(Color.pink);
    }
    
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      // Cycle through our shapes array and display each circle
      for (int i = 0; i < count; i++)
        shapes[i].display(g);
    }
  }
  
  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      // Add a new circle as long as our array can handle it
      if (e.getSource() == timer) for (int i = 0; i < count; i++) shapes[i].move();
      else {
        JButton button = (JButton) e.getSource();
        if (button.getText().equals("Circle")) {
          shapes[count] = new Circle();
          count++;
        } else if (button.getText().equals("Square")) {
          shapes[count] = new Square();
          count++;
        } else if (button.getText().equals("Start")) {
          timer.start();
        } else if (button.getText().equals("Stop")) {
          timer.stop();
        } else if (button.getText().equals("Oval")) {
          shapes[count] = new Oval();
          count++;
        } else if (button.getText().equals("Smiley")) {
          shapes[count] = new Smiley();
          count++;
        } else if (button.getText().equals("Swirl")) {
          shapes[count] = new Swirl();
          count++;
        }
        showNum.setText(Integer.toString(count));
      }
      
      repaint();
    }
  }
}