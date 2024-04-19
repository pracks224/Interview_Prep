package INTERVIEW_CORE_JAVA.Feature8;
//Static Method Reference
interface MyInterface {
    void display(String message);
}
public class MethodRefernceTest {
    // Static method to display a message
    public static void staticDisplay(String message) {
        System.out.println(message);
    }
    public static void main(String[] args) {
        MyInterface obj = MethodRefernceTest::staticDisplay;
        obj.display("Test");
    }
}
