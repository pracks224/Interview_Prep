**Table of content:**

#### Format code in Mac ===> command + option + L
 [Consumer Functional Interface](#consumerFI)
1. [Java 8 Features](#java8)

2. [What do you understand about Functional Interface and some functional Interfaces?](#2Fs)

- [Java Stream](./CJ_Streams.md)

- [How to use Optional in Java Coding](https://medium.com/javarevisited/optional-class-in-java-8-making-your-code-more-clear-and-concise-62af0712910d#:~:text=The%20Optional%20class%20in%20Java,as%20part%20of%20Java%208.)
- [Functional Interface](#java8-fi)
- [Method Refernce](https://medium.com/javarevisited/method-references-in-java8-9714496d5306)

  - [notes](#methodreference1)

- [OOPs]()

  - [What are SOLID principles of Object Oriented Programming?](https://www.freecodecamp.org/news/solid-principles-explained-in-plain-english/)

  - [Anti Pattern- pending definition]()

  - [Overiding vs Overloading](https://medium.com/@beknazarsuranchiyev/the-method-overloading-vs-overriding-in-java-9890e2dcf90a)
  - [Method overriding passing null object,which method will be called?]()

- [String]()
  - [Differnce between String,StringBuilder,StringBuffer](https://medium.com/@salvipriya97/string-vs-stringbuilder-vs-stringbuffer-which-one-to-choose-4308dbcc3022)
  - [How String Concatentaion works internally?](https://www.codementor.io/@nikunjgupta/behind-the-scene-of-a-concatenation-of-two-strings-using-plus-operator-10ad7v8f38)
  - [Best/efficient way to join String ?](https://www.baeldung.com/java-string-concatenation-methods)
  - [Check Anagram]()

<a id="java8"></a>

#### Java 8 Features

    - Lambda|Stream API|Method Reference|Static Method Reference|Parallel Array Sorting
      Type Annotations|Repeating Annotations|Concurrent Accumularators|Date and Time API|Nash Horn Javascript engiene

<a id="java8"></a>

#### Java 9 Features

    -

<a id="methodreference1"></a>

#### Method Interface

- Types 4 : Static,Instant Method of an object,Instant Method of an arbitrary object, Constructor etc
- It always returns a functional Interface

<a id="java8-fi"></a>

#### Functional Interface

- An interface with exactly one abstract method. It can have multiple default or static methods.
- Designed to be used with lambda expressions in Java.
  - Runnable: Used in threading contexts, with no arguments and no return value (void run()).
  - Callable: Similar to Runnable but returns a value and can throw a checked exception (V call()).
  - Comparator: Defines a comparison function for sorting that returns a negative integer, zero, or a positive integer (int compare(T o1, T o2)).
  - Consumer: Performs an action on the given argument, returning no result (void accept(T t)).
  - Supplier: Returns a result and does not take any input (T get()).
  - Predicate: Returns a boolean value based on its input, used for evaluating conditions (boolean test(T t)).
  - Function: Accepts one argument and produces a result, typical use case is for converting or transforming data (R apply(T t)).
  - UnaryOperator: A specialization of Function where the input and output are of the same type (T apply(T t)).
  - BinaryOperator: A specialization of Function for two inputs of the same type, producing a result of the same type (T apply(T t1, T t2)).

@FunctionalInterface Annotation: Optional but helps in making the intent clear and ensures the interface cannot have more than one abstract method.

====

1712. [Java Records](https://medium.com/@mak0024/a-comprehensive-guide-to-java-records-2e8edcbd9c75)
1. Could you explain what is the "deadly diamond of death"?
1. What's the difference between the Dependency Injection and Service Locator patterns?
1. [What is the difference between the template patterns and the strategy pattern?](https://github.com/aershov24/full-stack-interview-questions#DesignPatterns)
1. [How Java Memory works?](https://blog.stackademic.com/how-java-memory-works-c751460e3cbd)
1. [How G1GC works?](https://blog.stackademic.com/how-g1gc-works-in-java-390332333b2) G1GC is a concurrent collector
1. How are coping with changing requirements ? Predicates
1. Java Program to count the total number of characters in a string.
1. Java Program to count the vowel/consonants in a string
1. Java programs to determine to programs are anagram means they have same set of characters.
1. [Java programs to divide a string equal N parts.](https://www.javatpoint.com/java-programs)
1. List of Functional Interfaces like runnable,callable,comparator,ActionListners,supplier,consumer,Function,Predicate,BiFunction,BiPredicate,UnaryOperator,BinaryOperator,BiConsumer,LongConsumer etc.
1. Some time Interviewer asks the methods of the functional interfaces
1. What is Java Stream ?
1. Java Program to sort List of employee by salary using java 8?
1. Java program to demonstrate all the functional interfaces like predicate/cosnumer/supplier etc. Predicate - test return boolean consumer - returns void and method accept for updating value/print etc and function has apply method return another object like for transforming etc
1. Predicate<Integer> vs IntPredicate? (Java 8 in Action Page :: 82p)
1. [What is Java record included in Java 14 ?](https://www.geeksforgeeks.org/what-are-java-records-and-how-to-use-them-alongside-constructors-and-methods/)
1. [What is the difference between Hashmap vs hashTable , which one is synchronized?]()
1. [HashMap Internally works ?](<https://medium.com/@basecs101/internal-working-of-hashmap-in-java-latest-updated-4c2708f76d2c#:~:text=Internally%20HashMap%20uses%20a%20hashCode,entries%20(nodes)%20are%20stored.>)
1. [How HashSet works Internally?](https://medium.com/@basecs101/internal-working-of-hashset-in-java-interview-question-129bdd31fc60)
1. [What are the new change in java memory model in java 8?](https://connect2grp.medium.com/evolution-of-java-memory-model-af24d5365581)

1. How will you simulate concurrent modification through stream API ?
1. How many thread will open for parallel stream and how parallel stream internally works ?
1. [How does Executor make or check , number of threads are active or dead , in other word what is internal working of thread pool executor ?](https://medium.com/coding-becomes-easy/how-threadpool-works-internally-in-java-904f1e87fea)
1. [Kindly give brief idea about JAVA memory model.](https://medium.com/platform-engineer/understanding-java-memory-model-1d0863f6d973)
1. [What are the changes of pegmen in JDK 8. (PermGen and Meta)?](https://medium.com/platform-engineer/understanding-java-memory-model-1d0863f6d973)
1. [What is Terminal/Non terminal Streaming.](https://javagyansite.com/2020/02/05/stream-terminal-and-non-terminal-operations/)
1. [Differnt design patterns in Java 8 Functional style ?](https://blog.devgenius.io/implementing-design-patterns-using-java-8-lambda-c8a95ef66115)
1. What is Method Reference and Functional Interface ?
1. Please define Overridden rules for default/static method in java 8.

1. https://www.interviewgrid.com/interview_questions/java \*\*\*\* Pending
1. What is Flattening?
1. Return Square of numbers of list of integers using Stream
1. Given two lists of numbers, how would you return all pairs of numbers? For example, givenalist [1, 2, 3] and a list [3, 4] you should return [(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]. Forsimplicity, you can represent a pair as an array with two elements.
1. How would you extend the previous example to return only pairs whose sumis divisibleby3?For example, (2, 4) and (3, 3) are valid.

<a id="2Fs"></a>

- FI - Interface with one abstract method

<a id="consumerFI"></a>

#### Consumer Functional Interface

1. This FI used for printing,updating objects with out returining anything.
2. printConsumer.andThen(lengthConsumer).accept("Alice");  andThen used for chaining the consumers
3. Using consumer , we can reuse the same method for different type of updates like increment,decrement etc
   public static void updateEmployee(Employee employee, Consumer<Employee> consumer) {
        consumer.accept(employee); // Applies the consumer to the employee
    }
   Consumer<Employee> giveRaise = e -> e.setSalary(e.getSalary() * 1.10);
   updateEmployee(emp, giveRaise);
