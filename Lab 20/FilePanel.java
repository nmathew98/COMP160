import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

/** FilePanel.java
 * Lab 20, COMP160,  2018
 * 
 * a JPanel which creates 2 instances of Rectangle objects, 
 * stores them in an array, and draws them 
 */

public class FilePanel extends JPanel {
  private Rectangle[] drawObjects = new Rectangle[10];
  private int count = 0;
  
  // Constructor instantiates 6 Rectangle objects
  public FilePanel() {
    // 2D array to store the properties of our rectangles
    int[][] rectangleProperties = new int[4][6];
    String fileName = "LongBadData.txt";
    
    drawObjects[count] = new Rectangle(true, Color.red, 0, 0,30,30);
    count++;
    drawObjects[count] = new Rectangle(false, Color.blue, 50, 50,30,30);
    count++;
    
    try {
      Scanner fileScan = new Scanner(new File(fileName));

      // Loop while there's a next line and we have not exceeded the number of items our array can store
      for (int rectNumber = 0; fileScan.hasNextLine() && rectNumber < rectangleProperties.length; ++rectNumber) {
        String inputLine = fileScan.nextLine();
        
        // Check that the line has all the information we need
        if (inputLine.matches("\\d+ \\d+ \\d+ \\d+ \\d+ \\d+")) {
          Scanner scan = new Scanner(inputLine);
          // While there's an integer to be read, read and store it
          for (int rectProperty = 0; scan.hasNextInt(); ++rectProperty)
            rectangleProperties[rectNumber][rectProperty] = scan.nextInt();
        } else --rectNumber; // decrement rectNumber if the line does not have all the information we need so that the array gets filled up properly
      }
    } catch(FileNotFoundException e) {
      System.out.println("File not found. Check file name and location");
      System.exit(1);
    }
    
    // Cycle through our array and initialize a new rectangle object
    for (int i = 0; i < rectangleProperties.length; ++i, ++count)
      drawObjects[count] = new Rectangle(rectangleProperties[i][0] == 1 ? true : false, 
                                         rectangleProperties[i][1] == 1 ? Color.red : (rectangleProperties[i][1] == 2 ? Color.blue : Color.green), 
                                         rectangleProperties[i][2], rectangleProperties[i][3], rectangleProperties[i][4], rectangleProperties[i][5]);
    
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);
  }
  
  // Each rectangle will draw itself
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for (int i = 0; i < count; ++i)
      drawObjects[i].draw(g);
  }
}