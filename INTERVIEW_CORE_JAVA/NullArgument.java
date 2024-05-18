package INTERVIEW_CORE_JAVA;

public class NullArgument {
    public static void main(String[] args) {
       test(null);
    }

    public static void test(String s){
        System.out.println("String");
    }
    public static void test(Object s){
        System.out.println("Object");
    }
}
