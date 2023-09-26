package String_practise;

import java.util.stream.Collectors;

public class CountChar {
    public static void main(String[] args) {
        String str = "abcde fgh";
       // str = str.replaceAll(" ","");
      //  System.out.println(str.toCharArray().length); // but this will count spaces as well.

        // Code review comments
        //For small string it's fine but for large one use StringBuilder.
        //Then name it like originalString and StringWithoutSpace etc.
        /* Same code in Java 8 Style */

        String strWithOutSpace = str.chars().filter(c ->c !=' ')
                .mapToObj(c->String.valueOf((char)c))
                .collect(Collectors.joining());
        System.out.println(strWithOutSpace);
    }
}
