package Stream;


import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "Java articles are awesome";
        Set<Character> set = new HashSet<>();
        str.chars().dropWhile(c -> !set.add(Character.valueOf('c')) && set.size() == 1).findFirst().ifPresent(
               c-> System.out.println((char)c));

        //Second Approach
        Character result = str.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue() == 1L)
                .map(entr->entr.getKey())
                .findFirst()
                .get();
        System.out.println(result);

    }
}
