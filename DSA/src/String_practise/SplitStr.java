package String_practise;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SplitStr {
    public static void main(String[] args) {
        String str = "What    do you need   for me?";
        String[] strArr = str.split("\\s+");
        System.out.println(Arrays.toString(strArr));

        String s = "a|b|c||e";
        String[] arr = s.split("\\|",-1);
        System.out.println(Arrays.toString(arr));

        String strK = "the lazy fox jumped over the brown fence";
        StringTokenizer token = new StringTokenizer(strK);
        while(token.hasMoreTokens()){
            System.out.println(token.nextToken());
        }

        //Tokenizer with Delimiters
        String strJ = "Jumped Over";
        StringTokenizer tokenizer = new StringTokenizer(strJ,"ue");
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }

        // Joining Stirng array with delimiter
        String[] strAR1 = {"abc","def","geh"};
        String singleString = String.join("|",strAR1);
        System.out.println(singleString);

        //Usage of StringJoiner

        StringJoiner joiner = new StringJoiner("++");
        joiner.add("Prakash");
        joiner.add("Sharma");
        System.out.println(joiner);

        //Joining Stream of String
        Stream<String> stringStream = Stream.of("foo","boo","fooboobar");
        String checkFinal = stringStream.collect(Collectors.joining(",","{","}"));
        System.out.println(checkFinal);

        //Very Important Concept
        String s1 = "abc";
        String s2 = "def";
        String s3 = s1+s2;
        //Under the hood it works using the StringBuilder
        //But the same optimization wont work if we are using tit inside the loop as it creates
        // new instances of StringBuilder every time.
        String result = "";
        for(int i = 0; i < strAR1.length; i++) {
            result += strAR1[i];
        }
        System.out.println(result);
       // If multiple threads on same String modifies better use StringBuffer

    }
}
