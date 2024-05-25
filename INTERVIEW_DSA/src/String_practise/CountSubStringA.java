package DSA.src.String_practise;

import java.util.function.Consumer;

public class CountSubStringA {
    public int solve(String A) {
       /* int count = (int) A.chars().filter(ch->ch=='a').count();
        if(count == 1) return 1;
        return (count *(count-1))/2; */
        //So I have used n * (n+1)/2,but same can be acheived also
        int N = A.length();
        int total_cnt =0;
        int count_a = 0;
        for(int i =0;i<N;i++){
            if(A.charAt(i) =='a'){
                count_a++;
                total_cnt += count_a;
            }
        }
        return total_cnt;
    }

    public static void main(String[] args) {
        String exa ="fnmzxvozgkpkwuuwbnlbajogijoaxipjwwfaqefjnvfbcilerkdaeysamehgdouvspojtuvh";
        CountSubStringA counObj = new CountSubStringA();
        int cnt = counObj.solve(exa);
        System.out.println(cnt);
    }
}
