package String_practise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringMatch {
    public static void main(String[] args) {
        String text = "One fish,Two fish,Blue fish,Red fish";
        System.out.println(countOcuurences("fish",text));
    }

    public static int countOcuurences(String search,String text){

        Pattern pattern = Pattern.compile(search);
        Matcher matcher = pattern.matcher(text);
        int countOccurences = 0;
        while(matcher.find()){
            countOccurences++;
        }
        return countOccurences;
    }
}
