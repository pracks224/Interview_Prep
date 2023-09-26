package DSA.src.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllPairsOfNums {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        int sum = list1.stream().reduce(0,(a,b)->(a+b));
        //another way
        int sum2 = list1.stream().reduce(0,Integer::sum);
        System.out.println(sum2);
        List<Integer> list2 = Arrays.asList(3, 4);
        List<int[]> pairs = list1.stream().flatMap(i -> list2.stream().filter(j->(i+j) % 3 == 0).map(j ->  new int[]{i, j}))
                .collect(Collectors.toList());
        pairs.forEach(x -> System.out.println(Arrays.toString(x)));

    }
}
