package Inheritance.OverridingAndHiding;

public class MustangExample extends Object {

  public interface Mammal {
    String identifyMyself();
  }

  public static class Horse {

    public String identifyMyself() {
      return "I am a horse.";
    }
  }

  public static class Mustang extends Horse implements Mammal {

    public static void main(String... args) {
      Mustang myApp = new Mustang();
      System.out.println(myApp.identifyMyself());
    }
  }
}
