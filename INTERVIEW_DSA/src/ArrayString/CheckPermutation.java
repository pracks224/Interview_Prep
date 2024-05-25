package DSA.src.ArrayString;

import java.util.Arrays;

public class CheckPermutation {
    public static void main(String[] args) {
        CheckPermutation perm1 = new CheckPermutation();
        boolean result = perm1.checkPerumatedOptimized("god", "dog");
        System.out.println("Result::" + result);
    }

    public boolean checkPerumated(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return (str1.length() != str2.length()) && new String(arr1).equals(new String(arr2));
    }
    //Another efficient approach
    public boolean checkPerumatedOptimized(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        int[] letters = new int[128];
        for(int i =0;i<str1.length();i++){
            int val = str1.charAt(i)-'a';
            letters[val]++;
        }
        for(int i =0;i<str2.length();i++){
            int val = str2.charAt(i)-'a';
            letters[val]--;
            if (letters[val] < 0) {
                return false;
            }
        }
        return true;
    }
}
