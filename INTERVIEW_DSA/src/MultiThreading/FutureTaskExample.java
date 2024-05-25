package DSA.src.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class FutureTaskExample {
    public static void main(String[] args) {
        MyRunnable myrunnableobject1 = new MyRunnable(1000);
        MyRunnable myrunnableobject2 = new MyRunnable(2000);
        FutureTask<String> futureTask1 = new FutureTask<>(myrunnableobject1, "FutureTask1 complete");
        FutureTask<String> futureTask2 = new FutureTask<>(myrunnableobject2, "FutureTask2 complete");

        // create thread pool of 2 size for ExecutorService
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(futureTask1);
        // submit futureTask2 to ExecutorService
        executor.submit(futureTask2);
        try {
            if (futureTask1.isDone() && futureTask2.isDone()) {
                System.out.println("Both Future Task Done!!");
                executor.shutdown();
                return;
            }

            if (!futureTask1.isDone()) {
                // wait indefinitely for future
                // task to complete
                System.out.println("FutureTask1 output = "
                        + futureTask1.get());
            }
            System.out.println("Waiting for FutureTask2 to complete");

            // Wait if necessary for the computation to complete,
            // and then retrieves its result
            String s = futureTask2.get(250, TimeUnit.MILLISECONDS);

            if (s != null) {
                System.out.println("FutureTask2 output=" + s);
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

    }
}
