public class BoxApp {
  public static void main(String[] args) {
    // Creates an instance of Box
    Box box1 = new Box();
    // Sets height to 4, length to 4 and width to 6
    box1.setHeight(4);
    box1.setLength(4);
    box1.setWidth(6);
    // Prints out the data fields, volume and surface area
    System.out.println(box1.toString());
    
    // Creates another instance of Box
    Box box2 = new Box(3, 4, 5);
    // Prints out the data fields, volume and surface area
    System.out.println(box2.toString());
    
    // Creates another instance of Box
    Box box3 = new Box(5);
    // Prints out the data fields, volume and surface area
    System.out.println(box3.toString());
  }
}