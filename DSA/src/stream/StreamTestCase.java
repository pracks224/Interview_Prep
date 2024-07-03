package DSA.src.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTestCase {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Prakash",10),
                new Person("Abhishk",20),
                new Person("Trusty",30)

        );
        double avgAge = persons.stream().mapToInt(Person::getAge).average().orElse(0);

        List<Integer> nums = Arrays.asList(2,4,41,33,22,106);
        long cnt = nums.stream().takeWhile(num->num%2 !=0).count();

        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> lists = Stream.concat(list1.stream(),list2.stream()).sorted().collect(Collectors.toList());
        List<Integer> intersections =  list1.stream().filter(list2::contains).collect(Collectors.toList());

        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> uniqueNumbers = numbersWithDuplicates
                .stream()
                .distinct()
                .collect(Collectors.toList());


        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );

        transactions.stream().map(n-> n.amount)


    }
}
