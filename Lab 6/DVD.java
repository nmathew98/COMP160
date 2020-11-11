import java.text.NumberFormat;

public class DVD { 
  private String name, zone;
  private int rating, runTime, price;
  
  // Accessor methods
  public String getName() {
    return name;
  }
  public String getZone() {
    return zone;
  }
  public int getRating() {
    return rating;
  }
  public int getRunTime() {
    return runTime;
  }
  public int getPrice() {
    return price;
  }
  
  // Mutator methods
  public void setName(String x) {
    name = x;
  }
  public void setZone(String x) {
    zone = x;
  }
  public void setRating(int x) {
    rating = x;
  }
  public void setRunTime(int x) {
    runTime = x;
  }
  public void setPrice(int x) {
    price = x;
  }
  
  // Display our DVD's
  public void displayDVD() {
    NumberFormat fmt = NumberFormat.getCurrencyInstance(); // for formatting price
    System.out.println("The name of the DVD is: " + name); 
    System.out.println("It has a rating of: " + rating + " out of 5"); 
    System.out.println("The DVD runs for: " + runTime + " minutes");
    System.out.println("This DVD is available in the following zones: " + zone);
    System.out.println("You can buy this book for: " + fmt.format(price));
    System.out.println("**********************************"); 
  }
}