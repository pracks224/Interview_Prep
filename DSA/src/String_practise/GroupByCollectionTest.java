package DSA.src.String_practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByCollectionTest {
    public static void main(String[] args) {

        List<String> listFruits = new ArrayList<>();
        listFruits.add("apple");
        listFruits.add("custard apple");
        listFruits.add("orange");
        listFruits.add("banana");
        listFruits.add("apple");
        listFruits.add("orange");

       Map<String,Long> countedCollection =  listFruits.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

      System.out.println(countedCollection);
    }
}
