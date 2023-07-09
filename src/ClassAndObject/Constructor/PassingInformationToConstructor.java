package ClassAndObject.Constructor;

public class PassingInformationToConstructor {

  private static int value;

  static int getValue() {
    return value;
  }

  /// For one time initialization called only once when class is loaded
  /// into the memory.
  static {
    value = 0;
  }

  public double computePayment(
    double loanAmt,
    double rate,
    double futureValue,
    int numPeriods
  ) {
    double interest = rate / 100.0;
    double partial1 = Math.pow((1 + interest), -numPeriods);
    double denominator = (1 - partial1) / interest;
    double answer =
      (-loanAmt / denominator) - ((futureValue * partial1) / denominator);
    return answer;
  }

  /// This is is known as `varargs` contract in place of creating an object array and then
  /// to pass here we can directly use the `varargs` construct as follow.
  public void polygonFrom(Point... corners) {
    int numberOfSides = corners.length;
    double squareOfSide1, lengthOfSide1;
    squareOfSide1 =
      (corners[1].x - corners[0].x) *
      (corners[1].x - corners[0].x) +
      (corners[1].y - corners[0].y) *
      (corners[1].y - corners[0].y);
    lengthOfSide1 = Math.sqrt(squareOfSide1);

    // more method body code follows that creates and returns a
    // polygon connecting the Points
    System.out.printf("%s: %d, %s%n", numberOfSides, lengthOfSide1);
  }

  /**
   * Point
   */
  public static class Point {

    private int x;
    private int y;
  }
}
