/** application class for Customer.java
 * Lab 9 COMP160
 */
import java.util.Scanner;

public class CruiseApp {
    public static void main(String[] args) {
        // Create an array of Customer
        // Each Customer created with name, age, showed student ID card
        Customer[] customer = new Customer[8];
        String[] names = new String[] {"Aaron Stott", "Betty Adams", "Corin Child", "Doris Stewart", "Edmond Cheyne", "Fiona Chaney", "Ged Still-Child", "Harry Adamson"};
        int[] age = new int[] {17, 17, 16, 25, 12, 7, 16, 20};
        boolean[] student = new boolean[] {true, false, true, true, false, false, true, false};
        for (int i = 0; i <= customer.length - 1; ++i)
          customer[i] = new Customer(names[i], age[i], student[i]);
        
        // Cycle through our customer array and confirm the bookings
        for (int i = 0; i <= customer.length - 1; ++i)
          confirmBooking(customer[i]);
        
        // Cycle through our customer array and show who's booked
        for (int i = 0; i <= customer.length - 1; ++i)
          showBooked(customer[i]);
    }
    
    // Method to set the booking
    public static void confirmBooking(Customer customer) {
      // Our standard prices
      double standardTicketPrice = 56.0;
      double standardMealPrice = 30.0;
      // Stores the ticket and meal prices once the class which the customer falls into is determined
      double ticketPrice, mealPrice;
      
      // Determine if our customer is a child, a student or just an average joe and set prices accordingly
      if (customer.isChild() || customer.isStudent()) {
        ticketPrice = standardTicketPrice / 2;
      } else {
        ticketPrice = standardTicketPrice - (0.2 * standardTicketPrice);
      }
      if (customer.isChild()) {
        mealPrice = standardMealPrice / 2;
      } else {
        mealPrice = standardMealPrice - (0.1 * standardMealPrice);
      }
      
      // Print out the booking details
      System.out.println(customer.getName());
      System.out.println("Ticket price: $" + ticketPrice);
      System.out.println("Meal price: $" + mealPrice);
      System.out.println("Total price: $" + (ticketPrice + mealPrice));
      
      // Confirm our booking
      System.out.println("Confirm booking for " + customer.getName() + " (Y/N)");
      Scanner getConfirmation = new Scanner(System.in);
      String confirmation = getConfirmation.nextLine();
      // If booking is confirmed take note
      if (confirmation.equals("y") || confirmation.equals("Y")) {
        customer.setBooked();
        System.out.println("Booked");
      } else {
        System.out.println("Not booked");
      }
      System.out.println();
    }
    
    // Shows who is booked and who isn't
    public static void showBooked(Customer customer) {
      if (customer.isBooked()) {
        System.out.println(customer.getName() + " is booked");
      }
    }
    
}