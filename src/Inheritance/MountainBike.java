package Inheritance;

import ClassAndObject.Constructor.Bicycle;

/*
 * - The inner class have access of all public and private field of the
 *   Outer class and additionally it has access to public and protected
 *   fields of super class of outer class.
 */
public class MountainBike extends Bicycle {

  public int seatHeight;

  public MountainBike(
    int startHeight,
    int startCadence,
    int startSpeed,
    int startGear
  ) {
    super(startCadence, startSpeed, startGear);
    seatHeight = startHeight;
  }

  public void setHeight(int newValue) {
    seatHeight = newValue;
  }

  /**
   * MountainBikeGearModule
   */
  public class MountainBikeGearModule {

    int position;

    public MountainBikeGearModule(int position) {
      if (seatHeight >= 100 && seatHeight <= 200) {
        this.position = position;
      } else {
        this.position = position + 100;
        setGear(2);
      }
    }
  }
}
