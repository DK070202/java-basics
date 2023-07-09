package ClassAndObject.Objects;

/*
 * Take away points.
 * - The object creation have two major thing:
 * -    1. Instantiation - This is done by `new` keyword, allocates memory to class and calls the contractor of the object.
 * -    2. Initialization - Followed by `new` keyword, calling constructor and doing variable initialization is know as the.
 */

public class Rect {

  public static void main(String[] args) {
    main1();
    /// It is not required to store reference of the Rect, but we ca do some expressive as follow.
    int height = new Rect().height;
    System.out.println("Height is" + height);
  }

  public static void main1() {
    // Declare and create a point object and two Rect objects.
    // Declare and create a point object and two rectangle objects.
    Point originOne = new Point(23, 94);
    Rect rectOne = new Rect(originOne, 100, 200);
    Rect rectTwo = new Rect(50, 100);

    // display rectOne's width, height, and area
    System.out.println("Width of rectOne: " + rectOne.width);
    System.out.println("Height of rectOne: " + rectOne.height);
    System.out.println("Area of rectOne: " + rectOne.getArea());

    // set rectTwo's position
    rectTwo.origin = originOne;

    // display rectTwo's position
    System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
    System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

    // move rectTwo and display its new position
    rectTwo.move(40, 72);
    System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
    System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
  }

  Point origin;
  int height;
  int width;

  public Rect(Point p, int height, int width) {
    this.origin = p;
    this.height = height;
    this.width = width;
  }

  public Rect(int height, int width) {
    this.origin = new Point();
    this.height = height;
    this.width = width;
  }

  public Rect(Point p) {
    origin = p;
    this.height = 0;
    this.width = 0;
  }

  public Rect() {
    origin = new Point();
    height = 0;
    width = 0;
  }

  public void move(int x, int y) {
    origin.x = x;
    origin.y = y;
  }

  public int getArea() {
    return height * width;
  }

  @Override
  public String toString() {
    return "Rect [point=" + origin + ", x=" + height + ", y=" + width + "]";
  }
}
