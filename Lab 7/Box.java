/** Box class. Describes boxes. 
  * Lab 7, 16/01/18
  */

public class Box { 
  private int height, width, length;
  
  /** Box(int h, int w, int l) 
    * Sets up an instance of Box taking three input parameters for height, width and length
    * @param h Height of the box
    * @param w Width of the box
    * @param l Length of the box
    */
  public Box(int h, int w, int l) {
    height = h;
    width = w;
    length = l;
  }
  
  /** Box()
    * Sets up an instance of Box taking no input parameters
    */
  public Box() {
    height = width = length = 0;
  }
  
  /** Box(int x)
    * Sets up an instance of Box taking one input parameter and assigning the height, width and length to the same values
    * @param x Length, width and height
    */
  public Box(int x) {
    height = width = length = x;
  }
  
  // Accessors
  /** getHeight()
    * Returns the height of the box (an integer)
    */
  public int getHeight() {
    return height;
  }
  
  /** getWidth()
    * Returns the width of the box (an integer)
    */
  public int getWidth() {
    return width;
  }
  
  /** getLength()
    * Returns the length of the box (an integer)
    */
  public int getLength() {
    return length;
  }
  
  /** getVolume()
    * Returns the volume of the box (an integer)
    */
  public int getVolume() {
    return height * width * length;
  }
  
  /** getSurfaceArea()
    * Returns the surface area of the box (an integer)
    */
  public int getSurfaceArea() {
    return (2 * ( (width * height) + (length * height) + (length * width)));
  }
  
  // Mutators
  /** setHeight(int x)
    * Sets the height of the box
    * @param x Height of the box
    */
  public void setHeight(int x) {
    height = x;
  }
  
  /** setWidth(int x)
    * Sets the width of the box
    * @param x Width of the box
    */
  public void setWidth(int x) {
    width = x;
  }
  
  /** setLength(int x)
    * Sets the length of the box
    * @param x Length of the box
    */
  public void setLength(int x) {
    length = x;
  }
  
  
  /** toString()
    * Returns a string with all the values stored in the data fields, volume and surface area
    */
  public String toString() {
    return "Height: " + height + ", Length: " + length + ", Width: " + width + ", Volume: " + getVolume() + ", Surface Area: " + getSurfaceArea();
  }
}