package String_practise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CountVowelConsonants {
    public static void main(String[] args) {
        String originalString = "This is really simple sentence";
        Pattern vowelPattern = Pattern.compile("[aeiouAEIOU]");
        Matcher match = vowelPattern.matcher(originalString);
        System.out.println(match.results().count());

        //Same in Java 8 style
        long vowelcount = originalString.chars()
                .mapToObj(c->(char)c)
                .map(Character::toLowerCase)
                .filter(c->"aeiou".contains(String.valueOf(c)))
                .count();
        System.out.println(vowelcount);

    }
}
