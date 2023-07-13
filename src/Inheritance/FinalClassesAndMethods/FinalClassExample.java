package Inheritance.FinalClassesAndMethods;

/**
 * Some methods which are used in constructor to do initialize fields of the class should be final
 * so that they can not be overridden by the child class to restrict some misbehavior.
 */
public class FinalClassExample {

  int x;
  int y;

  FinalClassExample() {
    doInitFinalClass(1, 2);
  }

  public final void doInitFinalClass(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public class InnerFinalClassExample extends FinalClassExample {
    // public final void doInitFinalClass(int x, int y) {
    //   this.x = x;
    //   this.y = y;
    // }
  }
}
