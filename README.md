[One_liners_Tech_Stacks](https://github.com/pracks224/Interview_Prep/blob/main/One_liners_Tech_Stacks.txt)

<details>
  <summary> About My Project </summary>
  
  1. [Tell me something About your recent project,architecture,tech stacks etc .](https://github.com/pracks224/Interview_Prep/blob/main/my_introductory_questions.txt)
  2. [What is EDA and how it works ? What are different approach to implement EDA?](https://github.com/pracks224/Interview_Prep/blob/main/my_introductory_questions.txt)
  3. [Tell me something about yourself?]()
  4. [What are the frontend library you have used in your project.]()
  5. [What type of deployment model you have used?]()
  6. [What type of disister management you have in your project?]()
  7. [How to secure your API]()
</details>

<details>
  <summary>No SQLs </summary>
  
  1501.  [MongoDB Vs Cassandra Vs ScyllaDB ?](https://blog.purestorage.com/purely-informational/types-of-nosql-databases/)
  1502.  [API Gateway Pattern]()
  1503.  [Marker Interface and Annotation]()
  1504.  [Memory Leak - Reasons]()
  1505.  [XML to Json libraries]()
  1506.  [Moving monolith to Microservices](https://launchdarkly.com/blog/migrating-legacy-monolithic-applications-microservices/)
  1507.  [BillPugh Singleton Implementation - Using Static helper vs DoubleCheck Singleton + Clonable exception](https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples)
  1508.  [Monolithic can not be scalable, why?Tight Coupled]()
  1509.  [Differnce between HashMap,TreeMap and LinkedHashMap]()
  1510.  [Destory Singleton Using Reflcection]()
  1511.  [Serilaization and Singleton]()
  1512.  [Enum Singleton](https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples)

</details>

<details>
  <summary>System Design Concepts </summary>

### Application Security

  <details>
    <summary>Set 1</summary> 
  1. [What is DDOS(denial of service ) attack and how will we prevent from this in our Applications ?]()

  </details>

1705. [Improve API Performance - Microservices](https://github.com/pracks224/Interview_Prep/blob/main/Design_API_Performance_Improvement)
1706. [Must Read Books- System design The big archive](https://github.com/pracks224/Interview_Prep/blob/main/system_design_the_big_archive.txt)
1707. [Grokking System Design Notes](https://github.com/pracks224/Interview_Prep/blob/main/grekking_in_short.txt)
1708. [Design FB Messanger]()
1709. [Design Instagram]()
1710. CDNs
1711. [System Design Content Delivery Network.](https://www.youtube.com/watch?v=8zX0rue2Hic)
1712. [System Design Distributed Cache and Caching Strategies | Cache-Aside, Write-Through, Write-Back](https://www.youtube.com/watch?v=RtOyBwBICRs)
1713. [Latency Vs ThroughPut ?](https://aws.amazon.com/compare/the-difference-between-throughput-and-latency/)
1714. [What is CAP Theorem](https://www.bmc.com/blogs/cap-theorem/)
1715. [What is Load Balancing](https://aws.amazon.com/what-is/load-balancing/)
1716. [Design Elevator](https://medium.com/geekculture/system-design-elevator-system-design-interview-question-6e8d03ce1b44)
1717. [Store trillions of Data](https://medium.com/@iBMehta/how-discord-stores-trillions-of-messages-31ed9195c3e8)

      - MongoDB upto ~100 millions
      - Cassandra is better for Billions of data uses LSM for retreiveal. Read is expensive than write
      - ScyllaDB with Rust API is good for Trillions of data

1718. [Well documented - All Concepts in one Place](https://github.com/black-shadows/System-Design)

1719. Design Data Intensive Application Book Overview.
1720. Consistency Hashing.
1721. Isolation levels.
1722. 2PL
1723. [How to make the API end point faster.](https://medium.com/design-bootcamp/how-i-optimized-an-api-endpoint-to-make-it-10x-faster-2f5fe9a84bd9)
1724. [Scalable Notification System](https://medium.com/@adityagoel123/designing-scalable-notification-system-79f83272755e)

</details>
<details>
  <summary>Docker/Kubernetes/Terraform/Ansible</summary>

A. [ANSIBLE IN DETAILS](https://github.com/pracks224/Interview_Prep/blob/main/CICD/ansible_in_details.txt)

[Blue Green Deployment Vs Rolling Deployment](https://medium.com/@navya.cloudops/devops-zero-to-hero-day-20-deployment-strategies-e6712b4801e4)

Q.1) [What is docker? Familiarize the concept of docker and containerization. Understand the difference between docker and traditional virtulization.]()

Q.2) [Docker Components: Learn about the key components of Docker, including Docker Engine, Docker Images, Docker Containers, Dockerfile, and Docker Registry.]()

Q.3) [Steps to Dockerizing an Application .]()

Q.4) [How to build a docker Image using dockerfile with example](https://github.com/pracks224/Interview_Prep/blob/main/CICD/Docker_Zero_To_Hero)

Q.5) [Docker container communication between ?](https://github.com/pracks224/Interview_Prep/blob/main/CICD/Docker_Zero_To_Hero)

Q.6) [Docker build vs Docker run](https://github.com/pracks224/Interview_Prep/blob/main/CICD/Docker_Zero_To_Hero)

Q.7) [Docker CMD Vs RUN Vs ENTRYPOINT](https://github.com/pracks224/Interview_Prep/blob/main/CICD/Docker_Zero_To_Hero)

Q.8) [Frequently used Docker Commands](https://github.com/pracks224/Interview_Prep/blob/main/CICD/Docker_Zero_To_Hero)

Q.9) [Building & deploying containers & orchestrating them with Kubernetes](https://github.com/pracks224/Interview_Prep/blob/main/CICD/Kubernetes_In_Details)

</details>

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
  <summary>Cloud Technologies</summary>
  
  - [Cloud Common]()
  -  ${\color{red} AWS}$
      - [S3]()
      - [Lambd](/INTERVIEW_CLOUD_AWS_AZURE_GCP/AWS_Lambd.md)
      - [EC2]()
      - [ELB]()
      - [EBS]()
      - [VPC]()
      - [SNS]()
      - [SQS]()
      - [RDS]()
      - [Dynamo DB]()
      - [CloudWatch]()
  - #### GPC
      - [APIGEE]()
  - #### AZURE
</details>

<details>
  <summary>Core Java </summary>

### **\*\*** Core Java Start **\*\*\***

  <details>
  <summary>Set 1(CJ1) </summary> 
  
  1. [How to use Optional in Java coding? ](https://medium.com/javarevisited/optional-class-in-java-8-making-your-code-more-clear-and-concise-62af0712910d#:~:text=The%20Optional%20class%20in%20Java,as%20part%20of%20Java%208.)
  2. [Method overloading vs Method Overiding.](https://medium.com/@beknazarsuranchiyev/the-method-overloading-vs-overriding-in-java-9890e2dcf90a)
  3. Method overriding passing null object . 
  ->4. [Differnce between String,StringBuilder and StringBuffer?](https://medium.com/@salvipriya97/string-vs-stringbuilder-vs-stringbuffer-which-one-to-choose-4308dbcc3022)
  5. How String concatnation operator internally works ?
  6. Best/efficient way to join String ?
  7. What is Method references?
  8. Anagram check in Java?
  9. [what is groupingBy?](https://mkyong.com/java8/java-8-collectors-groupingby-and-mapping-example/)
  10. How can you create a comparator?
  11. [What are SOLID principles of Object Oriented Programming?](https://www.freecodecamp.org/news/solid-principles-explained-in-plain-english/)
  12. What is transient variable ?
  13.  https://www.interviewgrid.com/interview_questions/java \*\*\*\* Pending
  14.  What is Flattening?
  15.  Return a list of all unique characters for a list of words?
  16.  Return Square of numbers of list of integers using Stream
  17.  Given two lists of numbers, how would you return all pairs of numbers? For example, givenalist [1, 2, 3] and a list [3, 4] you should return [(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]. Forsimplicity, you can represent a pair as an array with two elements.
  18.  How would you extend the previous example to return only pairs whose sumis divisibleby3?For example, (2, 4) and (3, 3) are valid.
  19.  What is Short-circuiting evaluation in stream ?
  20.  When to use findFirst and findAny.
  21.  Summing all the element of a list.
  22.  Describe the use of Optional in Java?
  23.  Describe the differnce between map,flatmap and reducce
  24.  [Java 8 Feature - Method Reference](https://github.com/pracks224/Interview_Prep/tree/main/INTERVIEW_CORE_JAVA/Feature8)
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

<details>
  <summary>Microservices Design Patterns & Advance Concepts</summary>

1. [How secure a Microservice ?]()
2. What is the diffence between cohesion and coupling ?
3. What is 12-Factor App ? // if all these there then it's microservice enabled
4. What are the type of Service Discovery ?
5. What is the difference between normal REST service and Restful WS (Web Service)?
6. [What is service mesh ? Explain the differnet advantages like traffic splitting ](https://www.youtube.com/watch?v=16fgzklcF7Y)
7. [circuit breaker using Resilllinec4J and springboot](https://salithachathuranga94.medium.com/micro-service-patterns-circuit-breaker-with-spring-boot-253e4a829f94)
8. [How springboot works internally? What happens after run method](https://medium.com/javarevisited/what-happens-internally-when-you-start-a-spring-boot-application-part1-a683a64c1be8)
9. [differnce between @RestControler @controler ? What is the default retention ploicy ?](https://stackabuse.com/controller-and-restcontroller-annotations-in-spring-boot/)
10. [@condtional ,@ConditionalOnClass and @ConditionalOnProperty]()
11. [@profile,How it works ?](https://medium.com/@AlexanderObregon/exploring-the-use-of-profile-annotation-in-spring-framework-32cf9fff60f2#:~:text=The%20%40Profile%20annotation%20was%20introduced,to%20customize%20the%20application%20context.)
12. [What is Swagger , OpenAPI Vs Swagger, What are the features of swagger ?Swagger editor,Swagger UI,Swagger Codegen]()

#### Software Design Principles

 <details>
  <summary>Set 1</summary>

1. [Solid]()
2. [DRY]()
3. [KISS]()
4. [GRASP]()
5. [High Cohesion]()
6. [Low Coupling]()

 </details>
</details>

<details>
  <summary>Node Js & Front End</summary>

1702. [Microfont end]()

1703. [Javascript Event Loop and Call Stack Explain?](https://www.knowledgehut.com/blog/web-development/node-js-event-loop)
1704. [How to create object in Javascript?](https://github.com/pracks224/Interview_Prep/blob/main/INTERVIEW_JAVASCRIPT/js_concepts)
1705. [Difference between Object.freeze() and const in JavaScript ?]()
1706. [How to deep-freeze an object in JavaScript ?](https://github.com/pracks224/Interview_Prep/blob/main/deepfreeze.js)
1707. [Implement sum(2)(3)() (Currying funtions- is also a higher order function](https://github.com/pracks224/Interview_Prep/blob/main/deepfreeze.js)
1708. [What is the difference between call(),apply() and bind() methods?](https://github.com/pracks224/Interview_Prep/blob/main/INTERVIEW_JAVASCRIPT/js_concepts)
1709. [How can you handle errors in Node.js, and what is the purpose of the error event in streams?](https://medium.com/@phamtuanchip/top-10-interview-question-for-node-js-senior-developer-c20bb80377a4)
1710. [What is a closure in JavaScript, and how is it relevant in Node.js?](https://medium.com/@phamtuanchip/top-10-interview-question-for-node-js-senior-developer-c20bb80377a4)
1711. [What is the difference between setTimeout and setImmediate in Node.js?](https://medium.com/@phamtuanchip/top-10-interview-question-for-node-js-senior-developer-c20bb80377a4)

</details>

<details>
  <summary>Spring Boot</summary>

### **\*\*\*** **\*** \***\* \*** Spring Boot Start \***\* \*\*** \***\* \*\*\*** **\*** **\***

  <details>
  <summary>Set - 1</summary>
  
  1. What is Spring Boot and what are its Benefits?  
  2. What makes Spring Boot superior to JAX-RS? 
  3. What Spring Boot features help develop Microservices Applications?  
  4. Why Spring Boot is preferred over any other framework?  
  5. What are the key dependencies of Spring Boot?  
  6. What are the advantages of Spring Boot?  
  7. What are the features of Spring Boot?  
  8. How do you create a Spring Boot application using Maven?  
  9. How do you create a Spring Boot project using Spring Initializer?  
  10. How do you create a Spring Boot project using boot CLI?  
  11. How do you create a simple Spring Boot application?  
  12. What are the Spring Boot Annotations?  
  13. What are the Spring Boot properties?  
  14. What are the Spring Boot Starters?  
  15. What is Spring Boot Actuator?  
  16. What is thyme leaf?  
  17. How to use thyme leaf? 
  18. How do you connect Spring Boot to the database using JPA?  
  19. How to connect the Spring Boot application to a database using JDBC?

  </details>

### Spring Web

   <details>
   <summary>Set -1</summary>
  
  1. What is @RestController annotation in Spring Boot?  
  2. What is @RequestMapping annotation in Spring Boot?  
  3. How do you create a Spring Boot application using Spring Starter Project Wizard?  
  4. Spring Vs Spring Boot? Or Why Spring Boot over Spring?  
  5. What annotations are used to create an Interceptor?  
  6. What is a Swagger in Spring Boot?  
  7. What are Profiles in Spring Boot?  
  8. What differentiates Spring Data JPA and Hibernate?  
  9. How are the @RestController and @Controller Annotation different? 
  10. How does Spring Boot works?
  11. What does the @SpringBootApplication annotation do internally?
  12. What is the purpose of using @ComponentScan in the class files?
  13. How does a spring boot application get started?
  14. Can we create a non-web application in Spring Boot?
  15. Can we override or replace the Embedded tomcat server in Spring Boot?
  16. Can we disable the default web server in the Spring boot application?
  17. How to disable a specific auto-configuration class?
  18. Describe the flow of HTTPS requests through the Spring Boot application?
  19. What is the difference between RequestMapping and GetMapping?
  20. What is the use of Profiles in spring boot?
  21. What is Spring Actuator? What are its advantages?
  22. How to enable Actuator in Spring boot application?
  23. What are the actuator-provided endpoints used for monitoring the Spring boot application?
  24. How to get the list of all the beans in your Spring boot application?
  25. How to check the environment properties in your Spring boot application?
  26. How to enable debugging log in the spring boot application?
  27. Where do we define properties in the Spring Boot application?
  28. What is dependency Injection?
  29. What is an IOC container?

   </details>

### [Spring Security](https://medium.com/@a.zagarella/spring-security-basic-authentication-and-role-based-authorization-04fa626f961a)

   <details>
   <summary>Set -1</summary>
     
  1.  What are some essential features of Spring Security?
  2.  What is Spring security authentication and authorization?
  3.  What do you mean by basic authentication?
  4.  What do you mean by digest authentication?
  5.  What do you mean by session management in Spring Security?
  6.  Explain SecurityContext and SecurityContext Holder in Spring security.
  7.  Explain spring security OAuth2.
  8. What do you mean by OAuth2 Authorization code grant type?
  9.  What is method security and why do we need it?
  10.  What do you mean by HASHING in spring security?

  </details>

  <details>
   <summary>Set -2</summary>
  1.  Explain salting and its usage.
  2.  What is PasswordEncoder?
  3.  Explain AbstractSecurityInterceptor in spring security?
  4.  Is security a cross-cutting concern?
  5. What is SpEL (Spring Expression Language)?
  6. Name security annotations that are allowed to use SpEL.
  7. Explain what is AuthenticationManager in Spring security.
  8. Explain what is ProviderManager in Spring security.
  9. What is JWT?
  10. What is Spring Security Filter Chain?
    
  </details>
  
  <details>
   <summary>Set - 3</summary>
  1. Explain how the security filter chain works.
  2. Name some predefined filters used in spring security and write their functions.
  3. What do you mean by principal in Spring security?
  4. Can you explain what is DelegatingFilterProxy in spring security?
  5. Can you explain what is FilterChainProxy in spring security?
  6. What is the intercept-url pattern and why do we need it?
  7. Does order matter in the intercept-url pattern? If yes, then in which order should we write it?
  8. State the difference between ROLE_USER and ROLE_ANONYMOUS in a spring intercept-url configuration.
  9. State the difference between @PreAuthorize and @Secured in Spring security.
  10. State the difference between @Secured and @RolesAllowed.
  
  </details>

### Spring Boot Advance

  <details>
  <summary>Set -1</summary>

1703. [Spring Reactive Flux]()
1704. [Spring Security](https://medium.com/@AlexanderObregon/common-java-spring-boot-security-interview-questions-and-answers-0513efb6fb12)

1705. [How to handle Exception in SpringBoot?](https://medium.com/@fullstacktips/exception-handling-in-spring-boot-using-controlleradvice-and-exceptionhandler-8dda72b33c45)
1706. [What is the @controllerAdvice/@restcontrolleradvice in springboot? - Exception Handling](https://medium.com/@fullstacktips/exception-handling-in-spring-boot-using-controlleradvice-and-exceptionhandler-8dda72b33c45)
1707. [How to do transaction management in Spring boot application?](https://www.scaler.com/topics/spring-boot/transaction-management-in-spring-boot/)
1708. [How Spring- Security works.](https://www.scaler.com/topics/spring-boot/spring-security/).
1709. [SpringBoot with OAuth2.How it works?](https://howtodoinjava.com/spring-boot2/oauth2-auth-server/)
1710. [How to do CORS configuration in Spring Boot ?](https://howtodoinjava.com/spring-boot2/spring-cors-configuration/)
1711. How to add Global CORS configuration for the application?
1712. What is the use @Configuration? //Bean Definitions
1713. What is a passwordEncoder ? // enforeces password encoding ,plain text password wont allowed
1714. CQRS design patterns in Microservices?
1715. Design a URL Shortner (tinyurl)
1716. [Design a web crawler.](https://github.com/preslavmihaylov/booknotes/blob/master/system-design/system-design-interview/chapter10/README.md)
1717. Design a notification System
1718. Describe the use case of JSON Web Token?
1719. [How can you disable the Autoconfiguration in Spring boot Application?](https://github.com/pracks224/Interview_Prep/edit/main/INTERVIEW_SPRING/springboot)
1720. [How do Microservice communicate each other?](https://medium.com/bitsrc/my-favorite-interservice-communication-patterns-for-microservices-d746a6e1d7de)
1721. [Describe the API Gateway design pattern for Micro service?](https://medium.com/@wahyubagus1910/api-gateway-design-pattern-implement-rate-limiting-and-circuit-breaker-on-microservices-9d777c778272)
1722. [Describe some principle of Mircro Service deployment?](https://github.com/pracks224/Interview_Prep/edit/main/INTERVIEW_SPRING/springboot)
1723. [Describe the Circuit Breaker Design Pattern?](https://medium.com/javarevisited/what-is-circuit-breaker-design-pattern-in-microservices-java-spring-cloud-netflix-hystrix-example-f285929d7f68)

</details>

### **\*\*\*** **\*** \***\* \*** Spring Boot End \***\* \*\*** \***\* \*\*\*** **\*** **\***

  </details>

<details>
  <summary>KAFKAAA</summary>

## Kafka

<details>
  <summary>Important Notes to revise</summary>  
 
  ```diff
    a) What is kafka Cluster? 
       - Group of Kafka brokers.  
    b) What is Kafka broker -> Its the server where Kafka instances are running.
    c) Producer -> Writes new data to the kafka cluster (data dal dega)
    d) Consumer - > Kaffka cluster se data utha ta hai
    e) Zookeeper -> Monitors the Kafka cluster health
    f) Connects -> If you have to pull data from external source ( configurable ). We dont need to write any code
    g) Stream -> to transformation the data 
 ```
 ##### Kafka Topics 
 - These are like tables of databse
 - They live inside the broker
 -  Producers produces the messages and send to topics
 -  Topics has partions
 - Producers can directly send the data to partion or topics
 
 ##### Kafka Partiontions 
 
 - Topics has many partions like p0 p1 p2 ..
 - Partions where actual messages stores.
 - While creating topics,number partions will be decided
 -  Partions are ordered and immutable sequence
 - Partions are in increased order id called offset
 - Each partion is independent of each other.
 - All the trannsactions stores in distributed log files.
 
 ##### How and why to send messages to KAFKA keys ?
 
 - When producers send messages to Topics/Partions , It will insert into Partions in  round robin fashion
      Producer - Send messages m1,m2,m3, m4
 - Let's say Topics has p1,p2 partions,Then messages will insert into p1 - m1 -> p2 - m2  -> p1- m3 -> p2 - m4 etc
      The problem with this approach is it fetches in unorders fashion. To avoid we have to pass the message with keys
 -  When message passed with keys, partiotoner created a hash and bind it to a prticular partion.
 - Key is optional . With out key sending messages wont guarntees the ordering of the message as the consumer poll the
     messages from all partions at the same time.
 
 #### Steps to work on Kafka
 -  Start zookeeper
 -  start the broker
 -  create the topic 
         > kafka-topics.bat --create --topic fruit --bootstrap-server localhost:9092 --replication-factor 1 -- partions 4
 - create producers
         > kafka-console-producers.bat --broker-list localhost:9092 --topic fruit --property "key.separator = -" --property "parse-key=true
 - same way create/register producers
 
 #### Understanding Consumer Offset, Consumer Groups, and Message Consumption in Apache Kafka
     
 -  In this section ,I will write about the process consumer consuing information from Partions
 -  Consumer Offset - Position of a consumer in a specific partition of topic. It represents the latest message consumer has read.
 -  When a consumer group reads a message from a topic, each member of the group mantains its own offset and updates it as it consumes message.
 -  when consumer created - > it will assigned with a group id . One consumer grouop can have multiple consumers.
 -  Ok, Each consumer mantains its own offset that is nothing but the bookmark of the last read . 
 - All the offset stores in _consumer_offset named topic. _consumer_offset is the builtin topic in apache kafka that keeps track of the latest offset commited forv each partion of each consumer group.
 - The information in _consumer_offset used by kafka for reliabity of the consumet groups and to ensure that messages are not lost or duplicated.
 - Important - There is separate __consumer_offset for each consumer group.
 - The group co ordinator uses this information to manage the assignment of partitions to consumers and ensure that each partion is being consumed 
     by exactly one consumer in the group.
 - when consumer joins a consumer group,it sends the join request to the group coordinator
 - The G.C will determine which partition the consumer assigned to be.
 - STICKY FASHION --> Consumer will assigned to the same partion until its on the same Consumer group.
 
 #### Understanding Segments, Commit Log, and Retention Policy
 - Segments : Particular set of messages ,Ek partition me bahut sare messages rehete hai. Ek segement ka size we can define.
 - Commit Log : In the server.properties -> directory for commit log
                    All the messages stored in the commit log folder as .log files
                    As manay partions for a topic ,that many folders will be created
                    E.g. -> Topic name food with 4 partitions
                          food_0
                          food_1
  - Retentions Policy  : Two types 
                             Data Based policy -> after a size it will delete 
                            Time Based policy -> By default 168 hours and after that the file will deleted
 
  -  Actually data stores in .log file in encoded format and consumer decode it before uses.
 
 #### How to Make a Kafka Cluster with 3 Brokers: Understand Replication Factor.
    
 - A Kafka cluster is a distributed system that consists of multiple Kafka brokers. Each broker is a server that runs Kafka to manage and store message       data. Each will unique broker Id.
 - The replication factor refers to the number of copies of each message that are stored in the Kafka cluster for fault tolerance.
 
 -  When a topic is created with a replication factor of N, Kafka ensures that there are N replicas of each message distributed across the brokers in         the cluster. This allows for high availability and fault tolerance, as well as scalability for handling large volumes of data.
 -  E.g.  One Zoo keeper and 3 Brokers 
        Create topic command 
        kafka-topics.bat --create --topic gadgets --bootstrap-server localhost:9092,localhost:9093,localhost:9094 --replication-factor 3 --partition 3
        In this 9092/9093/9094 are the brokers and replication fator 3 means creates 3 copies
        But when producer sends message,It will send to one broker who is the leader for that partion and then it will replicate inn other two.
        Similarly we can create prodcuers using command
        kafka -consumer-console.bat --bootsrtap-server --from-begining
 
 #### ISR in Kafka
 
 -  In Sync Replica . To see the list of topics kafka-topics.bat --describe
    Lets say one broker down ,the automatically leader will be assigned in sync
 
 #### Kafka Producer And Consumer Example In Java Spring Boot
 
 - Will share the link later here (main depencey is springframework-kafka )
 
 For [Video](https://www.youtube.com/watch?v=vmuZaT6JpCM&list=PLA3GkZPtsafbAjKYkhWnD6GdhRtm6JrD1&index=10) refernce

**[⬆ Back to Top](#table-of-contents)**

 </details>
 
 <details>
  <summary>Interview Questions</summary>
 
  ### Usages
 
 ```
 a.Kafka is a useful solution for scenarios that require real-time data processing, application activity tracking, and monitoring. 
 b.At the same time, Kafka  should not be utilized for on-the-fly data conversions, 
 data storage, or when a simple task queue is all that is required.
 
 ```
 ### [Important Link and Use cases Paypal](https://medium.com/paypal-tech/kafka-consumer-benchmarking-c726fbe4000)
 ### [Why Kafka is very fast](https://www.youtube.com/watch?v=UNUz1-msbOM)
 ### [Kafka Stream - Must reacd Book](https://assets.confluent.io/m/7997a914c1a19b5?mkt_tok=NTgyLVFIWC0yNjIAAAGGApzv7utiTseX[…]yqvKtp86XezuCYCO30eyP63XV8MjOSS5737KVpPO1BXbiPx5soDrNGE3YDA )
 ### [How linkedin works?](https://engineering.linkedin.com/blog/2019/apache-kafka-trillion-messages)
 ### [POC](https://github.com/hardikSinghBehl/kafka-java-spring-boot-poc)
 ### [Blogs](https://www.linkedin.com/pulse/kafka-idempotent-producer-rob-golder/)
 ### [Blogs-2](https://medium.com/@shesh.soft/kafka-idempotent-producer-and-consumer-25c52402ceb9)
 
 ``` Real time question
 Concern is that I have key i.e. uuid along with that key I published the AVRO model to a topic if I republished with same key it is still getting published and I could see the message in Kafka Topic. I am using confluent kafka version 7.2.1 which uses Kafka version 3.2. If kafka version is greater and 3.0. It has by default safe producer where it enable.idempotance = true acks  = all.
 ```
 
 ```
 can we create dynamic consumer in kafka
?
My producer generates topics where prefix will be fixed
And I want all of those topics to be consumed by one consumer
Is it possible in kafka?
 ```
 
| No.       | Questions         |
| ------------- |:-------------|
 |1. | Tell me about some of the use cases where Kafka is not suitable.|
 |2. | Describe message compression in Kafka. What is the need of message compression in Kafka? |
 |3. | What do you understand about log compaction and quotas in Kafka?|
 |4. | Explain the four core API architecture that Kafka uses.|
 |5. | What do you mean by a Partition in Kafka?|
 |6. | What do you mean by zookeeper in Kafka and what are its uses?|
 |7. | Differentiate between Rabbitmq and Kafka.|
 |8. | What do you understand about Kafka MirrorMaker? |
 |9. | What do you mean by confluent kafka? What are its advantages?|
 |10. | How are partitions distributed in an Apache Kafka cluster? |
 |11. | What is the purpose of ISR in Apache Kafka?|
 |12. | [How you will handle 50K req per second because coping 50K messages to kafka will also take some time](#12)|
 |13. | Tell me about some of the use cases where Kafka is not suitable.|
 |14. | Describe message compression in Kafka. What is the need of message|
 |15. | Tell me about some of the use cases where Kafka is not suitable.|
 |16. | Describe message compression in Kafka. What is the need of message |
 |17. | Tell me about some of the use cases where Kafka is not suitable.|
 |18. | Describe message compression in Kafka. What is the need of message|
 |19. | Tell me about some of the use cases where Kafka is not suitable.|
 |20. | Describe message compression in Kafka. What is the need of message |
 |21. | Can we add consumer dynamically to Kafka ?
 |22. | What are the differnet Partition Startergy ?
 |23. | Mention the differnce between Kafak and JMS?
 |24. | How to avoid duplicate event kafka ?
 
  ### 12
  
  ```Solutions:
   
 - To update metadata in Cassandra using Kafka with a high throughput of 50K requests per second, we can use the following strategies:

- Batch Processing: Instead of sending each message individually, we can batch them together and send them in larger batches. This reduces the overhead of sending multiple small messages, and helps to achieve higher throughput.
- Asynchronous Processing: We can process the incoming messages asynchronously, which means that the application can continue processing new requests while Kafka is still processing previous requests. This approach helps to minimize any delays caused by the processing of individual messages.
- Use of Kafka Connect: Kafka Connect is a scalable and reliable way to move data in and out of Kafka. We can use Kafka Connect to integrate Cassandra and Kafka, and leverage its capabilities to manage large amounts of data with high throughput.
- Partitioning: We can partition the data across multiple Kafka topics to distribute the load across multiple Kafka brokers. This approach helps to achieve better parallelism and scalability, and allows us to handle high loads of incoming data.
- Optimization of Kafka settings: We can optimize the Kafka settings such as batch size, compression, and buffer sizes to increase the overall throughput of Kafka.

```
</details>
</details>

<details>
  <summary> Back Logs </summary>

  [pending Questions](https://medium.com/@vivekkadiyanits/java-lead-7-to-10-years-interview-mastery-covered-question-has-asked-in-more-than-9-service-base-d55ffbb0009c)

  [KAFKA ----> Subject matter expertise & assist in operations of the Kafka platform]()

[AWS--->Experience in architecting and deploying solutions on Azure/AWS or GCP]()

[Building & deploying highly available and low latency systems as service-oriented architecture, event driven architecture using Spring Boot, Kafka]()

[DCOKER----->Experience with Docker and container orchestration solutions (eg. Kubernetes) and Helm]()

[Elastic ----->Managing high availability (eg. Keepalived, ALB, Elastic IP, DNS Load Balancer)]()

[APIGEE--->Knowledge on API Management and Integration using APIGEE API Management platform]()

[TERRAFORM----->Experience with Terraform/Ansible]()

[JENKINS------->Understanding and using Continuous Integration (CI) systems (eg. Jenkins, Gitlab CI)]()

[CLOUD architect certifications]()

[KUBERNETES Certification]()

[OPENSHIFT]()

</details>
```
