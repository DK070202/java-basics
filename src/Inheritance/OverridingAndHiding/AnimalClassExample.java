package Inheritance.OverridingAndHiding;

/*
 * Take away: Here the drag class has implemented the EggLayer and FireBreath
 * interface and this both interface does share common parament interface which is animal,
 * and we have overridden the `identifyMyself` in EggLayer so the dragon class would point
 * to the implementation of EggLayer.
 * -
 */
public class AnimalClassExample {

  public interface Animal {
    public default String identifyMyself() {
      return "I am an animal.";
    }
  }

  public interface EggLayer extends Animal {
    public default String identifyMyself() {
      return "I am able to lay eggs.";
    }
  }

  public interface FireBreather extends Animal {}

  public static class Dragon implements EggLayer, FireBreather {}

  public static void main(String... args) {
    Dragon myApp = new Dragon();
    System.out.println(myApp.identifyMyself());
  }
}
