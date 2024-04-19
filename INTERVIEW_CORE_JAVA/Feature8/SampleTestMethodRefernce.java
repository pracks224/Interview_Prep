package INTERVIEW_CORE_JAVA.Feature8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SampleTestMethodRefernce {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("a","A","b","C");
        strList.sort(String::compareToIgnoreCase);
        strList.forEach(System.out::println);

        // What is the equivalent method refernce
        //Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
        Function<String, Integer> stringToInteger = Integer::parseInt;
       // stringToInteger.apply("123");
        System.out.println(stringToInteger.apply("123"));
    }
}
