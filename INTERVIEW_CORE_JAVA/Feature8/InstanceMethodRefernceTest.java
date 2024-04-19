package INTERVIEW_CORE_JAVA.Feature8;

import java.util.function.Consumer;
//Here we have used Method Refernce two ways
public class InstanceMethodRefernceTest {
    public void displayName() {
        System.out.println("John Doe");
    }
    public static void main(String[] args) {
        InstanceMethodRefernceTest test = new InstanceMethodRefernceTest();
        Runnable obj = test::displayName;
        obj.run();

        Consumer<InstanceMethodRefernceTest>  ct = InstanceMethodRefernceTest::displayName;
        ct.accept(test);
    }
}
