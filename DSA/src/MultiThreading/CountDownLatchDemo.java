package DSA.src.MultiThreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        Worker thread1 = new Worker(1000,latch,"WORKER 1");
        Worker thread2 = new Worker(2000,latch,"WORKER 2");
        Worker thread3 = new Worker(3000,latch,"WORKER 3");
        Worker thread4 = new Worker(4000,latch,"WORKER 4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        // The main task waits for four threads
        latch.await();

        // Main thread has started
        System.out.println(Thread.currentThread().getName() +
                " has finished");


    }
}
