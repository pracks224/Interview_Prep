package String_practise;

import java.util.Arrays;
import java.util.Locale;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "Cat";
        String str2 = "taC";
        System.out.println(checkAnagram(str1, str2));
        //Java 8 Approach
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str1.replaceAll("\\s","").toLowerCase();
        System.out.println(Arrays.equals(str1.chars().sorted().toArray(),str2.chars().sorted().toArray()));
    }

    public static boolean checkAnagram(String str1, String str2) {
        int[] charCount = new int[256];
        if (str1.length() != str2.length()) {
            return false;
        } else {
            for (char c : str1.toCharArray()) {
                charCount[c]++;
            }
            for (char c : str2.toCharArray()) {
                charCount[c]--;
            }
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
