package Stream;

import java.util.Arrays;
import java.util.List;

public class ListIntegers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,15,8,49,25,98,32);
        nums.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
