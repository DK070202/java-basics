package ClassAndObject.Constructor;

/// As we have no args constructor in Bicycle class so it work fine.
public class SuperClass extends Bicycle {

  public SuperClass() {
    super(); // Refers no args constructor from the Bicycle class.
  }

  public SuperClass(int startCadence, int startSpeed, int startGear) {
    super(startCadence, startSpeed, startGear); // Refers contractor which have the parameter as defined.
  }
}
