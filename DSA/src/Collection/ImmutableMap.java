package Collection;

import java.util.Map;

public class ImmutableMap {

    public static void main(String[] args) {
        Map<Integer, String> immutableMap = Map.of(
                1, "Geeks",
                2, "For",
                3, "Geeks");

        System.out.println(immutableMap);

        immutableMap.put(4, "Computer");
        immutableMap.put(5, "Portal");

        System.out.println(immutableMap);

        //Another approach would be Collection.unModifiableMap(immutableMap);
    }
}
