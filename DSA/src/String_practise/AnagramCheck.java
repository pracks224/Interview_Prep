package DSA.src.String_practise;

import java.util.HashMap;
import java.util.Set;

public class AnagramCheck {
    public static void main(String[] args) {
        String st1 = "abcd";
        String st2 = "badc";
        if (st1.length() != st2.length()) {
            System.out.println("Not Anagram");
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < st1.length(); i++) {
            if (map.containsKey(st1.charAt(i))) {
                map.put(st1.charAt(i), map.get(st1.charAt(i)) + 1);
            } else {
                map.put(st1.charAt(i), 1);
            }
        }

        for (int i = 0; i < st2.length(); i++) {
            if (map.containsKey(st2.charAt(i))) {
                map.put(st2.charAt(i), map.get(st1.charAt(i)) - 1);
            } else {
                System.out.println("Not an Anagram");
                break;
            }
        }

        Set<Character> keys =  map.keySet();
        for(Character key : keys){
if(map.get(key) != 0){
    System.out.println("Not an angarma");
}
        }

    }
}
