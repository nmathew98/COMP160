// Lab 21
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ShapePanel extends JPanel {
  private Shape[] shapes = new Shape[20];
  private DrawingPanel drawPanel =  new DrawingPanel();
  private JPanel controlPanel = new JPanel();
  private JButton addShape = new JButton("Add Shape");
  private JTextField showNum = new JTextField(2);
  private JLabel countLabel = new JLabel("Count:");
  private int count;
  
  public ShapePanel() {
    controlPanel.setPreferredSize(new Dimension(100, 400));
    ButtonListener buttonListener = new ButtonListener();
    addShape.addActionListener(buttonListener);

    controlPanel.add(addShape);
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
      if (e.getSource() == addShape && count < shapes.length) {
        shapes[count] = new Shape();
        ++count;
      }
      showNum.setText(Integer.toString(count));
      repaint();
    }
  }
}