import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SynchronizedListTest implements Runnable {//extends Thread{
    //synchronized list
   // private static List<Employee> queue = Collections.synchronizedList(new ArrayList<>());
//synchronized list
    private static BlockingQueue<Employee> queue = new LinkedBlockingQueue<Employee>();
    public void run(){
        System.out.println("Thread Is running!!!!"+Thread.currentThread().getName());
        while(!queue.isEmpty()){
            for(int i = 0;i<queue.size();i++){
                System.out.println(Thread.currentThread().getName()+"::::::::"+ queue.poll().getName());
            }
        }
    }
    public static void main(String[] args) {
        SynchronizedListTest test = new SynchronizedListTest();
        queue.add(new Employee("A"));
        queue.add(new Employee("B"));
        queue.add(new Employee("C"));
        queue.add(new Employee("D"));
        queue.add(new Employee("E"));
        Thread t1 = new Thread(test,"Thread 1");
        Thread t2 = new Thread(test,"Thread 2");
        t1.start();
        t2.start();
    }
}
