package String_practise;

import java.util.Scanner;

public class ChnageCaseChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = scanner.next();
        char[] chArr = s.toCharArray();
        System.out.println("Enter the Character you want to look up");
        System.out.println(s);
        String ch = scanner.next();
        char d = ch.charAt(0);

        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] == d) {
                if (d >= 'a' && d <= 'z') {
                    d -= 32;
                } else if (d >= 'A' && d <= 'Z') {
                    d += 32;
                }
                chArr[i] = d;
                break;
            }
        }
        s = String.valueOf(chArr);
        System.out.println(s);
    }
}
