package DSA.src.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfSquares {
    public static void main(String[] args) {
        List<Integer> numArr = Arrays.asList(1,2,3,4,5);
        List<Integer> nums =numArr.stream().map(num->num*num).collect(Collectors.toList());
       // nums.forEach(x->System.out.println(x));
        nums.forEach(System.out::println);

    }
}
