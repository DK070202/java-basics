package Interface;

/*
 * Interface can be only implement and can not be inherited.
 */
public class GroupedInterface implements Interface1 {}

/*
 * A interface can be only extended to other interface it can not be implemented.
 */
interface Interface0 extends Interface1 {
  /*
   * If methods is prefixed with default then and then it can enclose body within other wise
   * it should not have body while declaring inside Interface.
   */
  default void doSomething() {}

  /*
   * An Interface can also contain a static method with enclosing body.
   */
  static void doSomething(int i2) {}
}

interface Interface1 {
  default void doSomethingInInterface1() {}
}

interface Interface2 extends Interface1 {
  void doSomethingInInterface1(); // Made method abstract.
}

interface Interface3 extends Interface1 {
  @Override
  default void doSomethingInInterface1() {} // Implemented method with other implementation.
}

interface Interface4 extends Interface1 {
  /// Not to mention method at all.
}
