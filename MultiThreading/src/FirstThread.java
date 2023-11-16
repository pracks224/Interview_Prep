public class FirstThread implements Runnable{
    public static void main(String[] args) {
        FirstThread first = new FirstThread();
        FirstThread second = new FirstThread();
        Thread t1 = new Thread(first,"t1");
        Thread t2 = new Thread(second,"t2");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
      System.out.println("|||||||"+Thread.currentThread().getName());
    }
}
