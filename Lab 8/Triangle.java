public class Triangle {
  private double p1x, p1y, p2x, p2y, p3x, p3y;
  private String name;
  
  /** Constructor for Triangle
    * @param pt1x X-coordinate for first point
    * @param pt1y Y-coordinate for first point
    * @param pt2x X-coordinate for second point
    * @param pt2y Y-coordinate for second point
    * @param pt3x X-coordinate for third point
    * @param pt3y Y-coordinate for third point
    * @param nameIn Name of the triangle
    */
  public Triangle(double pt1x, double pt1y, double pt2x, double pt2y, double pt3x, double pt3y, String nameIn) {
    p1x = pt1x;
    p1y = pt1y;
    p2x = pt2x;
    p2y = pt2y;
    p3x = pt3x;
    p3y = pt3y;
    name = nameIn;
  }
  
  /** Constructor for Triangle
    */
  public Triangle() {
    p1x = p1y = p2x = p2y = p3x = p3y = 0;
    name = "";
  }
  
  /** Returns with the perimeter of the triangle
    * @return double The perimeter of the triangle
    */
  public double getPerimeter() {
    return (calcSide(p1x, p1y, p2x, p2y) + calcSide(p1x, p1y, p3x, p3y) + calcSide(p2x, p2y, p3x, p3y));
  }
  
  /** Returns with the name of the triangle
    * @return string The name of the triangle
    */
  public String getName() {
    return name;
  }
  
  /** Calculates the hypotenus of the triangle
    * @param lengthOne Length of the first leg of the triangle
    * @param lengthTwo Length of the second leg of the triangle
    * @return double The length of the hypotenuse of the triangle
    */
  public double calcHypotenuse(double lengthOne, double lengthTwo) {
    return Math.sqrt((Math.pow(lengthOne, 2) + Math.pow(lengthTwo, 2)));
  }
  
  /** Calculates the length of a side of the triangle
   * @param x1 X-coordinate of the first point
   * @param y1 Y-coordinate of the first point
   * @param x2 X-coordinate of the second point
   * @param y2 Y-coordinate of the second point
   * @return double The length of the side of the triangle
   */
  private double calcSide(double x1, double y1, double x2, double y2) {
    return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
  }
}
  