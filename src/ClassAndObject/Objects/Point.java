package ClassAndObject.Objects;

public class Point {

  int x;
  int y;

  public Point(int xCoordinate, int yCoordinate) {
    this.x = xCoordinate;
    this.y = yCoordinate;
  }

  public Point() {
    this.x = 0;
    this.y = 0;
  }

  @Override
  public String toString() {
    return "Point [x=" + x + ", y=" + y + "]";
  }
}
