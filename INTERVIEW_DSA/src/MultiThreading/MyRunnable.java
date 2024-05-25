package DSA.src.MultiThreading;

public class MyRunnable implements Runnable {
    private final long waitTime;

    public MyRunnable(long waitTime) {
        this.waitTime = waitTime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(waitTime);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
