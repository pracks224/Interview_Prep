package DSA.src.String_practise;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationTest {

    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
           list.add(10);
        }
        System.out.println(list);

    }

    public static class RotationArray {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4};
            int arrSize = 4;
            int numRotation = 2;
            int k = numRotation%arrSize;
            for(int i =0;i<arrSize;i++){
                if(i<k)
                    System.out.print(arr[arrSize+i-k]);
                else
                    System.out.print(arr[i-k]);
                System.out.print(" ");

            }
        }
        }
}
