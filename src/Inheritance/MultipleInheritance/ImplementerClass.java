package Inheritance.MultipleInheritance;

/*
 * - If there is default method in both interface with same name then java compiler would throw
 * error so we can not have that.
 * - But if we override the above method then compiler allows use to compile and it would point
 * to instance method in-place of pointing it to any default interface method.
 * - if method is not default then it doesn't matter as implementation of it would be inside
 *  the class definition. Here both interface have common method.
 */
public class ImplementerClass implements Interface1, Interface2 {

  @Override
  public void doThing() {
  } /// Try to comment this and then un-comments this.

  @Override
  public void doSomethingBetter() {
  }
}
