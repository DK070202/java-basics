package Collection.Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class LinkedListExample {

  public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<String>();
    strings.add("id");
    strings.add("name");
    strings.add("first name");
    strings.add("last name");

    System.out.println(strings);

    Iterator<String> iterator = strings.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    var v = strings
      .stream()
      .map(value -> value.length())
      .collect(Collectors.toList());

    System.out.println(v);

    System.out.println(strings.poll());

    System.out.println(strings);

    System.out.println(strings.pollLast());

    System.out.println(strings);

    strings.offerFirst("Offered first");

    System.out.println(strings);

    strings.offerLast("Offered last");

    System.out.println(strings);
  }
}
