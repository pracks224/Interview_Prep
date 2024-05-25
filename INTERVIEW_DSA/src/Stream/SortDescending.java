package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDescending {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,9,90,100,56,75);
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
