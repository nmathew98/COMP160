import java.util.ArrayList;

public class Song {
  private String songLine;
  
  public Song(String sLine) {
    songLine = sLine;
  }
  
  public String toString() {
    return songLine;
  }
  
  public void process() {
    System.out.println("Length is: " + songLine.length());
    System.out.println("Last character is: " + songLine.charAt(songLine.length() - 1));
    
    // Cycle through songLine and record all the positions where a space is encountered
    int firstWordPosition = songLine.indexOf(' ');
    int secondWordPosition = songLine.indexOf(' ', firstWordPosition + 1);
    
    // Print the first and second words only if there is more than one word
    // i.e if there is a space
    if (firstWordPosition == -1 ) {
      System.out.print("we have one word ");
      System.out.println(songLine);
    } else if ( secondWordPosition == -1 ) {
      System.out.print("We have two words  ");
       System.out.println(songLine);
    } else {
      System.out.print("The first and second words are: ");
       System.out.println(songLine.substring(0, secondWordPosition));
             System.out.print("The remaining words are: ");
      System.out.println(songLine.substring(secondWordPosition + 1));
        System.out.println("First letter of the third word: " + songLine.charAt(secondWordPosition + 1));
    } 

    System.out.println("Capitalized: " + songLine.toUpperCase()); 
    
    // If there is a space in the string, print a version replacing the space with 'x'
    if (firstWordPosition != -1)
      System.out.println("Replacing all the spaces with an x: " + songLine.replaceAll(" ", "x"));
    
    // Find the first occurance of 'b' in the string and print it (if there is a 'b')
    if ((songLine.indexOf("b")) != -1)
      System.out.println("The first occurance of 'b' is at index: " + (songLine.indexOf("b")));
    
    System.out.println("Original string: " + songLine);
  }
}