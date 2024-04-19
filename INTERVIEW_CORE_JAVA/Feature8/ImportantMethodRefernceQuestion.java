package INTERVIEW_CORE_JAVA.Feature8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class ImportantMethodRefernceQuestion {
    public static void main(String[] args) {
        List<String> lst =  Arrays.asList("apple", "banana", "orange", "grape");
        BiPredicate<List<String>, String> containsLambda = (list, ele)->list.contains(ele);
        boolean resultLambda = containsLambda.test(lst,"xyz");
        System.out.println("Using lambda expression: List contains 'banana'? " + resultLambda);

        //Converting the same using Method refrence

        BiPredicate<List<String>, String> containsLambda2 = List::contains;
        boolean result = containsLambda2.test(lst,"apple");
        System.out.println("Using lambda expression: List contains 'banana'? " + result);

    }
}
