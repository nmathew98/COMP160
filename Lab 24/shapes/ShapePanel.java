// Lab 21
package shapes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

class ShapePanel extends JPanel {
  private ArrayList<Shape> shapes = new ArrayList<Shape>();
  private DrawingPanel drawPanel =  new DrawingPanel();
  private JPanel controlPanel = new JPanel();
  private JTextField showNum = new JTextField(2);
  private JLabel countLabel = new JLabel("Remove which?");
  private JButton[] buttons = { new JButton("Circle"), new JButton("Square"), new JButton("Oval"), 
                                new JButton("Smiley"), new JButton("Swirl"), new JButton("Start"), 
                                new JButton("Stop"), new JButton("Remove") };
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
      for (int i = 0; i < shapes.size(); i++) {
        shapes.get(i).display(g);
        shapes.get(i).showIndex(g, i);
      }
    }
  }
  
  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      // Add a new circle as long as our array can handle it
      if (e.getSource() == timer) for (int i = 0; i < shapes.size(); i++) shapes.get(i).move();
      else {
        JButton button = (JButton) e.getSource();
        if (button.getText().equals("Circle")) shapes.add(new Circle());
        else if (button.getText().equals("Square")) shapes.add(new Square());
        else if (button.getText().equals("Start")) timer.start();
        else if (button.getText().equals("Stop")) timer.stop();
        else if (button.getText().equals("Oval")) shapes.add(new Oval());
        else if (button.getText().equals("Smiley")) shapes.add(new Smiley());
        else if (button.getText().equals("Swirl")) shapes.add(new Swirl());
        else if (button.getText().equals("Remove")) {
          try {
            int removeIndex = Integer.parseInt(showNum.getText());
            shapes.remove(removeIndex);
          } catch (NumberFormatException z) {
            System.out.println("Input is not a number");
          } catch (IndexOutOfBoundsException z) {
            System.out.println("Index is out of bounds");
          }
        } 
        showNum.setText( shapes.size() == 0 ? "" : Integer.toString(shapes.size() - 1) );
      }
      
      repaint();
    }
  }
}