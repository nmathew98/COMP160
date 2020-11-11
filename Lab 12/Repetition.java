/** Lab 12, Repetition 1
  */

import java.util.Scanner;

public class Repetition {
  public static void main(String[] args) {
    Scanner scanInt = new Scanner(System.in);
    System.out.println("Enter an integer greater than 1");
    int inputInteger = scanInt.nextInt();
    if (inputInteger > 1)
      System.out.println("Sum of even numbers between 2 and " + inputInteger + " inclusive is: " + addEven(inputInteger));
    else
      System.out.println("Input value must not be less than 2");
    
    System.out.println();
    
    Scanner scanString = new Scanner(System.in);
    System.out.println("Enter a sentence");
    String inputString = scanString.nextLine();
    int[] count = vowelConsonantCounter(inputString);
    System.out.println("Sentence is: " + inputString);
    System.out.println("Vowel count: " + count[0]);
    System.out.println("Consonant count: " + count[1]);
  }
  
  /** addEven
    * Adds the sum of even numbers starting from 2 to input where input is a number that is greater than 1
    * @return Integer with the sum
    * @param input The range of the sum to be calculated. From 2 to input.
    */
  public static int addEven(int input) {
    int evenSum = 0;
    for (int x = 2; x <= input; x += 2)
      evenSum += x;
    
    return evenSum;
  }
  
  /** vowelConstantCount
    * Counts the number of vowels and consonants in a string and returns the results.
    * @return Returns an integer array with the first item being the number of vowels and the second item the number of consonants
    * @param input The string that needs counting
    */
  public static int[] vowelConsonantCounter(String input) {
    int[] vowelConsonant = new int[2];
    vowelConsonant[0] = vowelConsonant[1] = 0;
    String inputUppercase = input.toUpperCase();
    inputUppercase = inputUppercase.replaceAll("[^A-Z]", "");
    for (int x = 0; x < inputUppercase.length(); ++x) {
      switch (inputUppercase.charAt(x)) {
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
          ++vowelConsonant[0];
          break;
        default:
          ++vowelConsonant[1];
      }
    }
    
    return vowelConsonant;
  }
}