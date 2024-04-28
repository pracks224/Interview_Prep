package DSA.src.ArrayString;

public class BoringSubString {

    public static int checkBoring(String str){
        int oddIndx = Integer.MAX_VALUE;
        int evenIndx = Integer.MIN_VALUE;
        for(int i = 0;i<str.length();i++){
            int ids = str.charAt(i)-'a' + 1;
            if(ids %2 == 0){
                evenIndx = Math.max(ids,evenIndx);
            }else{
                oddIndx = Math.min(ids,oddIndx);
            }
        }
        return  Math.abs(evenIndx-oddIndx)>1 ?1:0;
    }

    public static void main(String[] args) {
        System.out.println(checkBoring("abcd"));
    }
}
