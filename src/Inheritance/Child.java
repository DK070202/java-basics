package Inheritance;

/*
 * Take away:
 * - Child class can override field deceleration of it's parent class.
 * - Child class can override default and static method delectation inside.
 */
public class Child extends Base {

  int baseValue = 2;

  Child(int childValue) {
    super(childValue);
    baseValue *= childValue;
  }

  static void doWork() {
    System.out.println("Child class is doing it's work");
  }

  int doCalculate(int... args) {
    int x = 0;
    for (int i : args) {
      x += i;
    }
    return x + 1;
  }

  public static void main(String[] args) {
    Child child = new Child(10);
    System.out.println(child.baseClassField);
    int value = child.doCalculate(1, 2, 3, 4, 5);
    System.out.println(value);
    // child.doWork();
  }
}
