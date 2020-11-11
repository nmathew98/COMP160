/* Lab 16 */
import java.util.Scanner;

public class WhatsMyFruit {
  public static void main(String[] args) {
    // Part 1: Guess the fruit
    System.out.println("Part 1: Guess the fruit");
    // Create a new array that can hold 3 elements and get the user to fill it up with names of fruits
    String[] fruits = new String[3];
    for(int i = 0; i < fruits.length; ++i) {
      System.out.println("Enter a type of fruit");
      fruits[i] = new Scanner(System.in).nextLine();
    }
    // Ask the user to guess the fruit given the first two letters of the name of the fruit and the length of the name of the fruit
    for (String s : fruits) {
      System.out.print("Guess what fruit I am?\t");
      for (int i = 0; i < 2; ++i)
        System.out.print(s.charAt(i));
      System.out.println("\t" + s.length() + " letters");
      
      // Check if the user got it right or wrong (if they got it wrong ask again)
      while (!(new Scanner(System.in).nextLine()).equalsIgnoreCase(s))
        System.out.println("Try again");

      System.out.println("Correct");
    }
    
    // Part 2: Display a multiplication table up to 12x12
    System.out.println("\nPart 2: Multiplication 101");
    
    // Create the array that will store our values
    int[][] twoD = new int[12][12];
    // Cycle through and fill it up with values
    for (int i = 0; i < twoD.length; ++i) {
      twoD[i][0] = i + 1;
      for (int x = 1; x < twoD[i].length; ++x)
        twoD[i][x] = (i + 1) * (x + 1);
    }
    // Print out our table
    for (int[] i : twoD) {
      for (int x : i) 
        System.out.print(x + "\t");
      System.out.println();
    }
  }
}