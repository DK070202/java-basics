package Collection.Arrays;

import java.util.*;

public class ArrayListExample {

  public static void main(String[] args) {
    ArrayList<String> users = new ArrayList<String>();
    users.add("Dhruvin");
    users.add("Hiten");
    users.add("Jay");
    System.out.println(users);

    users.remove(0);
    users.add(2, "Dhruvin");
    System.out.println(users);

    users.removeIf(v -> v == "Dhruvin");
    users.forEach(System.out::println);
    users.contains("Dhruvin");
  }
}
