package Inheritance.MultipleInheritance;

interface Interface2 {
  void doThing();

  default void doSomethingBetter() {
    System.out.println("Doing something from Interface2");
  }
}
