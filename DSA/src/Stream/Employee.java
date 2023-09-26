package Stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {
    int age;
    double salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return "Age ::" + this.age + "Salary ::" + this.salary;
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(10, 200));
        list.add(new Employee(9, 199));
        list.add(new Employee(13, 305));
        list.add(new Employee(15, 171));
        list.add(new Employee(11, 79));
        list.add(new Employee(25, 500));
        list.add(new Employee(7, 81));
        /* ||||||||||||||||||||||||||||||||||||| */
        Predicate<Employee> empPredicate = (Employee e) -> e.salary > 199;
        List<Employee> updatedList = list.stream().filter(empPredicate).collect(Collectors.toList());
        for (Employee emp : updatedList) {
            System.out.println(emp);
        }
        System.out.println("***************");
        /* ||||||||||||||||||||||||||||||||||||| */
        Comparator<Employee> compareSalary = (a, b) -> (int) (a.salary - b.salary);
        Collections.sort(list, compareSalary);
        for (Employee emp : list) {
            System.out.println(emp);
        }
        /* |||||| Consumer application |||||| */
        Consumer<Employee> bonusEmployee = (Employee e) -> {
            double bonusedSalary = e.getSalary() + e.getSalary() * 0.1;
            e.setSalary(bonusedSalary);
        };
        List<Employee> bonusSal = list.stream().filter(empPredicate).peek(bonusEmployee).collect(Collectors.toList());
        bonusSal.forEach(System.out::println);
        /* Use Of Function in Java 8 */
        List<String> words = Arrays.asList("Mahi","Preyasi","Shree");
        Function<String,Integer> lenthCount = String ::length;
        List<Integer> lengthList = words.stream().map(lenthCount).collect(Collectors.toList());
        lengthList.forEach(System.out::print);

        /*Predicate<Integer> vs IntPredicate */
       IntPredicate evenNumbers = i->i%2 ==0;
       System.out.println(evenNumbers.test(1000));
    }
}
