import javax.swing.*;

public class StyleOptionsApp {
  public static void main (String[] args) {
    JFrame frame = new JFrame("Style Options");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
    StyleOptionsPanel panel = new StyleOptionsPanel();
    frame.getContentPane().add(panel);
    
    frame.pack();
    frame.setVisible(true);
  }
}
