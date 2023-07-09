package ClassAndObject.NestedClass;

/*
 * - The nested class are divided into 2 categories:
 * - 1. Static Nested Class
 * - 2. Inner class -> It's default accessible vai object of outer class only.
 */
public class NestedClass {

  public static void main(String[] args) {
    System.out.println("Inner class:");
    System.out.println("------------");
    NestedClass outerObject = new NestedClass();
    NestedClass.InnerClass innerObject = outerObject.new InnerClass();
    innerObject.accessMembers();

    System.out.println("\nStatic nested class:");
    System.out.println("--------------------");
    StaticNestedClass staticNestedObject = new StaticNestedClass();
    staticNestedObject.accessMembers(outerObject);
  }

  String outerField = "Outer field";
  static String staticOuterField = "Static outer field";

  int x = 0;

  private void doCall() {}

  /* This class should not define any kinda static variables as it associated with object of the
   *  NestedNestedClass
   */
  class InnerClass {

    InnerClass() {
      x = 1;
      doCall();
    }

    void accessMembers() {
      System.out.println(outerField);
      System.out.println(staticOuterField);
    }
  }

  /* This is Static nested class it can instantiated without the object of Enclosing or parent class
   * so it can contain static field.
   */
  public static class StaticNestedClass {

    void accessMembers(NestedClass outer) {
      // Compiler error: Cannot make a static reference to the non-static
      //     field outerField
      // System.out.println(outerField);
      System.out.println(outer.outerField);
      System.out.println(staticOuterField);
    }
  }
}
