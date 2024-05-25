package DSA.src.ArrayString;

public class CountA {
    public static int countA(String A){
        int len = A.length();
        int cnt = 0, i =0;
        int totalSubtring = 0;
        while(i<len-1){
            if(A.charAt(i) == 'a'){
                i++;
                cnt++;
                totalSubtring  += cnt;

            }
        }
        return totalSubtring;
    }
    public static void main(String[] args) {
        System.out.println(countA("aab"));
    }
}
