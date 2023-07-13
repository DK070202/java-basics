package Inheritance.MultipleInheritance;

interface interface3 extends Interface1, Interface2 {
  @Override
  default void doThing() {}

  @Override
  default void doSomethingBetter() {
    System.out.println("Doing something better from interface 3");
  }
}
