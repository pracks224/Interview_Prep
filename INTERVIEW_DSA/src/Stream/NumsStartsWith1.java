package Stream;

import java.util.Arrays;
import java.util.List;

public class NumsStartsWith1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,15,8,49,25,98,32);
        nums.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
    }
}
