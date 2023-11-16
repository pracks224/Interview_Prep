import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumberPrinter  implements Runnable{
    @Override
    public void run() {
       System.out.println("Thread name ::"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
       // ExecutorService executor = Executors.
    }
}
