package ClassAndObject.ClassModifiers;

import ClassAndObject.Constructor.Bicycle;

/*
 *  - Priority
 *      1. Public.
 *      2. Protected.
 *      3. Default.
 */

public class ClassModifier {

  public static void main(String[] args) {
    /// Default.
    Bicycle bicycle = new Bicycle();
    int gear = bicycle.getGear(); // Accessible.
    System.out.println("Gear is " + gear);
    // bicycle.shiftGear(); // Not Accessible as modifier is default.
    Bicycle bicycle2 = new Bicycle();
    int objectCount = Bicycle.getNumberOfBicycles();
    System.out.println("Gear is " + objectCount);
    bicycle.dispose();
    bicycle2.dispose();
    int currentObjectCount = Bicycle.getNumberOfBicycles();
    System.out.println("Gear is " + currentObjectCount);
  }

  public static class InternalModifierClass extends Bicycle {

    @Override
    public void setCadence(int newValue) {
      /// Can be implemented as public.
    }
  }

  public static class ProtectedClassExample extends Protected {

    @Override
    protected void doAccessProtected() {
      /// Do access protected.
    }
  }
}
