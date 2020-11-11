public class BookShopApp {
  public static void main(String[] args) {
    // Create three instances of Book for 3 different books
    Book patel = new Book();
    Book pipDiddy = new Book();
    Book orange = new Book();
    
    // Setup our data fields
    patel.setTitle("Life of Pi");
    patel.setPages(348);
    patel.setPrice(28.90);
    
    pipDiddy.setTitle("Mister Pip");
    pipDiddy.setPages(240);
    pipDiddy.setPrice(22.70);
    
    orange.setTitle("Steve Jobs");
    orange.setPages(300);
    orange.setPrice(25);
    
    // Display our books
    patel.displayBook();
    pipDiddy.displayBook();
    orange.displayBook();
    
    // Create an instance of DVD
    DVD movie1 = new DVD();
    
    // Setup our data fields
    movie1.setName("The Big Sick");
    movie1.setPrice(10);
    movie1.setZone("Worldwide");
    movie1.setRunTime(200);
    movie1.setRating(4);
    
    // Display our DVD's
    movie1.displayDVD();
  }
}