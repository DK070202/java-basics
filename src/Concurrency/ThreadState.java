package Concurrency;

/**
 * ThreadState
 */
public class ThreadState {

  public static void main(String[] args) {
    Thread thread = new Thread(() -> {
      for (int i = 0; i < 20; i++) {
        System.out.println(i);
      }
    });

    thread.start();

    while (true) {
      Thread.State state = thread.getState();
      if (state == Thread.State.TERMINATED) break;
      System.out.println(state);
    }
  }
}
