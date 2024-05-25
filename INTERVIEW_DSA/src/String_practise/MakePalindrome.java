package DSA.src.String_practise;

public class MakePalindrome {
    //Approach -1
   /* public static int solve(String str){
        int count = 0;
        int left = 0;
        int right = str.length() - 1;
        int equalCnt =0;
        while (left<=right) {
            if (str.charAt(left) == str.charAt(right)) {
                equalCnt++;
                left++;
                right--;
            } else {
                // Move right pointer one step to the left
                right--;
                count++;
            }
        }

        return count>0?count+equalCnt:count;
   }*/
    public static int solve(String str) {
        StringBuilder s = new StringBuilder(str);
        String rev = s.reverse().toString();
        s.reverse();
        s.append("@").append(rev);
        int[] lps = createLPS(s.toString());
        int minCharToAdd = str.length() - lps[lps.length - 1];
        return minCharToAdd;
    }

    private static int[] createLPS(String p) {
        int[] lps = new int[p.length()];
        int i = 1;
        int len = 0;
        while (i < p.length()) {
            if (p.charAt(i) == p.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len > 0) {
                    len = lps[len - 1];
                } else {
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        String input = "babb";//"hqghumeaylnlfdxfi";
        int minChars = solve(input);
        System.out.println("Minimum characters needed to make the string palindrome: " + minChars);

    }
}
