/* Lab 15 */
public class IntCounter {
  private int[] numArray;
  
  public IntCounter(int[] numArray) {
    this.numArray = numArray;
    // Print out our array
    for (int i : numArray)
      System.out.print(i + " ");
    System.out.print("Array is of length: " + numArray.length + "\n");
  }
  
  public void showTarget(int target) {
    boolean targetFound = false;
    // Circle through each element in the array and see if there is a match
    for (int i = 0; i < numArray.length; ++i)
      if (numArray[i] == target) {
        System.out.println("There is a " + target + " in position " + i);
        targetFound = true;
      }
    // If the target number is not found display a message. If not don't show anything
    System.out.print(targetFound ? "" : "There are no " + target + "'s in this array\n");
  }
}