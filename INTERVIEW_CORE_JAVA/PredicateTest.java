package INTERVIEW_CORE_JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class PredicateTest {
   /* static boolean isRedApple(Apple app) {
        return "red".equals(app.getColor());
    }

    static boolean isHeavyApple(Apple app) {
        return app.getWeight() > 150;
    }

    public static void main(String[] args) {
      /*  List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 150));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("red", 50));
        apples.add(new Apple("red", 80));
        apples.add(new Apple("green", 300));
       List<Double> newList = apples.stream().filter(a->a.getWeight()>150)
                .map(Apple::getWeight)
                .collect(Collectors.toList());*/
        /*
        // Apple a1 = new Apple("black",290);
        Consumer<Apple> b = a1 -> System.out.println("Weight of Apples ::" + a1.getWeight());
        apples.forEach(b);

       // Object o = () -> {System.out.println("Tricky example"); };

        /*apples.sort(Comparator.comparing(Apple::getWeight));
        System.out.println("======= ====== ===== ========");
        apples.forEach(b);


        List<String> list = Arrays.asList("1","100","50","500","25");
        list.sort(String::compareToIgnoreCase);*/
    }

