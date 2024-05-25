public class OddEvenTwoThread {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(new EvenPrinter(counter));
        Thread t2 = new Thread(new OddPrinter(counter));
        t1.start();
        t2.start();
        /*
        When you call the run() method on a Thread object, the thread's code is executed in the same thread that made the method call, just like any other regular method call. In contrast, when you call the start()
        method on a Thread object, a new thread is created and the thread's code is executed in that new thread.

So, if you call the run() method instead of the start() method on a Thread object,
the code will still execute, but it will execute in the same thread as the calling thread, without any additional concurrency. This means that the program will not be able to take advantage of the benefits of multithreading, such as parallelism and improved performance.

In summary, calling the run() method on a Thread object does not start a new thread;
instead, it simply executes the thread's code in the calling thread's context, while calling the start() method creates a new thread and executes the thread's code in that new thread's context.
         */
    }
}

class EvenPrinter implements Runnable {
    private final Counter counter;

    EvenPrinter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getValue() <= 100) {
            synchronized (counter) {
                if ((counter.getValue() & 1) == 0) {
                    System.out.println("Even:" + counter.getValue());
                    counter.increment();
                }
            }
        }
    }
}

class OddPrinter implements Runnable {
    private final Counter counter;


    OddPrinter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getValue() <= 100) {
            synchronized (counter) {
                if ((counter.getValue() & 1) != 0) {
                    System.out.println("Odd:" + counter.getValue());
                    counter.increment();
                }
            }
        }
    }
}

class Counter {
    private int value = 1;

    public synchronized int getValue() {
        return value;
    }

    public synchronized void increment() {
        value++;
    }
}
