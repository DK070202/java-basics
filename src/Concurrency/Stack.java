package Concurrency;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>(10);

    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        stack.add(i);
      }
    });

    Thread thread2 = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        stack.remove(i);
      }
    });

    thread1.start();

    thread2.start();
  }

  final List<T> que;
  final int capacity;

  Stack(int capacity) {
    que = new ArrayList<T>();
    this.capacity = capacity;
  }

  public boolean add(T value) {
    synchronized (que) {
      while (que.size() == capacity) {
        try {
          que.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      que.add(value);
      que.notifyAll();
      return true;
    }
  }

  public T remove(T value) {
    synchronized (que) {
      while (que.size() == 0) {
        try {
          que.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      que.remove(value);
      que.notifyAll();
      return value;
    }
  }

  @Override
  public String toString() {
    return "Stack [que=" + que + ", capacity=" + capacity + "]";
  }
}
