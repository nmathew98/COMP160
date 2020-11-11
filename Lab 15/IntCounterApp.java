/* Lab 15 */
import java.util.Scanner;
import java.util.Random;

public class IntCounterApp {
  public static void main(String[] args) {
    for (int i = 0; i <= 3; ++i) {
      if (i != 0)
        System.out.println();
      IntCounter countIt = new IntCounter(makeArray());
      System.out.println("Which number do you wish to find?");
      int input = new Scanner(System.in).nextInt();
      countIt.showTarget(input);
    }
  }
  
  // Makes an array of a random length between 5 to 10 and fills it with numbers from 0 to 4
  public static int[] makeArray() {
    Random rand = new Random();
    int[] returnArray = new int[rand.nextInt(11) + 5];
    for (int i = 0; i < returnArray.length; i++)
      returnArray[i] = rand.nextInt(5);
    return returnArray;
  }
}