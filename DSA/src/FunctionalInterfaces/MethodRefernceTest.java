package FunctionalInterfaces;

public class MethodRefernceTest {

    public static void saySomeThings(){
        System.out.println("Test Method refernce");
    }
    public static void main(String[] args) {
            MethodRefernce say = MethodRefernceTest::saySomeThings;
            say.say();
    }
}
