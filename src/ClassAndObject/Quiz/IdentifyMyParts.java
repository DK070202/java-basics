package ClassAndObject.Quiz;

public class IdentifyMyParts {

  public static int x = 7;
  public int y = 3;

  public static void main(String[] args) {
    IdentifyMyParts a = new IdentifyMyParts();
    IdentifyMyParts b = new IdentifyMyParts();
    a.y = 5;
    b.y = 6;
    IdentifyMyParts.x = 1;
    IdentifyMyParts.x = 2;
    System.out.println("a.y = " + a.y);
    System.out.println("b.y = " + b.y);
    System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
  }
}
