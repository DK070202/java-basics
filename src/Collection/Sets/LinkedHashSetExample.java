package Collection.Sets;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

  public static void main(String[] args) {
    LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();

    hashSet.add(10);
    hashSet.add(20);
    hashSet.add(30);
    hashSet.add(50);
    System.out.println(hashSet);

    System.out.println(hashSet.remove(80));
    System.out.println(hashSet);

    hashSet.add(10);
    System.out.println(hashSet);
  }
}
