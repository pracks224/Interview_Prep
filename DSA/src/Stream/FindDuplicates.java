package Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,10,11,12,30);
        //Count all the elements
        System.out.println(list.stream().count());
        //Find the first element
        list.stream().findFirst().ifPresent(System.out::println);
        //Find the Maximum
        System.out.println(list.stream().max(Integer :: compare));
        Set<Integer> set = new HashSet<>();
        list.stream().filter(n->!set.add(n)).forEach(System.out::println);
    }
}
