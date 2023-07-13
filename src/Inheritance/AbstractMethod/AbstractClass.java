package Inheritance.AbstractMethod;

/*
 * Only abstract class can have abstract methods.
 * - The abstract class should be used at place where we want some related methods to be common and
 * interface can be used when we want some common in the un-related class.
 * - Example for interface: Comparator for object comparison in HasSet.
 * - Example for Abstract class: The AbstractMap of collection framework.
 */
abstract class AbstractClass {

  public abstract void doSomething();
}
