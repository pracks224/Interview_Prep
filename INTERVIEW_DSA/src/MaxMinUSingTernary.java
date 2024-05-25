public class MaxMinUSingTernary {
    public static void main(String[] args) {
        int n1= 67, n2 =34, n3 = 134;
       // int max = (n1>n2)?(n2>n3)?n1 :n3:n2;
        int maxOfThree = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2  <n3 ? n2 : n3);
        System.out.println("Maximu of Three::"+maxOfThree);
        int minOfThree = n1 < n2 ? (n1 < n3 ? n1 : n3) : (n2  >n3 ? n3 : n2);
      //  int minOfThree = n1 < n2 ? (n1 < n3 ? n1 : n3) : (n2  <n3 ? n2 : n3);
        System.out.println("Min of three is: " + minOfThree);

    }
}