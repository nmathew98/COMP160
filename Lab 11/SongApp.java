/** Lab 11, 22/01
 */
public class SongApp {
  public static void main(String[] args) {
    // Process a few song lines
    Song edSheeran = new Song("While my guitar gently weeps");
    System.out.println("The song line to process is: " + edSheeran.toString());
    edSheeran.process();
    System.out.println();
    
    Song elsa = new Song("Let it be");
    System.out.println("The song line to process is: " + elsa.toString());
    elsa.process();
    System.out.println();
    
    Song penny = new Song("Penny Lane");
    System.out.println("The song line to process is: " + penny.toString());
    penny.process();
    System.out.println();
    
    Song oneWord = new Song("a");
    System.out.println("The song line to process is: " + oneWord.toString());
    oneWord.process();
  }
}