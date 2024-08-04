package DSA.src.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collection;

public class TestStreamFlatMap {
    public static void main(String[] args) {

        List<List<String>> namesNested = Arrays.asList(Arrays.asList("A","B"),
                Arrays.asList("C","D"),
                Arrays.asList("E","F"));

       // namesNested.stream().flatMap(Collection::stream).collect(Collectors.toList())

        List<String> namesFlatStream = namesNested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(namesFlatStream);
    }

}
