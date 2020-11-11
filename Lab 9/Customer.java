public class Customer {
  // Declare our data fields
  private String name;
  private boolean child, student, booked;
  
  // Our constructor method
  public Customer(String nameIn, int age, boolean studentIn) {
    name = nameIn;
    student = studentIn;
    if (5 <= age && age <= 16)
      child = true;
    else 
      child = false;
  }
  
  // Accessors
  public String getName() {
    return name;
  }
  
  public boolean isChild() {
    return child;
  }
  
  public boolean isStudent() {
    return student;
  }
  
  public boolean isBooked() {
    return booked;
  }
  
  // Mutator
  public void setBooked() {
    booked = true;
  }
}