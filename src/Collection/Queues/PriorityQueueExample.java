package Collection.Queues;

import java.util.PriorityQueue;
import java.util.Random;

/*
 * Based on the comparator condition the first element will be the target element.
 *
 * Example: In case comparison of integer, the smallest integer will be always first.
 */
public class PriorityQueueExample {

  public static void main(String[] args) {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(
      Integer::compare
    );

    for (int i = 0; i < 10; i++) {
      Random random = new Random();
      int value = random.nextInt(100);
      priorityQueue.add(value);
    }

    System.out.println(priorityQueue);

    for (int i = 0; i < 5; i++) {
      priorityQueue.poll();
      System.out.println(priorityQueue);
    }
  }
}
