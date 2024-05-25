public class StartingThread implements Runnable{
    @Override
    public void run() {
        for(int i =0;i<5;i++){
            System.out.println("Hello"+i+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new StartingThread());
        Thread thread2 = new Thread(new StartingThread());
        thread1.start();
        thread2.start();
    }
}
