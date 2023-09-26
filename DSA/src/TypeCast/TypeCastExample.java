package DSA.src.TypeCast;

public class TypeCastExample {
    public static void main(String[] args) {
        //Wrapper class is casted only to its corresponding primitive type.
        Double i =10.0;
        Double d = i;
        System.out.println(d);
        Double dx = 100.04;
        Long l = (long) dx.doubleValue(); //explicit type casting required
       // int iy = (int) l;                 //explicit type casting required
        System.out.println("Double value " + d);
        System.out.println("Long value " + l);
        System.out.println("Int value " + i);
    }
}
