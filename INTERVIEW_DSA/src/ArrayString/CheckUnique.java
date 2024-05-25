package DSA.src.ArrayString;

public class CheckUnique {
    public static void main(String[] args) {
        CheckUnique q1 = new CheckUnique();
        boolean resp = q1.checkUniqueUsingBitWise("imcdc");
        if (resp)
            System.out.println("All Unique");
        else
            System.out.println("Not unique");
    }
 // TC - O(n) and SC - O(1)
    public boolean checkUnique(String str) {
        boolean[] checkArr = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            if (checkArr[val]) {
                return false;
            }
            checkArr[val] = true;
        }
        return true;
    }

    //Using bit wise
    public boolean checkUniqueUsingBitWise(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            System.out.println((1 << val));
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }


}
