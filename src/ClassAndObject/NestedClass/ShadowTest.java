package ClassAndObject.NestedClass;

/*
 * Takeaways: When there is duplication of naming in inner class here in this case x, then reference of
 * it depends on the scope of the deceleration.
 *
 * To access that definition `this` can be used.
 */
public class ShadowTest {

  public int x = 0;

  class FirstLevel {

    public int x = 1;

    void methodInFirstLevel(int x) {
      this.x = 23;
      System.out.println("x = " + x);
      System.out.println("this.x = " + this.x);
      System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
    }
  }

  public static void main(String... args) {
    ShadowTest st = new ShadowTest();
    ShadowTest.FirstLevel fl = st.new FirstLevel();
    fl.methodInFirstLevel(23);
  }
}
