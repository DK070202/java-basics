package Generics;

import java.util.List;

public class GenericBounds {

  public static void main(String[] args) {
    storeValue(10.1);
  }

  public static <T> int countGreaterThan(T[] anArray, T elem) {
    int count = 0;
    return count;
  }

  public static <T extends Number> double sumOfList(List<T> list) {
    double s = 0.0;
    for (Number n : list) s += n.doubleValue();
    return s;
  }

  public static <T> void storeValue(T value) {
    System.out.println(value instanceof Double);
  }
}
