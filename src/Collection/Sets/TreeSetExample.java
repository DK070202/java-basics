package Collection.Sets;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetExample {

  public static void main(String[] args) {
    TreeSet<Integer> treeSet = new TreeSet<>();

    for (int i = 0; i < 10; i++) {
      Random random = new Random();
      int value = random.nextInt(100);
      treeSet.add(value);
    }

    System.out.println(treeSet);
  }
}
