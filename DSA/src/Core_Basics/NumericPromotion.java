package Core_Basics;

public class NumericPromotion {
    public static void main(String[] args) {
        char char1 =1,char2 = 2;
        short short1 =1,short2 = 2;
        int int1 =1,int2=2;
        char1 = (char) (char1+char2);
        System.out.println(char1);

        char char3 = 8253;
        int int3 = char3;
        byte byte3 = (byte) char3;
        System.out.println(char3);
        System.out.println(int3);
        System.out.println(byte3);

        //Object Casting

        Number num = 200.0f;
        Float fl = (Float) num; // Super to Sub explicit
        Float fln =Float.valueOf(207.0f);
        num = fln;
      //  Double dbln = (Double)fln; // Incovertible type as there is no relation
        int i1 = 123456;
        int i2 = 123_456;
        int a = 0100;
        System.out.println(a);
        System.out.println(i1 == i2);

        int ijk = 2147483647;
        long ijkl = ijk+1L;
        System.out.println(ijkl);

        for(int i=0;i<26;i++){
           System.out.println((char)('a'+i));
        }

        float f1 = 0f;
        float f2 = -0f;
        System.out.println(f1 == f2);

    }
}
