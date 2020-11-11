import javax.swing.*;
/**
 PieApp.java
 Application class provided for Part 2, Lab5, COMP160 2018 
 */
public class PieApp extends JFrame{
  
  /** creates an instance of Pie called pieChart and places it on a JFrame object */
  public static void main(String[]args){
    JFrame frame = new JFrame("Pie Chart"); 
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    Pie pieChart = new Pie();
    frame.getContentPane().add(pieChart);
    frame.pack();
    frame.setVisible(true);
  }
}