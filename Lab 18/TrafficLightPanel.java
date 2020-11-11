/** Lab 18 **/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightPanel extends JPanel {
  // Declare our variables
  private JButton redButton, greenButton, amberButton;
  private JLabel lastPressedLabel;
  private JPanel buttonPanel;
  
  public TrafficLightPanel() {
    // Set the window size and background color
    setPreferredSize(new Dimension(200, 300));
    setBackground(Color.blue);
    
    // Create the panel for our buttons and our buttons themselves
    buttonPanel = new JPanel();
    buttonPanel.setPreferredSize(new Dimension(95, 290));
    redButton = new JButton("Red");
    greenButton = new JButton("Green");
    amberButton = new JButton("Amber");
    lastPressedLabel = new JLabel("Last Pressed");
    
    // Add the buttons to our button panel
    buttonPanel.add(redButton);
    buttonPanel.add(amberButton);
    buttonPanel.add(greenButton);
    buttonPanel.add(lastPressedLabel);
    add(buttonPanel);
    
    // Add an action listener to our buttons so that we can respond to user interaction
    ButtonListener buttonListener = new ButtonListener();
    redButton.addActionListener(buttonListener);
    greenButton.addActionListener(buttonListener);
    amberButton.addActionListener(buttonListener);
    
    // Create and add our light panel so that we can show changing lights
    LightPanel lightPanel = new LightPanel();
    add(lightPanel);
  }
  
  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      // Change the text based on the button that is clicked
      if (e.getSource() == redButton)
        lastPressedLabel.setText("Red Button");
      else if (e.getSource() == greenButton)
        lastPressedLabel.setText("Green Button");
      else if (e.getSource() == amberButton)
        lastPressedLabel.setText("Amber Button");
      
      // Change the colors on our light panel each time a button is clicked
      repaint();
    }
  }
  
  private class LightPanel extends JPanel {
    public LightPanel() {
      setPreferredSize(new Dimension(80, 290));
      setBackground(Color.cyan);
    }
    
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      // Initially draw three black circles
      g.setColor(Color.black);
      g.fillOval(20, 30, 40, 40); // Red button
      g.fillOval(20, 100, 40, 40); // Yellow button
      g.fillOval(20, 170, 40, 40); // Green button
      
      // Change the color of our circles based on the button that is clicked
      switch (lastPressedLabel.getText().charAt(0)) {
        case 'R':
          g.setColor(Color.red);
          g.fillOval(20, 30, 40, 40);
          break;
        case 'G':
          g.setColor(Color.green);
          g.fillOval(20, 170, 40, 40);
          break;
        case 'A':
          g.setColor(Color.yellow);
          g.fillOval(20, 100, 40, 40);
          break;
        default: break;
      }
    }
  }
}