package ClassAndObject.KeyWords;

/*
 * Key takeaways.
 * - You can not call this class with same constructor, while using contractor overloading
 *   on can call `this()` as constructor but can ont call constructor which have same kind.
 */
public class This {

  int x;
  int y;

  public This(int xCord) {
    // this(xCord); -> Invalid invocation.
    this.x = xCord;
  }

  public This(int xCord, int yCord) {
    this(xCord);
    this.y = yCord;
  }

  public static void main(String[] args) {}
}
