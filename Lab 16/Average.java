/* Lab 16 */
public class Average {
  public static void main(String[] args) {
    int[][] table = {{1,2,3}, {4,5,6}, {7,8}};
    
    // Cycle through our 2D array and add up the numbers in each row and display the average
    for (int[] i : table) {
      int sum = 0;
      // Add up our numbers
      for (int x : i) {
        System.out.print(x + " ");
        sum += x;
      }
      // Display the average
      System.out.println("\t Average: " + ((double)sum / i.length));
    }
  }
}