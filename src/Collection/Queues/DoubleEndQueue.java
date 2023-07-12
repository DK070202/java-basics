package Collection.Queues;

import java.util.ArrayDeque;

public class DoubleEndQueue {

  public static void main(String[] args) {
    ArrayDeque<String> doubleEndQueue = new ArrayDeque<String>();
    doubleEndQueue.offer("Simply Offered");
    doubleEndQueue.offerFirst("Offered first");
    doubleEndQueue.offerLast("Offered last");
    System.out.println(doubleEndQueue);

    String peekFirst = doubleEndQueue.peekFirst();
    String peekLast = doubleEndQueue.peekLast();
    System.out.println(peekFirst + peekLast);

    String polledString1 = doubleEndQueue.pollFirst();
    String polledString2 = doubleEndQueue.pollLast();
    System.out.println(polledString1 + polledString2);

    System.out.println(doubleEndQueue);
  }
}
