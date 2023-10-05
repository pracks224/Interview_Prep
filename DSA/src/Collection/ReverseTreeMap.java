package Collection;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> reverseTreeMap = new TreeMap<>(Comparator.<String>reverseOrder());
        reverseTreeMap.put("Maggie", 2);
        reverseTreeMap.put("Chocolate", 5);
        reverseTreeMap.put("Salt", 1);
        reverseTreeMap.put("Sugar", 3);
        reverseTreeMap.put("Biscuit", 4);

        System.out.println(reverseTreeMap.keySet());

        System.out.println("To Key: " +
                reverseTreeMap.headMap("Biscuit").entrySet());

        //Top 3 elements
        NavigableSet<String> map = reverseTreeMap.keySet().stream().limit(3).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(map);
    }
}
/**
    1.  Why Do We Need TreeMap?
        There are multiple reasons why we need TreeMap.

        As the entries are stored in the map in sorted order, we can get the first and last entries very easily.
        There are many inbuilt functions that can be used to get part of the map.
    2.
**/
