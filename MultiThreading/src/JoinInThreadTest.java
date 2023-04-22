/*
 * The join() method of thread class waits for a thread to die. It is used when you want one thread to wait
 * for completion of another. This process is like a relay race where the second runner waits until
 * the first runner comes and hand over the flag to him.
 */
public class JoinInThreadTest extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
       /* JoinInThreadTest t1 = new JoinInThreadTest();
        JoinInThreadTest t2 = new JoinInThreadTest();
        JoinInThreadTest t3 = new JoinInThreadTest();
        t1.start();
        try {
            t1.join(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        t3.start();*/
        //Yield vs Join
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: " + i);
                if(i==3)
                Thread.yield();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: " + i);
            }
        });

        t1.start();
        t2.start();

       /* try {
            t1.join(); // wait for t1 to complete
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        System.out.println("Main thread exiting");
    }
}
