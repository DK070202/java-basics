package ClassAndObject.NestedClass;

import java.util.ArrayList;
import java.util.List;

import ClassAndObject.Objects.Rect;

public class Filter<T> {

  public static void main(String[] args) {
    List<Rect> recta = new ArrayList<Rect>();

    for (int i = 0; i < 20; i++) {
      recta.add(new Rect(100 * i, 2 * i));
    }

    Filter<Rect> filter = new Filter<Rect>();
    filter.performFilter(
        recta,
        p -> p.getArea() >= 300,
        p -> System.out.println(p));
  }

  public abstract interface Criteria<T> {
    public boolean performFilter(T value);
  }

  public abstract interface OnConfirmCriteria<T> {
    public void onMatch(T value);
  }

  public void performFilter(
      List<T> inputs,
      Criteria<T> criteria,
      OnConfirmCriteria<T> onConfirmCriteria) {
    for (T t : inputs) {
      if (criteria.performFilter(t)) {
        onConfirmCriteria.onMatch(t);
      }
    }
  }
}
