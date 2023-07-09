package ClassAndObject.Constructor;

public class Bicycle {
  /// Will be called only once when type is loaded not object of this class.
  static {
    System.out.println("This is static scope");
  }

  /// It will be executed when object is created.
  {
    System.out.println("This is block scope");
  }

  /// This pattern can be used in subclass for initializing.
  protected final int initializeInstanceVariable() {
    // initialization code goes here
    return 0;
  }

  private int cadence;
  private int gear;
  private int speed;
  private static int instanceCount = 0;

  public Bicycle(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
    ++instanceCount;
  }

  public Bicycle() {
    gear = 1;
    cadence = 10;
    speed = 0;
    ++instanceCount;
  }

  public static int getNumberOfBicycles() {
    return instanceCount;
  }

  /// Internal implantation for changing gear of cycle.
  void shiftGear() {}

  public int getCadence() {
    return cadence;
  }

  public void setCadence(int newValue) {
    cadence = newValue;
  }

  public int getGear() {
    return gear;
  }

  public void setGear(int newValue) {
    gear = newValue;
  }

  public int getSpeed() {
    return speed;
  }

  public void applyBrake(int decrement) {
    speed -= decrement;
  }

  public void speedUp(int increment) {
    speed += increment;
  }

  Bicycle create() {
    return new Bicycle(1, 2, 3);
  }

  public void dispose() {
    instanceCount--;
  }
}
