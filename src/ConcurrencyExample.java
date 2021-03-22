import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrencyExample extends Thread {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + "   this line");

    Runnable runnable = () -> {
      try {
        String name = Thread.currentThread().getName();
        System.out.println("Foo " + name);
        Thread.sleep(5000);
        System.out.println("Bar " + name);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
    };
    Thread thread = new Thread(runnable);
    thread.start();
    thread.run();

    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.submit(() -> {
      String threadName = Thread.currentThread().getName();
      System.out.println("Hello " + threadName);
    });

    try {
      System.out.println("attempt to shutdown executor");
      executor.shutdown();
      executor.awaitTermination(5, TimeUnit.SECONDS);
    }
    catch (InterruptedException e) {
      System.err.println("tasks interrupted");
    }
    finally {
      if (!executor.isTerminated()) {
        System.err.println("cancel non-finished tasks");
      }
      executor.shutdownNow();
      System.out.println("shutdown finished");
    }
  }
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName());
  }
}
