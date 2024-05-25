import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            final int tasked = i;
            executor.submit(() -> {
                System.out.println("Task::" + tasked + "Thread ::" + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
        executor.shutdown();
    }
/*
    static class Task implements Runnable {
        private final int taskId;

        Task(int taskId) {
            this.taskId = taskId;
        }

        public void run() {
            System.out.println("Task ::" + taskId + "is running on thread" + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // throw new RuntimeException(e);
                Thread.currentThread().interrupt();
            }
            System.out.println("Task" + taskId + "is complete");
        }
    } */
}
