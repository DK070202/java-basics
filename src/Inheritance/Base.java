package Inheritance;

public class Base {

  int baseClassField;

  public Base(int baseValue) {
    baseClassField = baseValue;
  }

  static void doWork() {
    System.out.println("Base class is doing it's work");
  }

  int doCalculate(int... args) {
    int x = 0;
    for (int i : args) {
      x += i;
    }
    return x;
  }

  public static void main(String[] args) {
    Base child = new Base(10);
    System.out.println(child.baseClassField);
    int value = child.doCalculate(1, 2, 3, 4, 5);
    System.out.println(value);
    // child.doWork();
  }
}
