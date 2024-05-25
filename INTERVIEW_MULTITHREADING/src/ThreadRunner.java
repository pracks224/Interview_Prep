public class ThreadRunner extends Thread{

    @Override
    public void run() {
        for(int i =0;i<5;i++){
            System.out.println("Hello"+i+" "+"Thread::"+ Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String args[]){
        ThreadRunner runner1 = new ThreadRunner();
        ThreadRunner runner2 = new ThreadRunner();
        runner1.start();
        runner2.start();
    }
}
