public class OuterClass {

  public class InnerClass {

    public InnerClass() {}

    public void innerMethod() {
      System.out.println("Inner Method");
    }
  }

  public void outerMethod() {
    InnerClass innerObject = new InnerClass();
    innerObject.innerMethod();
  }
}
