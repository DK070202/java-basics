package Collection.Arrays;

import java.util.Random;
import java.util.Stack;

public class StackExample {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

    for (int i = 0; i < 10; i++) {
      Random random = new Random();
      int value = random.nextInt(100);
      stack.push("value:" + value);
    }

    System.out.println(stack);

    System.out.println(stack.peek());

    System.out.println(stack.pop());

    System.out.println(stack);
  }
}
