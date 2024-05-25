package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatteingStream {
    public static void main(String[] args) {
        List<String>  list = new ArrayList<>();
        list.add("Prakash");
        list.add("lemon");
        list.add("maango");
        List<String> flattenList = list.stream().map(str->str.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        for(String strs: flattenList){
            System.out.print(strs +" ");
        }

    }
}
