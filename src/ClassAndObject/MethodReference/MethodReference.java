package ClassAndObject.MethodReference;

import java.util.function.BiFunction;

public class MethodReference {

  public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
    return merger.apply(a, b);
  }

  public static String appendStrings(String a, String b) {
    return a + b;
  }

  public String appendStrings2(String a, String b) {
    return a + b;
  }

  public static void main(String[] args) {
    MethodReference myApp = new MethodReference();

    // Calling the method mergeThings with a lambda expression
    System.out.println(
      MethodReference.mergeThings("Hello ", "World!", (a, b) -> a + b)
    );

    // Reference to a static method
    System.out.println(
      MethodReference.mergeThings(
        "Hello ",
        "World!",
        MethodReference::appendStrings
      )
    );

    // Reference to an instance method of a particular object
    System.out.println(
      MethodReference.mergeThings("Hello ", "World!", myApp::appendStrings2)
    );

    // Reference to an instance method of an arbitrary object of a
    // particular type
    System.out.println(
      MethodReference.mergeThings("Hello ", "World!", String::concat)
    );
  }
}
