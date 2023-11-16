public class ThreadAnonymous {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<5;i++) {
                    System.out.println("Thread"+i+" "+Thread.currentThread().getName());
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
    }
}
