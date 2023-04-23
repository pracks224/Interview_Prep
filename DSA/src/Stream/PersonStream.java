package Stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class PersonStream {
    public static void main(String[] args) {
        List<Person> personList = Person.createRoster();
        //personList.stream().forEach(printList);

        //filter by sex
       // personList.stream().filter(e->e.getGender() == Person.Sex.FEMALE).forEach(printList);
        //The mapToInt operation returns a new stream of type IntStream (which is a stream that contains only integer values).
       // Double averageAge = personList.stream().mapToInt(e->e.getAge()).average().getAsDouble();

        Comparator<Person> ageComparator = (o1,o2)->o1.getAge()-o2.getAge();
        Collections.sort(personList,ageComparator);
        Consumer<Person> printList = p-> System.out.println(p.getName()+"::"+p.getAge());
        personList.stream().forEach(printList);


    }
}
