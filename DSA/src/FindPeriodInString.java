public class FindPeriodInString {
    public static void main(String[] args) {
        String[] testStrings
                = {"abcaabcaab", "ABABAB", "ABCDABCD","GEEKSFORGEEKS", "GEEKGEEK", "ABCABC","ABCDABC"};
        int n = testStrings.length;
        for (int i = 0; i < n; i++) {
            if (findPeriod(testStrings[i]) == -1)
                System.out.println("false");
            else
                System.out.println("True");
        }
    }
    public static int findPeriod(String str) {
        int length = str.length();
        int period = -1;
        int i = 0;
        for (int j = 1; j < length; j++) {
            int currentChar = str.charAt(j);
            int comparator = str.charAt(i);
            if (currentChar == comparator) {
                period = j - i;
                i++;
            } else {
                if (currentChar == str.charAt(0)) {
                    i = 1;
                    period = j;
                } else {
                    i = 0;
                    period = -1;
                }
            }

        }
       // period = (length % period != 0) ? -1 : period;
        return period;
    }
}
