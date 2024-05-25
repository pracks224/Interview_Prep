package DSA.src.ArrayString;

public class ClosestPalindrome {
    public static final String Y = "YES";
    public static final String N = "NO";

    public static String solve(String A) {
        int len = A.length();
        int i = 0;
        int j = len - 1;
        int cnt = 0;
        while (i <= j) {
            if (A.charAt(i) != A.charAt(j)) {
                cnt++;
                if (len % 2 == 0) {
                    if (cnt > 2) {
                        return N;
                    }
                } else {
                    if (cnt > 1)
                        return N;
                }
            }
            i++;
            j--;
        }
        return len % 2 ==0 ?N:Y;
    }

    public static void main(String[] args) {
        System.out.println(solve("aaaaaaaaaabaaaaaaaaa"));
    }
}
