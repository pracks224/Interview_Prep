package DSA.src.String_practise;

import java.util.function.IntBinaryOperator;

public class MethodRefernceTest {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

      IntBinaryOperator operator =  MethodRefernceTest::multiply;
        int result = operator.applyAsInt(5,4);
        System.out.println(result);

    }
}
