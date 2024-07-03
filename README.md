#### Interview CheatSheet

1.[START](MY_RECENT_PROJECT/INTRODUCTORY_QUESTIONS.md)

2.[DATABASE](INTERVIEW_SQL_NOSQL)

3.[SYSTEM DESIGN](INTERVIEW_SYSTEM_DESIGN)

4.[DEVOPS](INTERVIEW_DEV_OPS)

5.[MICRO SERVICES](INTERVIEW_SPRING_MICROSERVICES)

- 5.1 [SOFTWARE DESIGN PRINCIPLES]()
- 5.2 [SPRING BOOT]()

  6.[NODEJS & FRONTEND](INTERVIEW_FRONT_END)

7. [KAFKA](INTERVIEW_KAFKA)

8. [CORE JAVA](INTERVIEW_CORE_JAVA)

9. [CLOUD](INTERVIEW_CLOUD_AWS_AZURE_GCP)

10. [DSA](INTERVIEW_DSA)

<details>
  <summary>Data Structure and Algorithms </summary> 
  
  ### String :
  
  Q.1) [Reverse a String using Recursive](DSA/src/ArrayString)
  
  Q.2) [Find GCD using Recursive](DSA/src/ArrayString)
  
  Q.3) [You are given a string A. Find the number of substrings that start and end with 'a'.](DSA/src/ArrayString)
  
  Q.3) [Return an integer denoting the minimum characters needed to be inserted in the 
     beginning to make the string a palindrome string.](DSA/src/ArrayString)
     
  Q.4) [Boring SubString -> Both the characters are consecutive, for example - "ab", "cd", "dc", "zy" 
     and length should be 2. If no boring substring possible return 1
     S = "abcd"  -> cadb -> in this no boring substring hence return 1](DSA/src/ArrayString)
     
  Q.5) [Closest Palindrome -> Return Yes if string can be converted to palindrom by changing 
     one character.](DSA/src/ArrayString)

### Array :

Q.1) Count of Pairs with sum = K

Q.2) Given an ArrayList of integers, return all the unique numbers in the ArrayList.

Q.3) Given a matrix, row index =0, return sum of that particular row.

Q.4) Given a 2D array and a column index, return sum of that particular column.

Q.5) Write a function to add two matrix of same dimension and return the resultant

Q.6) Given an array A of N integers. Count the number of elements that have at least 1 elements greater than itself.

Q.7) Given an array of size N, shift all the elements to the right by 1 and move the last element to the beginning of array

### Miscllenaous

44. Implement an algorithm to determine if a string has all unique characters. What if you
    cannot use additional data structures? (Bitwise way to understand)
45. One string permutaion of other
46. URLfy of String (Yet to Solve) %%%%%%%%% %%%%% All below %%%%%% %%%%%%%
47. Palindrom Permutation
48. One Away: There are three types of edits that can be performed on strings: insert a character,
    remove a character, or replace a character. Given two strings, write a function to check if they are
    one edit (or zero edits) away.
    EXAMPLE
    pale, ple -> true
    pales, pale -> true
    pale, bale -> true
    pale, bae -> false

49. String compression For example, the string aabcccccaaa would become a2blc5a3
50. String Rotation: Assume you have a method i 5Su b 5 tr ing which checks if one word is a substring
    of another. Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one
    call to i5Sub5tring (e.g., "waterbottle" is a rotation of"erbottlewat").

</details>

<details>
  <summary>Core Java </summary>

### **\*\*** Core Java Start **\*\*\***

  <details>
  <summary>Set 1(CJ1) </summary>
  13.  https://www.interviewgrid.com/interview_questions/java \*\*\*\* Pending
  14.  What is Flattening?
  16.  Return Square of numbers of list of integers using Stream
  17.  Given two lists of numbers, how would you return all pairs of numbers? For example, givenalist [1, 2, 3] and a list [3, 4] you should return [(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]. Forsimplicity, you can represent a pair as an array with two elements.
  18.  How would you extend the previous example to return only pairs whose sumis divisibleby3?For example, (2, 4) and (3, 3) are valid.
  19.  What is Short-circuiting evaluation in stream ?
  20.  When to use findFirst and findAny.
  21.  Summing all the element of a list.
  22.  Describe the use of Optional in Java?
  23.  Describe the differnce between map,flatmap and reducce
  25.  [Java 8 Feature - Lambda](https://medium.com/java-pearls/taming-the-lambda-a-practical-guide-to-java-8-lambda-expressions-6c0051f97995)
  26.  [Concurrent Modification Using Stream API Possible ?](https://medium.com/@sum98kumar/java-developer-interview-questions-and-answers-b5732cd18c5b)
  27.  [How ParallelStream Works internally?](https://medium.com/@sum98kumar/java-interview-questions-9cb306e392d3)
  28.  [How threadpool executor works ?](https://www.digitalocean.com/community/tutorials/threadpoolexecutor-java-thread-pool-example-executorservice)

  </details>
  
### Java Collections

<details>
  <summary>Set 1</summary> 
  
63. How ConcurrentHashMap works ?
64. How HashSet works internally ?
65. What is Consisten Hashing?
66. [TreeMap works internally?](https://medium.com/@basecs101/treemap-in-java-collection-framework-interview-question-a3f81c7aaa84)
67. [How to create custom immutable class ?]()
68. [in built immutable classes in java - String,Integer,Long,Double,BigInteger,LocalDate,LocalDateTime etc]()
69. [Aggregation vs composition]()
70. [Create An Immutable Map]()

</details>

### Streams

<details>
  <summary>Core Java Basics -2 </summary>
  
Q.1) Find the most populated city of each continent

Q.2) Find the number of movies of each director

Q.3) Find the number of genres of each director's movies

Q.4) Find the highest populated capital city

Q.5) Find the highest populated capital city of each continent

Q.6) Sort the countries by number of their cities in descending order

Q.7) Find the list of movies having the genres "Drama" and "Comedy" only

Q.8) Group the movies by the year and list them

Q.9) Sort the countries by their population densities in descending order ignoring zero population countries

Q.10) Find the richest country of each continent with respect to their GNP (Gross National Product) values.

Q.11) Find the minimum, the maximum and the average population of world countries.

Q.12) Find the minimum, the maximum and the average population of each continent.

Q.13) Find the countries with the minimum and the maximum population.

Q.14) Find the countries of each continent with the minimum and the maximum population.

Q.15) Group the countries by continent, and then sort the countries in continent by number of cities in each continent.

Q.16) Find the cities with the minimum and the maximum population in countries.

Q.17) Find the minimum, the maximum, the average, and the standard deviation of GNP values.

Q.18) Find the year where the maximum number of movie is available

</details>

### [Thread](https://github.com/pracks224/Interview_Prep/blob/main/MultiThreading/MULTI_THREADING.md)

<details>
  <summary>Set 1</summary> 
  
1. [Volatile vs Atomic Vs Synchronized](https://medium.com/@erayaraz10/understanding-atomic-volatile-and-synchronized-variables-in-java-differences-and-use-cases-b12f519a4c4b)
2. [What is Thread Local Cache](https://codegym.cc/quests/lectures/questcore.level07.lecture05)
3. [Importance of Thread Local](https://medium.com/@fullstacktips/what-is-threadlocal-in-java-a51bdaaa6079)
4. [100 task 5 threads using executors and manual]()
5.   
</details>

<details>
  <summary>Set 2 </summary>
  
  1712. [Java Records](https://medium.com/@mak0024/a-comprehensive-guide-to-java-records-2e8edcbd9c75)        
  1. Could you explain what is the "deadly diamond of death"?
  2. What's the difference between the Dependency Injection and Service Locator patterns?
  3. [What is the difference between the template patterns and the strategy pattern?]( https://github.com/aershov24/full-stack-interview-questions#DesignPatterns )
  4. [How Java Memory works?](https://blog.stackademic.com/how-java-memory-works-c751460e3cbd)
  5. [How G1GC works?](https://blog.stackademic.com/how-g1gc-works-in-java-390332333b2) G1GC is a concurrent collector
  6. How are coping with changing requirements ? Predicates
  7. Java Program to count the total number of characters in a string.
  8. Java Program to count the vowel/consonants in a string
  9. Java programs to determine to programs are anagram means they have same set of characters.
  10. [Java programs to divide a string equal N parts.](https://www.javatpoint.com/java-programs)
  11. List of Functional Interfaces  like runnable,callable,comparator,ActionListners,supplier,consumer,Function,Predicate,BiFunction,BiPredicate,UnaryOperator,BinaryOperator,BiConsumer,LongConsumer etc.
  12. Some time Interviewer asks the methods of the functional interfaces
  13. What is Java Stream ?
  14. Java Program to sort List of employee by salary using java 8?
  15.  Java program to demonstrate all the functional interfaces like predicate/cosnumer/supplier etc. Predicate - test return boolean consumer - returns void and method accept for updating value/print etc and function has apply method return another object  like for transforming etc
  16.  Predicate<Integer> vs IntPredicate? (Java 8 in Action Page :: 82p)
  17.  [What is Java record included in Java 14 ?](https://www.geeksforgeeks.org/what-are-java-records-and-how-to-use-them-alongside-constructors-and-methods/)
  18.  [What is the difference between Hashmap vs hashTable , which one is synchronized?]()
  19.  [HashMap Internally works ?](https://medium.com/@basecs101/internal-working-of-hashmap-in-java-latest-updated-4c2708f76d2c#:~:text=Internally%20HashMap%20uses%20a%20hashCode,entries%20(nodes)%20are%20stored.)
  20.  [How HashSet works Internally?](https://medium.com/@basecs101/internal-working-of-hashset-in-java-interview-question-129bdd31fc60)
  21.  [What are the new change in java memory model in java 8?](https://connect2grp.medium.com/evolution-of-java-memory-model-af24d5365581)
  
  22.  How will you simulate concurrent modification through stream API ?
  23.  How many thread will open for parallel stream and how parallel stream internally works ?
  24.  [How does Executor make or check , number of threads are active or dead , in other word what is internal working of thread pool executor ?](https://medium.com/coding-becomes-easy/how-threadpool-works-internally-in-java-904f1e87fea)
  25.  [Kindly give brief idea about JAVA memory model.](https://medium.com/platform-engineer/understanding-java-memory-model-1d0863f6d973)
  26.  [What are the changes of pegmen in JDK 8. (PermGen and Meta)?](https://medium.com/platform-engineer/understanding-java-memory-model-1d0863f6d973)
  27.  [What is Terminal/Non terminal Streaming.](https://javagyansite.com/2020/02/05/stream-terminal-and-non-terminal-operations/)
  28.  [Differnt design patterns in Java 8 Functional style ?](https://blog.devgenius.io/implementing-design-patterns-using-java-8-lambda-c8a95ef66115)
  29. What is Method Reference and Functional Interface ?
  30. Please define Overridden rules for default/static method in java 8.
  31. Questions Related to JAVA Design Patterns mainly
  32. Creational Design Patters
  33. Singleton
  34. Builder
  35. Factory
  36. Prototype
  37. Structural Design Patterns
  38. Adaptor
  39. Bridge
  40. Proxy
  41. Decorator
  42. Behavioral Design Patterns
  43. Chain of Responsibility
  44. Observer
  45.  Strategy

  </details>
  
 ### ****** Core Java End *******
 
</details>
