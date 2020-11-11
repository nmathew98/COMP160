/** Lab12, Anagrams
 */
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter first phrase");
    String firstPhrase = scan.nextLine();
    System.out.println("Enter second phrase");
    String secondPhrase = scan.nextLine();
    
    String firstPhraseSorted = sortLetterz(firstPhrase);
    String secondPhraseSorted = sortLetterz(secondPhrase);
    System.out.println(firstPhrase + (firstPhraseSorted.equals(secondPhraseSorted) ? " is an anagram of " + secondPhrase : " is not an anagram of " + secondPhrase));
  }
  
  /** sortLetters
    * @return Returns a string with the letters of the input sorted in ascending order
    * @param input Our input string
    */
  public static String sortLetters(String input) {
    String inputCopy = input.toLowerCase(); // First make a copy of our input in lowercase
    inputCopy = inputCopy.replaceAll("[^a-z]", ""); // Ensure only letters of the alphabet remain
    
    // Convert our string into a character array and sort it
    char[] inputArray = inputCopy.toCharArray();
    Arrays.sort(inputArray);
    // New string with our sorted array
    String s = new String(inputArray);
    
    // Voila
    System.out.println(s + " are the letters of " + input + " in order");
    
    return s;
  }
  
  /** sortLetterz
    * @return Returns a string with the letters of the input sorted in ascending order
    * @param input Our input string
    */
  public static String sortLetterz(String input) {
    String inputCopy = input.toLowerCase(); // Make a copy of the lowercase version of our input
    inputCopy = inputCopy.replaceAll("[^a-z]", ""); // Ensure only letters of the alphabet remain
    String s = ""; // This will hold the sorted version of our string
    
    // Here we sort our string
    for (char c = 'a'; c <= 'z'; ++c)
      for (int i = 0; i < inputCopy.length(); ++i)
        if (inputCopy.charAt(i) == c)
          s += c;
    
    // Voila
    System.out.println(s + " are the letters of " + input + " in order");
    
    return s;
  }
}