package Collection.Sets;

import java.util.HashSet;

public class HashSetExample {

  public static void main(String[] args) {
    HashSet<Integer> hashSet = new HashSet<Integer>();

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
