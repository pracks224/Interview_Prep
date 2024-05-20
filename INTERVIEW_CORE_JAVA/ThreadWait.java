package INTERVIEW_CORE_JAVA;

public class ThreadWait {
    public static void main(String[] args) {
        final Object lock = new Object();
        Thread threadA = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread A");
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread B");
            }
        }

        );

        Thread threadC = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread C");
                lock.notifyAll();

            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
