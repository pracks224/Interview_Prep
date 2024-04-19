package INTERVIEW_CORE_JAVA;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListUniqueChars {
    public static Stream<Character> getAllUniqueChars(List<String> strs){
        Set<Character> uniqueChars = new HashSet<>();
        return strs.stream().
                 flatMapToInt(String::chars)
                .mapToObj(c -> (char) c)
                .filter(c -> uniqueChars.add(c));
    }
    public static void main(String[] args) {
      /*  List<String> list = new ArrayList<>();
        list.add("prakash");
        list.add("aakash");
        Stream<Character> charsList = getAllUniqueChars(list);
        charsList.forEach(System.out::println);*/

        //FlatMap Vs FlatMapInt
        // Create two lists of integers
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(3, 4);
        // Create a stream consisting of the two lists
        Stream<List<Integer>> streamOfIntegerLists = Stream.of(list1, list2);

        // Use flatMap to convert the stream of lists into a stream of integers
        // flatMap takes each list and converts it into a stream of integers,
        // then "flattens" these streams into a single stream
        Stream<Integer> flattenedStream = streamOfIntegerLists.flatMap(List::stream);
        // Iterate over the flattened stream and print each integer
        // followed by a space
        flattenedStream.forEach(s -> System.out.print(s + " "));

        // Create two lists of integers
        List<Integer> list13 = Arrays.asList(5, 6);
        List<Integer> list4 = Arrays.asList(7, 8);
        // Create a stream consisting of the two lists
        Stream<List<Integer>> streamOfIntegerLists2 = Stream.of(list13, list4);
       IntStream ints = streamOfIntegerLists2.flatMapToInt(list->list.stream().mapToInt(Integer::intValue));
       ints.forEach(s->System.out.println(s+" "));

    }
}
