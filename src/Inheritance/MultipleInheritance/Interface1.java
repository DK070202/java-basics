package Inheritance.MultipleInheritance;

interface Interface1 {
  void doThing();

  default void doSomethingBetter() {
    System.out.println("Doing something from Interface1");
  }
}
