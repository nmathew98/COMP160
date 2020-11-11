import java.awt.Color;

public class MyPanelApp {
  public static void main(String[] args) {
    // Create an instance of MyPanel and call upon decorate
    MyPanel mpl = new MyPanel();
    mpl.decorate(Color.blue, 180);
    // Second instance of MyPanel
    MyPanel mpl2 = new MyPanel();
    mpl2.decorate(Color.cyan, 360);
  }
}