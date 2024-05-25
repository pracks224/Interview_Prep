import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ManualThreadPoolExample {
    public static void main(String[] args) {
        int threadCount = 5;
        int totalTasks = 50;

        // Create an array to hold thread references
        Thread[] threads = new Thread[threadCount];

        // Create a blocking queue to hold tasks
        BlockingQueue<Integer> taskQueue = new ArrayBlockingQueue<>(totalTasks);

        // Enqueue tasks
        for (int i = 1; i <= totalTasks; i++) {
            taskQueue.offer(i);
        }

        // Create and start the threads
        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(new TaskExecutor(taskQueue));
            threads[i].start();
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static class TaskExecutor implements Runnable {
        private final BlockingQueue<Integer> taskQueue;

        TaskExecutor(BlockingQueue<Integer> taskQueue) {
            this.taskQueue = taskQueue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Integer taskId = taskQueue.poll();
                    if (taskId == null) {
                        break;
                    }
                    System.out.println("Task " + taskId + " is executed by Thread " + Thread.currentThread().getName());
                    Thread.sleep(1000); // Simulating work with a sleep
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}