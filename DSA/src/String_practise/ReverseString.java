package DSA.src.String_practise;

public class ReverseString {

    public static void main(String[] args) {
        String str1 = "abcd";
        int i = str1.length()-1;
        String rev ="";
        while(i>=0){
            rev += str1.charAt(i);
            i--;
        }
        System.out.println(rev);

        // Java 8 style
        str1 = str1.chars().mapToObj(c->(char)c).reduce("", (s, c) -> c + s, (s1, s2) -> s2);
        System.out.println("Str==>"+str1);
    }
}
