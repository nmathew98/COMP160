import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel {
  private JLabel saying;
  private JCheckBox bold, italic;
  private JRadioButton courier, timesNewRoman, helvetica;
  private int style = Font.PLAIN;
  private String typeface = "Helvetica";
  private ButtonGroup buttonGroup = new ButtonGroup();
  
  public StyleOptionsPanel() {
    // Set our window preferences
    setLayout(new GridLayout(6, 1));
    setBackground(Color.cyan);
    setPreferredSize(new Dimension(300, 150));

    // Create our JLabel and set the font
    saying = new JLabel("Say it with style!");
    saying.setFont(new Font(typeface, style, 20));
    
    // Create our checkboxes
    bold = new JCheckBox("Bold");
    italic = new JCheckBox("Italic");
    
    // Create our radio buttons
    courier = new JRadioButton("Courier");
    timesNewRoman = new JRadioButton("Times New Roman");
    helvetica = new JRadioButton("Helvetica");
    
    // Listeners for our checkbox and fonts
    StyleListener styleListener = new StyleListener();
    FontListener fontListener = new FontListener();
    
    // Add our listeners
    bold.addItemListener(styleListener);
    italic.addItemListener(styleListener);    
    courier.addItemListener(fontListener);
    timesNewRoman.addItemListener(fontListener);
    helvetica.addItemListener(fontListener);
    
    // Add our buttons to ButtonGroup so that only one radio button can be selected at any one time
    buttonGroup.add(courier);
    buttonGroup.add(timesNewRoman);
    buttonGroup.add(helvetica);
    
    // Add our checkboxes and radio buttons to our JPanel
    add(saying);
    add(bold);
    add(italic);
    add(courier);
    add(timesNewRoman);
    add(helvetica);
  }
  
  private class StyleListener implements ItemListener {
    public void itemStateChanged(ItemEvent event) {
      style = Font.PLAIN;
      
      if (bold.isSelected())
        style = Font.BOLD;
      if (italic.isSelected())
        style += Font.ITALIC;
      
      saying.setFont(new Font(typeface, style, 20));
    }
  }
  
  private class FontListener implements ItemListener {
    public void itemStateChanged(ItemEvent event) {
      if(courier.isSelected())
        typeface = "Courier";
      if(helvetica.isSelected())
        typeface = "Helvetica";
      if(timesNewRoman.isSelected())
        typeface = "Times New Roman";
      
      saying.setFont(new Font(typeface, style, 20));
    }
  }
}
