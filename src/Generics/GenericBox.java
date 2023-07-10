package Generics;

/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
public class GenericBox<T> {

  private T t;

  public void set(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }

  /**
   * IntBox
   */
  public class IntBox extends GenericBox<Integer> {}

  /**
   * DoubleBox
   */
  public class DoubleBox extends GenericBox<Double> {}

  public GenericBox<Integer> invokeGenericBox() {
    return new GenericBox<Integer>(); // Normal one
  }

  public GenericBox<Integer> invokeDiamondGenericBox() {
    return new GenericBox<>(); // Diamond parametrized generic box.
  }
}
