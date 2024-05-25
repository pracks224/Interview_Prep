package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IfDuplicateExists {

    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,10};
       boolean result = Arrays.stream(nums).boxed().collect(Collectors.toSet()).size() !=nums.length;
        System.out.println(result);
        System.out.println("1"+java.time.LocalDate.now());
        System.out.println("2"+java.time.LocalDateTime.now());
        System.out.println("3"+java.time.LocalTime.now());

        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");
        Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
        concatStream.forEach(str->System.out.print(str + " "));
    }
}
